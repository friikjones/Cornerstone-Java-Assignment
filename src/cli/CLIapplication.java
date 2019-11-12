package cli;


/**
 * 
 * This is the application for the java CLI assigment
 * @author Daniel
 * 
 */
public class CLIapplication {
	
	//Class variables
	private String varString;
	private int varInt;
	private String varString2;
	private final String finalString = "final value";
	private int varInt2;
	private String string1, string2;
	
	/**
	 * This is the entry point of the program
	 * @param arg0
	 */
	public static void main(String[] arg0) {
		CLIapplication app = new CLIapplication();
		System.out.println("================ Methods from 1a ====================");
		app.method1a(arg0);
		System.out.println("================ Methods from 1b ====================");
		app.method1b(arg0);
		
	}
	
	public void method1a(String[] arg0) {
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
		
		System.out.println(finalString);
		
		varInt2 = 5;
		varInt += varInt2;
		System.out.println(varInt);	
	}
	
	public void method1b(String[] arg0) {
		//Compare method
		System.out.println("Testing method compare");
		string1 = string2 = "True";
		System.out.println("String1: "+ string1+ ", String2: "+string2);
		System.out.println("First test: " + isEqualString(string1, string2));
		string1 = "False";
		System.out.println("String1: "+ string1+ ", String2: "+string2);
		System.out.println("Second test: " + isEqualString(string1, string2));
		
		//substring method
		System.out.println("Testing substring method");
		string1 = "This is the full string";
		string2 = "full string";
		System.out.println("String1: "+ string1+ ", String2: "+string2);
		System.out.println("First test: " + isSubstringThere(string1, string2));
		string2 = "substring";
		System.out.println("String1: "+ string1+ ", String2: "+string2);
		System.out.println("Second test: " + isSubstringThere(string1, string2));
		
	}

	public boolean isEqualString(String string1, String string2) {
		boolean output;
		output = (string1.equals(string2));
		return output;
	}
	
	public boolean isSubstringThere(String string, String subString) {
		boolean output;
		output = (string.lastIndexOf(subString) >= 0);
		return output;
	}



}
