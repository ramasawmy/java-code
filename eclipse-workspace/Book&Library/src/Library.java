/**
 * 
 */
import java.util.Scanner;
/**
 * @author Dell
 *
 */
public class Library {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputIsbn,inputTitle,inputAuthorName;
		int inputNoPage;
		
		/* create a student object*/
		Book b1= new Book();
		
		Scanner myScanner = new Scanner(System.in);
		
		/*Book 1*/
		System.out.println("enter isbn of the book 1: ");
		inputIsbn = myScanner.next();
		
		System.out.println("enter title of the book 1: ");
		inputTitle = myScanner.next();
		
		System.out.println("enter no page of the book 1: ");
		inputNoPage = myScanner.nextInt();
		
		System.out.println("enter the author name of the book 1: ");
		inputAuthorName = myScanner.next();
		
		/* set the attribute student s1*/
        b1.setIsbn(inputIsbn);
		b1.setTitle(inputTitle);
		b1.setNoPage(inputNoPage);
		b1.setAuthorName(inputAuthorName);
		
		/*display detail of student 1*/
		System.out.println("ISBN of book 1: "+ b1.getIsbn());
		System.out.println("Title of book 1: "+ b1.getTitle());
		System.out.println("No Page of book 1: "+ b1.getNoPage());
		System.out.println("Author Name of book 1: "+ b1.getAuthorName());
		
		System.out.println("Full record of book 1: "+ b1.toString());
		
		/* book not yet assigned no of page and title*/
		
		Book b2 = new Book("123-456","steven");
		System.out.println(b1.toString());
		
		
		/*ask user to input for Isbn,title,noPage,authorName for Book 3*/
		System.out.println("enter isbn of book 3: ");
		inputIsbn = myScanner.next();
		
		System.out.println("enter title of book 3: ");
		inputTitle = myScanner.next();
		
		System.out.println("enter NoPage of book: ");
		inputNoPage = myScanner.nextInt();
		
		System.out.println("enter Author Name of book 3: ");
		inputAuthorName = myScanner.next();
		
		Book b3 = new Book(inputIsbn, inputTitle, inputNoPage, inputAuthorName);
		
		System.out.println(b3.toString());
		
	    
		
		
		
		
		
		
		
		
		
		
		
	}

}
