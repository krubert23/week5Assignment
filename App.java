package week05;

public class App {

	public static void main(String [] args) {
		Logger logger = new AsteriskLogger();
		logger.log("I'm not good with tight spaces");
		logger.error("I'm in a tight space :(");
	
		System.out.println(" ");
		
		Logger log2 = new SpacedLogger();
		log2.log("I just need to breathe");
		log2.error("HYPERVENTALATING!");
	}
}
