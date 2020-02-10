/**
 * 
 */
import java.util.Scanner;
/**
 * @author Dell
 *
 */
public class demograde {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myKeyboard = new Scanner(System.in);
		
		
		int grade, category;
		
		    System.out.println("Enter a grade (0 to 100):");
		
		grade = myKeyboard.nextInt();
		     
		      category = grade / 10;
		
		      if (category >=9 && category<=10)
		      {
		    	System.out.println("Excellent");
		      }
		      
		      else if (category >=8 &&  category<9)
		      {
		    	  System.out.println("nice job");
		      }
		      else if (category >=7 && category<8)
		      {
		    	  System.out.println("average");	
		      }
		      else  if (category >=6 && category<7)
		      {
		    	  System.out.println("below average");	
		      }
		      
		      else
		      {
		    	  System.out.println("problem");
		      }
		      
	}
		            
}

		      
		      

		
		
		
		
		
		
	


