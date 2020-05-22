import java.time.LocalDate;

public class Magazine extends Periodical {
    
    private String company;
    private int pages;
    
    public Magazine(String title, Author author, int year, String genre, PublishingCompany publisher, LocalDate datePublished, int issueNum, IssueFrequencies issueFrequency, String company, int pages) {
        super(title, author, year, genre, publisher, datePublished, issueNum, issueFrequency);
    }

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    

}