
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> book;
    
    public Library() {
        this.book = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook) {
        this.book.add(newBook);
    }
    
    public void printBooks() {
        for (int i = 0; i < this.book.size(); i++) {
            System.out.println(this.book.get(i));
        }
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
               
        for (Book b: book) {
            if (b.title().contains(title)) {
                 if(StringUtils.included(b.title(), title)) {
                    found.add(b);
            }
                
            }
        }
       return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        
        for (Book b: book) {
            if (b.publisher().contains(publisher)) {
                if(StringUtils.included(b.publisher(), publisher)) {
                    found.add(b);
                }
            }
        }
       return found;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        
        for (Book b: book) {
            if (b.year() == year) {
                found.add(b);
            }
        }
       return found;
    }
}
