package Week5_Coding_Assignment;

public class App {

	public static void main(String[] args) {

	Logger asteriskLogger = new AsteriskLogger();
	Logger spacedLogger = new SpacedLogger();	

	asteriskLogger.log("Willow");
	asteriskLogger.error("Sorry please try again");
		
	System.out.println();
	spacedLogger.error("Willow");
	spacedLogger.log("Willow");
	}
}