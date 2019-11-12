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
	private String string1, string2, string3;
	private int stringInt;
	
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
		System.out.println("--------------------------------");
		System.out.println("Testing substring method");
		string1 = "This is the full string";
		string2 = "full string";
		System.out.println("String1: "+ string1+ ", String2: "+string2);
		System.out.println("First test: " + isSubstringThere(string1, string2));
		string2 = "substring";
		System.out.println("String1: "+ string1+ ", String2: "+string2);
		System.out.println("Second test: " + isSubstringThere(string1, string2));
		
		//remove character method
		System.out.println("--------------------------------");
		System.out.println("Testing remove character method");
		string1 = "This is the full string";
		stringInt = 15;
		System.out.println("String: "+string1+ ", int: "+stringInt);
		System.out.println("First test: " + removeCharFromString(string1, stringInt));
		stringInt = 20;
		System.out.println("String: "+string1+ ", int: "+stringInt);
		System.out.println("Second test: " + removeCharFromString(string1, stringInt));
		
		//replace string method
		System.out.println("--------------------------------");
		System.out.println("Testing replace string method");
		string1 = "This is the base string";
		string2 = "base";
		string3 = "replaced";
		System.out.println("Base: "+string1+" , target: "+string2+", replacement: "+string3);
		System.out.println("First test: "+ replaceStringInside(string1, string2, string3));
		string2 = " is";
		string3 = " was";
		System.out.println("Base: "+string1+" , target: "+string2+", replacement: "+string3);
		System.out.println("Second test: "+ replaceStringInside(string1, string2, string3));
		
		//reverse string method
		System.out.println("--------------------------------");
		System.out.println("Testing reverse string method");
		string1 = "This is the base string";
		System.out.println("Base: "+ string1);
		System.out.println("First test: "+reverseString(string1));
		string1 = "This is the second base string";
		System.out.println("Base: "+ string1);
		System.out.println("Second test: "+reverseString(string1));
				
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
	
	public String removeCharFromString(String string, int i) {
		String output;
		String[] splicedStrings = new String[2];
		splicedStrings[0] = string.substring(0, i-1);
		splicedStrings[1] = string.substring(i, string.length());
		output = splicedStrings[0] + splicedStrings[1];

		return output;
	}
	
	public String replaceStringInside(String input, String target, String replacement) {
		String output;
		output = input.replace(target, replacement);
		return output;
	}
	
	public String reverseString(String input) {
		String output;
		output = "";
		for (int i = 1; i <= input.length(); i++) {
			output += input.charAt(input.length()-i);
		}
		return output;
	}


}
