package sid.sl.Foobartory.Metier;


import sid.sl.Foobartory.Model.Entrepots;



public class ProductionLine {
   


    public static void printAction(Robot robot, IAction action, Entrepots entrepots) {
    	
   	System.out.println(robot.toString() + " is executing action " + action.getActionType());
    		 
    }
   
    

    public static void printAssembleFoobarResult(boolean isSuccess) {
        if (isSuccess) {
        	System.out.println("Assemle Foobar SUCCESS");
        } else {
        	System.out.println("Assemle Foobar FAILURE");

        }
    }

    public static void printBuyRobot(int nbRobots) {
    	System.out.println("New Robot bought, " + nbRobots + " robots availables");
    }

    public static void endOfProduction(long elapsedTime) {
    	System.out.println("\n**************************************************************************\n " +
                "***** END OF PRODUCTION *****\n"
                + "**************************************************************************\n ");
    }

    public static void robotInterrupted(Robot robot) {
    	System.out.println("****  " + robot.toString() + " was interrupted when finishing his job  ****");
    }
}