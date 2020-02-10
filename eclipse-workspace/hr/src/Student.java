/**
 * 
 */

/**
 * @author Dell
 *
 */
public class Student extends Person {
	
	// define attribute
	
	private String sid;
	private String course;
	private String responsibleParty;

	/**
	 * default constructor
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 7 args overloaded constructor
	 * @param nid
	 * @param name
	 * @param height
	 * @param weight
	 * @param sid
	 * @param course
	 * @param responsibleParty
	 */
	public Student(String nid, String name, double height, double weight, String sid, String course, String responsibleParty) {
		super(nid, name, height, weight);
		// TODO Auto-generated constructor stub
		this.sid = sid;
		this.course = course;
		this.responsibleParty = responsibleParty;
	}

	/**
	 * @return the sid
	 */
	public String getSid() {
		return sid;
	}

	/**
	 * @param sid the sid to set
	 */
	public void setSid(String sid) {
		this.sid = sid;
	}

	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}

	/**
	 * @return the responsibleParty
	 */
	public String getResponsibleParty() {
		return responsibleParty;
	}

	/**
	 * @param responsibleParty the responsibleParty to set
	 */
	public void setResponsibleParty(String responsibleParty) {
		this.responsibleParty = responsibleParty;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This is a Student. Name:"+super.getName()+", NID: "+super.getNid()
		+ ", height; "+super.getHeight()+", weight: "+super.getWeight()
		+ ", student ID:" +this.getSid()+", course:"+this.getCourse()
		+ ", responsible party: "+this.getResponsibleParty();
	}

	@Override
	public double calculateSalary(double hoursWorked, double rate) {
		// TODO Auto-generated method stub
		return 0.0;
	}
	
	

}
