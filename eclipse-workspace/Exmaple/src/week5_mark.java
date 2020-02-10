/**
 * 
 */
import java.util.Scanner;
/**
 * @author Dell
 *
 */
public class week5_mark {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myKeyboard = new Scanner(System.in);
		 
	    double marks, totalMarks = 0.0, averageMarks = 0.0;
	    int numOfmarks = 0;
	    
	    System.out.println("Enter a mark and press enter. To stop the progress press -1");
	     marks = myKeyboard.nextDouble();
		
		while(marks !=-1)	
			
		{
			totalMarks += marks;
			numOfmarks++;
			
			System.out.println("Enter a mark and press enter. To stop the progress press -1");
			marks = myKeyboard.nextDouble();
			
		}
		
		   averageMarks = totalMarks / numOfmarks;
		   System.out.println("Average is"+ averageMarks);
		   
		
		
	}

}
