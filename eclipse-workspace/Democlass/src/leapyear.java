/**
 * 
 */
import java.util.Scanner;
/**
 * @author Dell
 *
 */
public class leapyear {

	/**
	 * @param args
	 */	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year;
		
		System.out.print("Enter an year : ");
		Scanner sc = new Scanner(System.in);
	    year = sc.nextInt();
	    
	    if (year % 400 == 0)
	    { 	
	    	System.out.println("this year is a leap");
	    }	
	    	
	    else
	    {
	    	System.out.println("this is not a leap year");
	    }
	
	    
	    
	    if (year %100 == 0)
	    {
	    	System.out.println("this is not a leap year");
	    }
	
	    else
	    {
	    	System.out.println("this is a leap year");
	    }
	    
	    if (year %4 == 0)
	    {
	    	System.out.println("this is a leap year");
	    }
	    
	    else
	    {
	    	System.out.println("this is a leap year");
	    }
	   
	    
	    
	    
	    
	    
	    
	    
	    
	}
	
	

}
