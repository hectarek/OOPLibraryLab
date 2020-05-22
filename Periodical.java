import java.time.LocalDate;

public class Periodical extends LibraryItem implements Reservable {
    
    private LocalDate datePublished;
    private int issueNum;
    private IssueFrequencies issueFrequency;

    public Periodical(String title, String author, int year, String genre, String publisher, LocalDate datePublished, int issueNum, IssueFrequencies issueFrequency) {
        super(title, author, year, genre, publisher);
    }

    public LocalDate getDatePublished() {
        return datePublished;
    }
    public void setDatePublished(LocalDate datePublished) {
        this.datePublished = datePublished;
    }

    public int getIssueNum() {
        return issueNum;
    }
    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }

    public IssueFrequencies getIssueFrequency() {
        return issueFrequency;
    }
    public void setIssueFrequency(IssueFrequencies issueFrequency) {
        this.issueFrequency = issueFrequency;
    }

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
        return 1;
    }

}