/**
 * 
 */

/**
 * @author Dell
 *
 */
public class Hr {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student jsmith = new Student("j123456789", "John Smith", 175.50, 100.50, "BDA1001", "Big Data Analysis", "John Donald");
		
		System.out.println(jsmith.calculateBMI());
		System.out.println(jsmith.getName()+" has a salary: "+jsmith.calculateSalary(0, 0));
		System.out.println(jsmith.toString());

	}

}
