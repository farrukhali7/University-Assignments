public class Library{
	private String name;
    private Book book;
    
    public Library(String name, Book book){
    	this.name = name;
        this.book = book;
    }
    
    //shallow copy
    public Library(Library other){
    	this.name = other.name;
        this.book = other.book;
    }
    
    //deep copy
    public Library(Library other, boolean deepCopy){
    	this.name = other.name;
    	if(deepCopy){
        	this.book = new Book(other.book);  //deepcopy(new object created)
        }else{
        	this.book = other.book;  //shallow copy
        }
    }
    
    //Setters and Getters
    public void setName(String name){
    	this.name = name;
    }
    public String getName(){
    	return name;
    }
    
    public void setBook(Book book){
    	this.book = book;
    }
    public Book getBook(){
    	return book;
    }
}
