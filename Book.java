import java.time.LocalDate;

public class Book extends LibraryItem {

    private int pages;
    private LocalDate releaseDate;

    public Book(String title, String author, int year, String genre, String publisher, int pages) {
        super(title, author, year, genre, publisher);
    }

    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    
    
}