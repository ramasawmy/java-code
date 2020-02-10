/**
 * 
 */

/**
 * @author Dell
 *
 */
public class Book {

	/*attribute*/
	private String isbn; 
    private String title;
    private int noPage;
    private String authorName;
    
    /*Constructors*/
    /*
     * default constructor
     */
    public Book() {
    }
    
    /***
     * 2 parameter constructors
     * @param isbn
     * @param authorName
     */
    public Book(String isbn,  String authorName) {
    	this.isbn=isbn;
    	this.title="0";
    	this.noPage=0;
    	this.authorName=authorName;
    }
    
    
    /***
     * 4 parameter constructors
     * @param isbn
     * @param title
     * @param noPage
     * @param authorName
     */
    public Book(String isbn, String title, int noPage, String authorName) {
    	this.isbn=isbn;
    	this.title=title;
    	this.noPage=noPage;
    	this.authorName=authorName;
    }
	
    /*getters*/
    public String getIsbn() {
    	return this.isbn;
    }
    public String getTitle() {
    	return this.title;
    }
    public int getNoPage() {
    	return this.noPage;
    }
    public String getAuthorName() {
    	return this.authorName;
    }
    
/*setters*/
    
    public void setIsbn(String isbn) {
    	this.isbn = isbn;
    }
    public void setTitle(String title) {
    	this.title = title;
    }
    public void setNoPage(int noPage) {
    	this.noPage = noPage;
    }
    public void setAuthorName(String authorName) {
    	this.authorName = authorName;
    }
    
    /*to string no*/
    public String toString() {
    	return this.isbn + " " + this.title + " " + this.noPage + " " + this.authorName; 
    }
    
    
    
    
    
    
    
    
    
}
