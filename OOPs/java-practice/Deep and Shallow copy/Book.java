public class Book{
	private String title;
    private String author;
    
    // parameterized constructor 
    public Book(String title, String author){
    	this.title = title;
        this.author = author;
    }
    
    //copy constructor
    public Book(Book other){
    	this.title = other.title;
        this.author = other.author;
    }
    
    // Setters and Getters
    public void setTitle(String title){
    	this.title = title;
    }
    public String getTitle(){
    	return title;
    }
    
    public void setAuthor(String author){
    	this.author = author;
    }
    public String getAuthor(){
    	return author;
    }
    
}
