/**
 * 
 */

/**
 * @author Dell
 *
 */
public class DateFirstTry {

	 public String month; 
	    public int day;
	    public int year; //a four digit number.
	    
	    public void writeOutput( )
	    {
	        System.out.println(month + " " + day + ", " + year); 
	    }
	    
	    public String nextDay() {
	    	return(month + " " + (day+1) + ", " + year);
	    }
	    
	    public String nextYear() {
	    	return(month + " " + day + ", " + (year+1));
	    }
	    
	    
}
