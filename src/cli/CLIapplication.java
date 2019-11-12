package cli;
/**
 * 
 * This is the application for the java CLI assigment
 * @author Daniel
 * 
 */
public class CLIapplication {
	
	//Class variables
	private static String varString;
	private static int varInt;
	private static String varString2;
	
	/**
	 * This is the entry point of the program
	 * @param arg0
	 */
	public static void main(String[] arg0) {
		if(arg0.length > 0) {
			System.out.println(arg0.length);
			for (int i = 0; i < arg0.length; i++) {
				System.out.println("Argument "+i+": "+arg0[i]);
			}
		}else {
			System.out.println("No arguments");
		}
		varString = "initial value";
		System.out.println(varString);
		varInt = 10;
		System.out.println(varInt);
		
		varString = "overwrited value";
		System.out.println(varString);
		
		varString2 = varString;
		System.out.println(varString2);
		
	}
}
