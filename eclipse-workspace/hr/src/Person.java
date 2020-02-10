/**
 * 
 */
import java.math.*;
/**
 * @author Dell
 *
 */
public abstract class Person {
	
	/*attribute*/
	private String nid;
	private String name;
	private double height;
	private double weight;
	
	
	/**
	 * default constructor
	 */
	public Person() {
		super();
	}


	/**
	 * overloaded 4 parameter 
	 * @param nid
	 * @param name
	 * @param height
	 * @param weight
	 */
	public Person(String nid, String name, double height, double weight) {
		super();
		this.nid = nid;
		this.name = name;
		this.height = height;
		this.weight = weight;
	}


	/**
	 * @return the nid
	 */
	public String getNid() {
		return nid;
	}


	/**
	 * @param nid the nid to set
	 */
	public void setNid(String nid) {
		this.nid = nid;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}


	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}


	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}


	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	/**
	  * @param height of a person
	  * @param weight of person
	  * @return the BMI of a person
	  */
	 public double calculateBMI() {
		 return(this.weight/(Math.pow(height/100, 2)));
	}
	
	public boolean equals(Person p) {
		if(this.nid.equalsIgnoreCase(p.nid)) {
			return true;
		}
		else {
			return false;
		}

	}
	
	@Override
	/**
	 * 
	 */
	public abstract String toString();
	
	
	/**
	 * calculate salary of a person hoursWorked * rate
	 * @param hoursWorked
	 * @param rate
	 * @return
	 */
	public abstract double calculateSalary(double hoursWorked, double rate);
	
	
}
