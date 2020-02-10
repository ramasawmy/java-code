/**
 * 
 */
import java.util.Scanner;
/**
 * @author Dell
 *
 */
public class Testmystudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String inputStudentName,inputStudentAddress;
		int inputStudentID;
		char inputStudentGender;
		
		/* create a student object*/
		mystudent s1= new mystudent();
		
	
	    Scanner myScanner = new Scanner(System.in);
		
		
		/*student 1*/
		System.out.println("enter name of student 1: ");
		inputStudentName = myScanner.next();
		
		System.out.println("enter studentID of student 1: ");
		inputStudentID = myScanner.nextInt();
		
		System.out.println("enter address of student 1: ");
		inputStudentAddress = myScanner.next();
		
		System.out.println("enter gender of student 1: ");
		inputStudentGender = myScanner.next().charAt(0);
		
		
		/*ask user input for address,studentID,gender*/
		
		
		/* set the attribute student s1*/
        s1.setName(inputStudentName);
		s1.setStudentID(inputStudentID);
		s1.setAddress(inputStudentAddress);
		s1.setGender(inputStudentGender);
		
		
		
		/*display detail of student 1*/
		System.out.println("Name of student 1: "+ s1.getName());
		System.out.println("studentID of the student 1: "+ s1.getStudentID());
		System.out.println("address of student 1: "+ s1.getAddress());
		System.out.println("gender of student 1: "+ s1.getGender());
		
		System.out.println("Full record of student 1: "+ s1.toString());
		
		
		/*create student 2 object*/
		mystudent s2 = new mystudent();
		
		
		
		/*student 2*/
		System.out.println("enter name of student 2: ");
		inputStudentName = myScanner.next();
		
		System.out.println("enter studentID of student 2: ");
		inputStudentID = myScanner.nextInt();
		
		System.out.println("enter address of student 2: ");
		inputStudentAddress = myScanner.next();
		
		System.out.println("enter gender of student 2: ");
		inputStudentGender = myScanner.next().charAt(0);
		
		/* set the attribute student s2*/
        s2.setName(inputStudentName);
		s2.setStudentID(inputStudentID);
		s2.setAddress(inputStudentAddress);
		s2.setGender(inputStudentGender);
		
		/*display detail of student 2*/
		System.out.println("Name of student 2: "+ s2.getName());
		System.out.println("studentID of the student 2: "+ s2.getStudentID());
		System.out.println("address of student 2: "+ s2.getAddress());
		System.out.println("gender of student 2: "+ s2.getGender());
		
		System.out.println("Full record of student 2: "+ s2.toString());
		
		
		/*ask user to input for name,add,studentID,gender*/
		System.out.println("enter name of student 4: ");
		inputStudentName = myScanner.next();
		
		System.out.println("enter studentID of student 4: ");
		inputStudentID = myScanner.nextInt();
		
		System.out.println("enter address of student 4: ");
		inputStudentAddress = myScanner.next();
		
		System.out.println("enter gender of student 4: ");
		inputStudentGender = myScanner.next().charAt(0);
		
		mystudent s4 = new mystudent(inputStudentName, inputStudentID, inputStudentAddress, inputStudentGender);
		
		System.out.println(s4.toString()); /*display the record of s4*/
		
		
		/* student not yet assigned a studentID*/
	    mystudent s5 = new mystudent("Conor", "Skynet", 'F');
	    System.out.println(s5);
	    
		
		
		
		
		
		
		
		
		
	}

}
