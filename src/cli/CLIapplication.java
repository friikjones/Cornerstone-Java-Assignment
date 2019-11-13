package cli;

import java.util.Date;
import java.util.Locale;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

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
	private Locale locale;
	private String bufferString;

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

		//performance method
		System.out.println("--------------------------------");
		System.out.println("Testing performance method");
		string1 = "This is the base string";
		stringInt = 1000000;
		System.out.println("Base: "+string1+", iterations: "+ stringInt);
		System.out.println("First test: "+comparePerformance(string1,stringInt)+" miliseconds");
		string1 = "This is the second base string and it is longer";
		System.out.println("Base: "+string1+", iterations: "+ stringInt);
		System.out.println("Second test: "+comparePerformance(string1,stringInt)+" miliseconds");

		//performance internal method
		System.out.println("--------------------------------");
		System.out.println("Testing performance internal method");
		string1 = "This is the base string";
		stringInt = 100000;
		System.out.println("Base: "+string1+", iterations: "+ stringInt);
		System.out.println("First test: "+comparePerformanceInternal(string1,stringInt)+" miliseconds");
		string1 = "This is the second base string and it is longer";
		System.out.println("Base: "+string1+", iterations: "+ stringInt);
		System.out.println("Second test: "+comparePerformanceInternal(string1,stringInt)+" miliseconds");

		//formatter method
		System.out.println("--------------------------------");
		System.out.println("Testing formatter method");
		locale = locale.US;
		System.out.println("Locale: "+locale);
		System.out.println("First test: "+ formatTime(locale));
		locale = locale.ITALY;
		System.out.println("Locale: "+locale);
		System.out.println("Second test: "+ formatTime(locale));
	
		//concat string method
		System.out.println("--------------------------------");
		System.out.println("Testing concat method");
		string1 = "This is the base string";
		string2 = " and this is the complement";
		System.out.println("Base: '"+string1+"', complement: '"+ string2+"'");
		System.out.println("First test: "+concatString(string1, string2));
		string1 = "This is the new base string";
		string2 = " and this is the new complement";
		System.out.println("Base: '"+string1+"', complement: '"+ string2+"'");
		System.out.println("Second test: "+concatString(string1, string2));
		
		//unicode from string method
		System.out.println("--------------------------------");
		System.out.println("Testing unicode from string method");
		string1 = "This is the base string";
		stringInt = 10;
		System.out.println("Base: "+string1+", position: "+stringInt);
		System.out.println("First test: 0x"+unicodeFromString(string1, stringInt));
		stringInt = 13;
		System.out.println("Base: "+string1+", position: "+stringInt);
		System.out.println("Second test: 0x"+unicodeFromString(string1, stringInt));
		
		//buffer control methods
		System.out.println("--------------------------------");
		System.out.println("Testing buffer control methods");
		bufferClear();
		System.out.println("Current buffer: '"+bufferGet()+"'");
		string1 = "Adding this to buffer";
		string2 = " and also this";
		System.out.println("Adding to buffer: '"+string1+"' and '"+string2+"'" );
		bufferAdd(string1);
		bufferAdd(string2);
		System.out.println("Current buffer: '"+bufferGet()+"'");
		string1 = ", this too";
		string2 = ", and finally this";
		System.out.println("Adding to buffer: '"+string1+"' and '"+string2+"'" );
		bufferAdd(string1);
		bufferAdd(string2);
		System.out.println("Current buffer: '"+bufferGet()+"'");
		System.out.println("Clearing buffer");
		bufferClear();
		System.out.println("Current buffer: '"+bufferGet()+"'");
		
		
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

	public long comparePerformance(String input, double iterations) {
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < iterations; i++) {
			String s1 = input; 
		}
		long endTime = System.currentTimeMillis();
		long firstDif = endTime-startTime;

		startTime = System.currentTimeMillis();
		for(int i = 0; i < iterations; i++) {
			String s2 = new String(input);
		}
		endTime = System.currentTimeMillis();
		long secondDif = endTime - startTime;
		return secondDif - firstDif;
	}

	public long comparePerformanceInternal(String input, int iterations) {
		String variables[] = new String[iterations];

		long startTime = System.currentTimeMillis();
		for(int i = 0; i < iterations; i++) {
			variables[i] = input; 
		}
		long endTime = System.currentTimeMillis();
		long firstDif = endTime-startTime;

		startTime = System.currentTimeMillis();
		for(int i = 0; i < iterations; i++) {
			variables[i] = input;
			variables[i] = variables[i].intern(); 
		}
		endTime = System.currentTimeMillis();
		long secondDif = endTime - startTime;
		return secondDif - firstDif;
	}
	
	public String formatTime(Locale local) {
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, local);
		String output = df.format(new Date());
		return output;
	}
	
	public String concatString(String string1, String string2) {
		String output = string1 + string2;
		return output;
	}
	
	public String unicodeFromString(String input, int position) {
		String output = Integer.toHexString(input.codePointBefore(position));
		return output;	
	}
	
	public void bufferClear() {
		bufferString = "";
	}
	
	public void bufferAdd(String input) {
		bufferString += input;
	}
	public String bufferGet() {
		return bufferString;
	}

}
