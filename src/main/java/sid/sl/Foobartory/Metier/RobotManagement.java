package sid.sl.Foobartory.Metier;

import java.util.ArrayList;
import java.util.List;

public class RobotManagement implements IRobotManagement {

	private int nbRobots;
    private List<Robot> robots;
    long start;
    
    
    public RobotManagement(int nbRobots) {
        this.nbRobots = nbRobots;
        robots = new ArrayList<>();
    }
	@Override
	public void launchProductionLine() {
		// TODO Auto-generated method stub
		  start = System.currentTimeMillis();
	      launchRobots();
	}

	@Override
	public void launchRobots() {
		// TODO Auto-generated method stub
		 for (int i = 1; i <= nbRobots; i++) {
	            addRobotToProductionLine(i);
	        }
	}
	
	private void addRobotToProductionLine(int robotNumber) {
        Robot robot = new Robot(robotNumber, this);
        robots.add(robot);
        robot.start();
    }

	@Override
	public void buyAndAddRobot() {
		// TODO Auto-generated method stub
		nbRobots++;
        ProductionLine.printBuyRobot(nbRobots);
        if (nbRobots < 30) {
            addRobotToProductionLine(nbRobots);
        } else {
            stopProductionLine();
        }
	}
	
	private void stopProductionLine() {
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        stopRobots();
        ProductionLine.endOfProduction(timeElapsed);
        System.exit(0);
    }

    private void stopRobots() {
        for (Robot robot : robots) {
            robot.interrupt();
        }
    }

}
