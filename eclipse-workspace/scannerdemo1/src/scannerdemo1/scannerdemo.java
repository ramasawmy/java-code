/**
 * 
 */
package scannerdemo1;

/**
 * @author Dell
 *
 */ 
import java.util.Scanner ; // we need to import this class

public class scannerdemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the number of pods followed by");
		System.out.println("the number of peas in a pod:");
		
		int numberOfPods = keyboard.nextInt();
		int peasPerPod = keyboard.nextInt();
		
		int totalNumberOfPeas = numberOfPods*peasPerPod;
		
		System.out.print(numberOfPods + " pods and ");
		System.out.println(peasPerPod + " peas per pod.");
		System.out.println("The total number of peas = " + totalNumberOfPeas);
		
		keyboard.close();	
	}

}
