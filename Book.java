import java.time.LocalDate;

public class Book extends LibraryItem implements Reservable, Loanable {

    private int pages;
    private LocalDate releaseDate;

    public Book(String title, Author author, int year, String genre, PublishingCompany publisher, int pages, LocalDate releaseDate) {
        super(title, author, year, genre, publisher);
        this.pages = pages;
        this.releaseDate = releaseDate;
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
    //Reservable
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

    // Loanable
    @Override
    public boolean isLoanable() {
        return true;
    }
    
    @Override
    public double lateFee() {
        return 2.99;
    }

    @Override
    public FeeFrequency lateFeeFrequency() {
        return FeeFrequency.WEEKLY;
    }
    
}