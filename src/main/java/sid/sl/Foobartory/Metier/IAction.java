package sid.sl.Foobartory.Metier;

import sid.sl.Foobartory.Model.ActionType;
import sid.sl.Foobartory.Model.Entrepots;

public interface IAction {
	
	
	public Entrepots fooAction(Entrepots entrepots);
	
	public Entrepots barAction(Entrepots entrepots);
	
	public Entrepots assemblerAction(Entrepots entrepots);

	public Entrepots sellFooBarAction(Entrepots entrepots);
	
	public Entrepots BuyRobotAction(Entrepots entrepots);
	
	public boolean assembleFoobarIsSuccess(int pourcentage);
	
    public int getRandomTime();
    
    public ActionType getActionType();
}
