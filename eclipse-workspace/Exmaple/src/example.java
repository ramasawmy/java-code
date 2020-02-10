/**
 * 
 */
import java.util.Scanner;
/**
 * @author Dell
 *
 */
public class example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myKeyboard = new Scanner(System.in);
	
		char romanNumeral  ;
		int decValue = 0;
		
		System.out.println("Please enter a roman numeral :");
		
		romanNumeral = myKeyboard.next().charAt(0); // read a char from scanner
		
		switch(romanNumeral)
		{
		
		case 'I':
			     decValue = 1;
		         break;
		case 'V': 
			     decValue = 5;
		         break;
		case 'X': 
			     decValue = 10;
		         break;
		case 'L': 
			     decValue = 50;
		         break;
		case 'C': 
			     decValue = 100;
		         break;
		
		default: System.out.println( "It is not a Roman numeral<= 100 ");
		
		}
		
		System.out.println("the roman character "+romanNumeral+" is witten as "+decValue);
		
		
		
		
	}

}
