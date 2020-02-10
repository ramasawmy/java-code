/**
 * 
 */
import java.math.*;
/**
 * @author Dell
 *
 */
public class Person {
	
	/*attribute*/
	private String nid;
	private String firstName;
	private String lastName;
	private String dob;
	private char gender;
	private double height;
	private double weight;
	
	/*constructor*/
	
	/**
	 * Default constructor
	 */
	public Person() {
		this.nid = null;
		this.firstName = null;
		this.lastName = null;
		this.dob = null;
		this.gender = '_';
		this.height = 0.0;
		this.weight = 0.0;
				
	}

	/**
	 * overloaded 2 parameter constructor
	 * @param dob of person
	 * @param weight of person
	 */
	 public Person(String dob,double weight) {
		 this.dob = dob;
		 this.weight = weight;
		 this.nid = null;
		 this.firstName = null;
		 this.lastName = null;
		 this.gender = '_';
		 this.height = 0.0;
	}
	
	/**
	 * 7 parameter constructor
	 * @param nid of person
	 * @param firstName of person
	 * @param lastName of person
	 * @param dob of person
	 * @param gender of person
	 * @param height of person
	 * @param weight of person
	 */
	 public Person(String nid, String firstName, String lastName, String dob, char gender, double height, double weight) {
		 this.nid = nid;
		 this.firstName = firstName;
		 this.lastName = lastName;
		 this.dob = dob;
		 this.gender = gender;
		 this.height = height;
		 this.weight = weight;
	 }
	 
	 /*behaviors*/
	 
	 /**
	  * @param first name and last name of a person
	  * @return full name
	  */
	 public String getName() {
		 return this.firstName + " " + this.lastName;
	 }
	 
	 
	 /**
	  * @param height of a person
	  * @param weight of person
	  * @return the BMI of a person
	  */
	 public double calculateBMI() {
		 return(this.weight/(Math.pow(this.height, 2)));
	 }
	 
	 
	  
	 
	 /*getters*/
	 
	    public String getNid() {
	    	return this.nid;
	    }
	    public String getFirstName() {
	    	return this.firstName;
	    }
	    public String getLastName() {
	    	return this.lastName;
	    }
	    public String getDOB() {
	    	return this.dob;
	    }
	    public char getGender() {
	    	return this.gender;
	    }
	    public double getHeight() {
	    	return this.height;
	    }
	    public double getWeight() {
	    	return this.weight;
	    }
	 
     	
	    /*setters*/
	    
	    public void setNid(String nid) {
	    	this.nid = nid;
	    }
	    public void setFirstName(String firstName) {
	    	this.firstName = firstName;
	    }
	    public void setLastName(String lastName) {
	    	this.lastName = lastName;
	    }
	    public void setDOB(String dob) {
	    	this.dob = dob;
	    }
	    public void setGender(char gender) {
	    	this.gender = gender;
	    }
	    public void setHeight(double height) {
	    	this.height = height;
	    }
	    public void setWeight(double weight) {
	    	this.weight = weight;
	    }
	    
	    
	    
	    /*to string no*/
	    public String toString() {
	    	return this.nid + " " + this.firstName + " " + this.lastName + " " + this.dob + " " + this.gender + " " +
	        this.height + " " + this.weight; 
	    }
 	
}
