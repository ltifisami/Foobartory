package sid.sl.Foobartory;



import sid.sl.Foobartory.Metier.IRobotManagement;
import sid.sl.Foobartory.Metier.Robot;
import sid.sl.Foobartory.Metier.RobotManagement;


public class FoobartoryApplication {

	public static void main(String[] args) {
		
		
		IRobotManagement robotManagement = new RobotManagement(2);
		Robot robot = new Robot(2,robotManagement);
		robot.start();
		
	}

}
