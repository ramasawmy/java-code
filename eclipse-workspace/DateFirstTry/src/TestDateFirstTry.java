/**
 * 
 */

/**
 * @author Dell
 *
 */
public class TestDateFirstTry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
        DateFirstTry date1, date2;
        date1 = new DateFirstTry( );
        date2 = new DateFirstTry( );
        
        
        date1.month = "August";
        date1.day = 6;
        date1.year = 2019;
        System.out.println("date1:");
        date1.writeOutput( );

        date2.month = "August";
        date2.day = 7;
        date2.year = 2019;
        System.out.println("date2:");
        date2.writeOutput( );
		
		System.out.println(date2.nextDay());
		System.out.println(date1.nextYear());
	}

}
