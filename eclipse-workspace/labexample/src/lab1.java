/**
 * 
 */
import java.util.Scanner;
/**
 * @author Dell
 *
 */
public class lab1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double base1, base2, height, Area, Median; 
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Please Enter First Base of a Trapezoid =  ");
		base1 = sc.nextDouble();
		System.out.println(" Please Enter Second Base of a Trapezoid =  ");
		base2 = sc.nextDouble();
		System.out.println(" Please Enter the Height of a Trapezoid = ");
		height = sc.nextDouble();

		Area = 0.5 * (base1 + base2) * height;
		Median = 0.5 * (base1+ base2);
		
		System.out.format("\n The Area of a Trapezoid = %.2f\n",Area);
		
		System.out.format(" The Median of a trapezium = %.2f \n", Median);
		
		
	}

}
