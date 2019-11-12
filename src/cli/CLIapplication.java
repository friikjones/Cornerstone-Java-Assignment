package cli;

public class CLIapplication {
	public static void main(String[] arg0) {
		if(arg0.length > 0) {
			System.out.println(arg0.length);
		}else {
			System.out.println("No arguments");
		}
	}
}
