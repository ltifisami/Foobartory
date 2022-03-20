package sid.sl.Foobartory.Metier;

import sid.sl.Foobartory.Metier.Action;
import sid.sl.Foobartory.Model.Entrepots;



public class ActionManagement implements IActionManagement {
	
	
	 public synchronized IAction chooseAction(Entrepots entrepots) {
		 Action action = new Action();
	        if (entrepots.getEuros() >= 3 && entrepots.getListFoo().size() < 6) {
	            action.fooAction( entrepots);
	            return action;
	        }
	        if (entrepots.getListFooBar().size() >= 5) {
	        	action.sellFooBarAction( entrepots);
	        	return action;
	        }
	        if (entrepots.getEuros() >= 3 && entrepots.getListFoo().size() >= 6) {
	        	action.BuyRobotAction( entrepots);
	        	return action;
	        }
	        if (entrepots.getListFoo().size() == 0) {
	        	
	           action.fooAction( entrepots);
	           return action;
	        }
	        if (entrepots.getListBar().size() < 1) {
	        	 action.barAction( entrepots);
	        	 return action;
	        }
	        if (entrepots.getListFoo().size() > 1 && entrepots.getListBar().size() >=1 )
	        {
	        	action.assemblerAction( entrepots);
	        	return action;
	        }
	         action.fooAction( entrepots);
	         return action;
	    }
	 
	 

}
