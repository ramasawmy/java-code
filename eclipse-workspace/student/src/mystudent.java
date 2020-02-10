/**
 * 
 */

/**
 * @author Dell
 *
 */
public class mystudent {

	/*attribute*/
	private String name; 
    private int studentID;
    private String address;
    private char gender;
    
    
    /*Constructors*/
    /*
     * default constructor
     */
    public mystudent() {
    }
    
    /**
     * 3 parameter constructor
     * @param name
     * @param address
     * @param gender
     */
    public mystudent(String name, String address, char gender) {
    	this.name=name;
    	this.address=address;
    	this.gender=gender;
    	this.studentID=0; /*student not yet assigned*/
    }
    
    
    /**
     * 4 parameter constructor
     * @param name
     * @param studentID
     * @param address
     * @param gender
     */
    public mystudent(String name, int studentID, String address, char gender) {
    	this.name=name;
    	this.studentID=studentID;
    	this.address=address;
    	this.gender=gender;
    }
    
    
    /*getters*/
    public String getName() {
    	return this.name;
    }
    public int getStudentID() {
    	return this.studentID;
    }
    public String getAddress() {
    	return this.address;
    }
    public char getGender() {
    	return this.gender;
    }
    
    
    
    /*setters*/
    
    public void setName(String name) {
    	this.name = name;
    }
    public void setStudentID(int studentID) {
    	this.studentID =studentID;
    }
    public void setAddress(String address) {
    	this.address = address;
    }
    public void setGender(char gender) {
    	this.gender = gender;
    }
   
    
    
    /*to string no*/
    public String toString() {
    	return this.name + " " + this.studentID + " " + this.address + " " + this.gender; 
    }
    
    
    
    
    
    
}
