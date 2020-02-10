/**
 * 
 */
import java.util.Scanner;
/**
 * @author Dell
 *
 */
public class dimenson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myKeyboard = new Scanner(System.in);
		
		double total = 0;
		int agecount[];
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int count7 = 0;
		int count8 = 0;
		int count9 = 0;
		int count10 = 0;
		
		
		System.out.println("please enter num of child:");
		int age = myKeyboard.nextInt();
		
		agecount = new int[age];
		
		for(int i=0; i<agecount.length; i++) {
			System.out.println("the age a child" + (i+1) + "is:");
			agecount[i] = myKeyboard.nextInt();
			total += agecount[i] ;
			
			if(agecount[i]==0) {
				count0 +=1;
			}
		
	        if(agecount[i]==1) {
	        	count1 +=1;
	        }
		    if(agecount[i]==2) {
		    	count2 +=1;
		    }
		    if(agecount[i]==3) {
			count3 +=1;
		    }
		    if(agecount[i]==4) {
			   count4 +=1;
		    }
		    if(agecount[i]==5) {
			   count5 +=1;
		    }
		    if(agecount[i]==6) {
		    	count6 +=1;
		    }
            if(agecount[i]==7) {
            	count7 +=1;
            }
		    if(agecount[i]==8) {
		    	count8 +=1;
		    }
		    if(agecount[i]==9) {
		    	count9 +=1;
		    }
		    if(agecount[i]==10) {
		    	count10 +=1;
		    }
		    System.out.println(total);
		    System.out.println(count0);
		    System.out.println(count1);
		    System.out.println(count2);
		    System.out.println(count3);
		    System.out.println(count4);
		    System.out.println(count5);
		    System.out.println(count6);
		    System.out.println(count7);
		    System.out.println(count8);
		    System.out.println(count9);
		    System.out.println(count10);
	}
  }
}
