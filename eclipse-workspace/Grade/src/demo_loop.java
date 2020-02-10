/**
 * 
 */
		import java.util.Scanner;
/**
 * @author Dell
 *
 */
public class demo_loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myKeyboard = new Scanner(System.in);
		
		double[] marks;
		double totalmark=0.0, averagemark=0.0;
		int numofstudent=0;
		
		
		System.out.print("how many student are there in the class?");
		numofstudent = myKeyboard.nextInt();
		
		marks = new double[numofstudent];
		
		for(int i = 0; i<marks.length; i++) {
			
	    System.out.print("mark of student"+ i+1 +":");
	    
	    marks[i] = myKeyboard.nextDouble();
	    
	    totalmark += marks[i];
	    
	    averagemark =  totalmark/numofstudent;
	    		
	    
	    
	    
	    
	    
		}
		
		
		
		
		
				
		
		
	}

}
