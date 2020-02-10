/**
 * 
 */
package scannerdemo1;


/**
 * @author Dell
 *
 */
import java.util.Scanner ; // we need to import this class
public class name {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner student = new Scanner(System.in);
		
		System.out.println("Your name:");
		String name = student.next();
		
		System.out.println("Your age:");
		int age = student.nextInt();
		
		System.out.println("Welcome " + name );
		
		student.close();
	}

}
