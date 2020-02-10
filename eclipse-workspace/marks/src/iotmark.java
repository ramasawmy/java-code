/**
 * 
 */
import java.util.Scanner;
/**
 * @author Dell
 *
 */
public class iotmark {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner mykey = new Scanner(System.in);
        int iot = 0;
      		
        System.out.print("no of student?");
        iot = mykey.nextInt();
        
        double[][] iotDB = new double[iot][6];
        
        for(int i=0; i<iotDB.length; i++) {
        	System.out.print("Enter mark for student "+ (i+1)+"\n");
        	
        for(int j=0; j<iotDB[0].length; j++) {
        	System.out.print("\tEnter mark for module "+ (j+1));
        	
        	System.out.print(iotDB[i][j]);
        }
        }
        
        
        
     
		
		
		
		
		
		
		
		
		
	}

}
