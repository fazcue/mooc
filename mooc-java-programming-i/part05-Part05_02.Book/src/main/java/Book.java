/**
 *
 * @author facu
 */
public class Book {
    private String author;
    private String title;
    private int pages;
    
    public Book(String author, String title, int pageCount) {
        this.author = author;
        this.title = title;
        this.pages = pageCount;
    }
    
    public String getName() {
        return this.title;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public int getPages() {
        return this.pages;
    }
    
    @Override
    public String toString() {
        return this.author + ", " + this.title + ", " + this.pages + " pages";
    }
}
