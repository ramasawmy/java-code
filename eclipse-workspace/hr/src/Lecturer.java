/**
 * 
 */

/**
 * @author Dell
 *
 */
public class Lecturer extends Person {
	
	private String speciality;
	private String academia;
	private double hoursWork;
	private double rate;
	

	/**
	 * default constructor
	 */
	public Lecturer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param nid
	 * @param name
	 * @param height
	 * @param weight
	 * @param speciality
	 * @param academia
	 * @param hoursWork
	 * @param rate
	 */
	public Lecturer(String nid, String name, double height, double weight, String speciality, String academia, double hoursWork, double rate) {
		super(nid, name, height, weight);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the speciality
	 */
	public String getSpeciality() {
		return speciality;
	}

	/**
	 * @param speciality the speciality to set
	 */
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	/**
	 * @return the academia
	 */
	public String getAcademia() {
		return academia;
	}

	/**
	 * @param academia the academia to set
	 */
	public void setAcademia(String academia) {
		this.academia = academia;
	}

	/**
	 * @return the hoursWork
	 */
	public double getHoursWork() {
		return hoursWork;
	}

	/**
	 * @param hoursWork the hoursWork to set
	 */
	public void setHoursWork(double hoursWork) {
		this.hoursWork = hoursWork;
	}

	/**
	 * @return the rate
	 */
	public double getRate() {
		return rate;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This is a Lecturer. Name:"+super.getName()+", NID: "+super.getNid()
		+ ", height; "+super.getHeight()+", weight: "+super.getWeight()
		+ ", speciality:" +this.getSpeciality()+", academia:"+this.getAcademia()
		+ ", hoursWord: "+this.getHoursWork()+", rate:" +this.getRate();
	}

	@Override
	public double calculateSalary(double hoursWorked, double rate) {
		// TODO Auto-generated method stub
		return 0.0;
	}

}
