package sid.sl.Foobartory.Metier;



import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import sid.sl.Foobartory.Model.ActionType;
import sid.sl.Foobartory.Model.Entrepots;


public class Robot implements Runnable ,IRobot{

	
	private Thread worker;
    int number;
    
    IRobotManagement robotManagement;
    IAction action ;
    IActionManagement actionManagement ;
    
    private AtomicBoolean running = new AtomicBoolean(false);
    
   
    public Robot(int number, IRobotManagement robotManagement) {
        this.number = number;
        this.robotManagement = robotManagement;
    }
	
	
	public void start() {
        worker = new Thread(this);
        worker.start();
    }

    public void interrupt() {
        running.set(false);
        worker.interrupt();
    }

    public boolean isRunning() {
        return running.get();
    }

    @Override
    public void run() {
        running.set(true);
        Entrepots entrepots = new Entrepots( 0,new ArrayList<>(), new ArrayList<>(),new ArrayList<>() );
        while (running.get()) {
        	
        	
          action=   new ActionManagement().chooseAction(entrepots);
          if (action.getActionType().equals(ActionType.BUY_ROBOT)) 
          {
              robotManagement.buyAndAddRobot();
          }
          ProductionLine.printAction(this, action, entrepots);
          this.takeTimeAndExecuteAction(action) ;
        }
    }

    public void takeTimeAndExecuteAction(IAction action) {
        try {
            Thread.sleep(action.getRandomTime());
        } catch (InterruptedException e) {
            ProductionLine.robotInterrupted(this);
        }
    }

    

    @Override
    public String toString() {
        return "Robot{" +
                "number=" + number +
                '}';
    }


	
	
	
}
