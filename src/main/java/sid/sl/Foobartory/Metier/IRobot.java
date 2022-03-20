package sid.sl.Foobartory.Metier;



public interface IRobot {
	
	public void start() ;

    public void interrupt() ;

    public boolean isRunning() ;
    
    public void takeTimeAndExecuteAction(IAction action) ;
    


}
