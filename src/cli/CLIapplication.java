package cli;

import jdk.internal.util.xml.impl.Input;

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
	private int stringInt, stringInt2, stringInt3, stringInt4;
	private String[] stringArray;

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

		//search for word method
		System.out.println("--------------------------------");
		System.out.println("Testing search for word method");
		string1 = "This is the base string";
		string2 = "base";
		System.out.println("Base: "+ string1+", input: "+string2);
		System.out.println("First test: "+searchForWord(string1,string2));
		string2 = "string";
		System.out.println("Base: "+ string1+", input: "+string2);
		System.out.println("Second test: "+searchForWord(string1,string2));

		//split string method
		System.out.println("--------------------------------");
		System.out.println("Testing split string method");
		string1 = "This is the base string";
		stringInt = 4;
		stringArray = new String[stringInt];
		System.out.println("Base: "+string1+", amount: "+stringInt);
		stringArray = splitString(string1, stringInt);
		System.out.print("First test: ");
		for (String string : stringArray) {
			System.out.print(string+ "/");
		}
		System.out.println();
		string1 = "This is the second string for testing the method";
		stringInt = 7;
		stringArray = new String[stringInt];
		System.out.println("Base: "+string1+", amount: "+stringInt);
		stringArray = splitString(string1, stringInt);
		System.out.print("Second test: ");
		for (String string : stringArray) {
			System.out.print(string+ "/");
		}
		System.out.println();

		//uppercase method
		System.out.println("--------------------------------");
		System.out.println("Testing uppercase method");
		string1 = "This is the base string";
		System.out.println("Base: "+string1);
		System.out.println("First test: "+ toUpperCase(string1));
		string1 = "This is the base string fo the second test";
		System.out.println("Base: "+string1);
		System.out.println("Second test: "+ toUpperCase(string1));

		//lowercase method
		System.out.println("--------------------------------");
		System.out.println("Testing lowercase method");
		string1 = "This is the base string";
		System.out.println("Base: "+string1);
		System.out.println("First test: "+ toLowerCase(string1));
		string1 = "This is the base string fo the second test";
		System.out.println("Base: "+string1);
		System.out.println("Second test: "+ toLowerCase(string1));

		//match strings method
		System.out.println("--------------------------------");
		System.out.println("Testing match strings method");
		string1 = "This is the base string";
		string2 = "This is the differend string";
		stringInt = stringInt3 = 0;
		stringInt2 = stringInt4 = 11;
		System.out.println("Base: "+string1+" ["+stringInt+"-"+stringInt2+"], Compare: "+string2+" ["+stringInt3+"-"+stringInt4+"]");
		System.out.println("First test: "+matchStrings(string1, stringInt, stringInt2, string2, stringInt3, stringInt4));
		stringInt = stringInt3 = 12;
		stringInt2 = stringInt4 = 20;
		System.out.println("Base: "+string1+" ["+stringInt+"-"+stringInt2+"], Compare: "+string2+" ["+stringInt3+"-"+stringInt4+"]");
		System.out.println("First test: "+matchStrings(string1, stringInt, stringInt2, string2, stringInt3, stringInt4));
		
		

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

	public int searchForWord(String input, String target) {
		int output;
		output = input.indexOf(target);
		return output;
	}

	public String[] splitString(String input, int amount) {
		String[] outputStrings = new String[amount];
		String auxString = input;
		int step = (input.length()/amount);
		if ((input.length()%amount)!=0) {
			step++;
		}
		for (int i = 0; i < amount-1; i++) {
			outputStrings[i] = auxString.substring(step*i,step*(i+1));	
		}
		outputStrings[amount-1] = auxString.substring(step*(amount-1));
		return outputStrings;
	}

	public String toUpperCase(String input) {
		return input.toUpperCase();
	}

	public String toLowerCase(String input) {
		return input.toLowerCase();
	}
	
	public boolean matchStrings(String string1, int start1, int end1 , String string2, int start2, int end2) {
		boolean output;
		String aux1 = string1.substring(start1, end1);
		String aux2 = string2.substring(start2,end2);
		output = (aux1.equals(aux2));
		return output;
	}

}
