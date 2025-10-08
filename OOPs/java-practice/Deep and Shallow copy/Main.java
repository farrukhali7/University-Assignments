public class Main{
	public static void main(String[] args){
    	Book book1 = new Book("oops","george");
        Library library1 = new Library("great library" , book1);
       	
        //Shallow Copy
        Library shallowCopy = new Library(library1);
        shallowCopy.getBook().setTitle("shallow-copy book example");
        shallowCopy.setName("shallow-copy library example");
        
        //Deep Copy
        Library deepCopy = new Library(library1 , true);
        deepCopy.setTitle("deep-copy book example");
        deepCopy.setName("deep-copy library example");
        
        //messageDisplay
        System.out.println("The Title of the Book is: " + library1.getBook().getTitle())
        System.out.println("Shallow book Title: " + shallowCopy.getBook().getTitle());
        System.out.println("Deep book Title: " + deepCopy.getBook().getTitle());
    }
}
