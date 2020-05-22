import java.time.LocalDate;

public class Book extends LibraryItem implements Reservable, Loanable {

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

    // Implementing interfaces from Reservable and Loanable 
    
    @Override
    public boolean isReservable() {
        return true;
    }

    @Override
    public LocalDate reservedDate() {
        return LocalDate.now();
    }

    @Override
    public int reservationLengthInDays() {
        return 14; 
    };

    @Override
    public boolean isLoanable() {
        return true;
    }
    
    
}