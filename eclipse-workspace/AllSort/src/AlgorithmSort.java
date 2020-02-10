/**
 * 
 */
import java.util.Scanner;
/**
 * @author Dell
 *
 */
public class AlgorithmSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myKeyboard = new Scanner(System.in);
		
		int option;
		while (true) {
		System.out.print("what kind are sorting would you like.");
		System.out.print("If yes, press 1 else press 0 ");
		option = myKeyboard.nextInt();
		if(option == 0) {
			System.out.println("End of the program.");
			break;
		}
		
		int[] Choice = {1,2,3,4};
		
		System.out.println("Please enter a sorting?");
		System.out.println("1.Selection Sort.");
		System.out.println("2.Insertion Sort.");
		System.out.println("3.Bubble Sort.");
		System.out.println("4.Quick Sort.");
		System.out.println("Enter choice as 1,2,3,4 only");
		
		Scanner myKey = new Scanner(System.in);
		int choice = myKey.nextInt();
		
		Scanner Input = new Scanner(System.in);
		
		System.out.println("How many numbers do you want to enter:");
		int num = Input.nextInt();
		
		
		
		
		Input.close();
		
		if(choice == 1) 
			
			void Selectionsort(int array[]) 
		    { 
		        int n = array.length; 
		  
		        
		        for (int i = 0; i < n-1; i++) 
		        { 
		            
		            int min_idx = i; 
		            for (int j = i+1; j < n; j++) 
		                if (array[j] < array[min_idx]) 
		                    min_idx = j; 
		  
		             
		            int temp = array[min_idx]; 
		            array[min_idx] = array[i]; 
		            array[i] = temp; 
		        } 
		    } 
			
			void printSelectionsort(int array[]) 
		    { 
		        int n = array.length; 
		        for (int i=0; i<n; ++i) 
		            System.out.print(array[i]+" "); 
		        System.out.println(); 
		    }
		
		
		
		if(choice ==2) {
			
			Insertion ob1 = new Insertion();
			
			ob1.Sort(array);
			System.out.println("Insertion sort.");
			ob1.printArray(array);
		}
		
		
		if(choice ==3) {
			
			Bubble ob2 = new Bubble();
			
			ob2.Sort(array);
			System.out.print("Bubble sort.");
			ob2.printArray(array);
	    }
		
		
		
		if(choice ==4) {
			int n = array.length;
			
			Quick ob3 = new Quick();
			
			ob3.Sort(array, 0, n-1);
			System.out.println("Quick sort.");
			ob3.printArray(array);
	    }
		
	    System.out.println("Do you want to try again?");
		
		
   }
 
  }
  
}
