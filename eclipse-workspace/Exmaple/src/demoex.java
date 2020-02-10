/**
 * 
 */
import java.util.Scanner;
/**
 * @author Dell
 *
 */
public class demoex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myKeyboard = new Scanner(System.in);
		
		int age; 
		boolean valid;
		do
		{
			System.out.println("How old are you?");
			age = myKeyboard.nextInt();
			valid = (age > 0) && (age < 125);
			
			if(!valid)
			   System.out.println("error! try again!");
				
		}
		
		while(!valid);
		
	}

}
