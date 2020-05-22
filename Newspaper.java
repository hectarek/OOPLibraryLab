import java.time.LocalDate;

public class Newspaper extends Periodical {
    
    private String headline;

    public Newspaper(String title, Author author, int year, String genre, PublishingCompany publisher, LocalDate datePublished, int issueNum, IssueFrequencies issueFrequency, String headline) {
        super(title, author, year, genre, publisher, datePublished, issueNum, issueFrequency);
    }

    public String getHeadline() {
        return headline;
    }
    public void setHeadline(String headline) {
        this.headline = headline;
    }

    
}