/* 
 * This Program Calculates and Displays Pay Check Amount 
 * Brad Klucas 11/27/18
 */
import java.text.*;
import java.util.*;

public class CP1PayRoll {

	//declare vars
	
	static String iString; //generic input string
	static String iFirstName, iLastName; //first and last name vars
	static int iHrs; //hrs after conversion
	static double iRate; //rate after conversion
	static double cPayCheck; //calc'd pay
	static String oPayCheck; //pay after formatting
	static Scanner myScanner; //input device
	static NumberFormat nf; //used format currency
	
	
	public static void main(String[] args) {
		//call init
		init();
		
		//call input
		input();
		
		//call calcs
		calcs();
		
		//call output
		output();
		
		System.out.println("Program Successfully Completed");

	}

	public static void init() {

		//set scanner to console
		myScanner = new Scanner(System.in);
		
		//change delimiter from blank space to enter key
		//to allow spaces in strings
		myScanner.useDelimiter(System.getProperty("line.separator"));
		
		//set formatter to use U.S. currency format
		nf = NumberFormat.getCurrencyInstance(java.util.Locale.US);

	}
	
	public static void input() {

		//prompt for first name
		System.out.print("Enter First Name: ");
		iFirstName = myScanner.next(); //get iFirstName
		
		System.out.print("Enter Last Name: ");
		iLastName = myScanner.next(); //get iLastName
		
		System.out.print("Enter Hours: ");
		iString = myScanner.next(); //using the generic var iString because it is a reusable tool for conversion (instead of iHrs AND cHrs)
		iHrs = Integer.parseInt(iString);//get iHrs by converting iString
		
		System.out.print("Enter Rate: ");
		iString = myScanner.next(); 
		iRate = Double.parseDouble(iString); //get iRate by converting iString
	}
	
	public static void calcs() {

		//calculate pay
		cPayCheck = iHrs * iRate;
		

	}
	
	public static void output() {
		
		//display name as last, first
		System.out.println("Name: " + iLastName + ", " + iFirstName);
		//format and output pay
		oPayCheck = nf.format(cPayCheck); //NOTE*** ".format" is a string, thus oPayCheck must also be a string 
		System.out.println("Pay is: " + oPayCheck); 
	}
}
