import java.time.LocalDate;

public class GeneralBook extends Book {
    
    private boolean fiction;

    public GeneralBook(String title, Author author, int year, String genre, PublishingCompany publisher, int pages, LocalDate releaseDate, boolean fiction) {
        super(title, author, year, genre, publisher, pages, releaseDate);
    }

    public boolean isFiction() {
        return fiction;
    }
    public void setFiction(boolean fiction) {
        this.fiction = fiction;
    }

    

}