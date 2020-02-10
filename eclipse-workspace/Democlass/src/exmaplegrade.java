/**
 * 
 */
import java.util.Scanner;
/**
 * @author Dell
 *
 */
public class exmaplegrade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int grade;
		
		
		Scanner myKeybaord = new Scanner(System.in);
		
		System.out.print("what is your grade? ");
		
		grade =myKeybaord.nextInt();
		
		if (grade >= 80) 
			System.out.println("congratulation");
		else
			System.out.println("you can do better");
		    System.out.println("make sure you pratice");
		    
       System.out.println("bye Bye"); 
       
			
       
		
		
	}

}
