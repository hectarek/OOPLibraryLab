import java.time.LocalDate;

public class ReferenceBook extends Book {
    
    private String topic;

    public ReferenceBook(String title, Author author, int year, String genre, PublishingCompany publisher, int pages, LocalDate releaseDate, String topic) {
        super(title, author, year, genre, publisher, pages, releaseDate);
    }

    public String getTopic() {
        return topic;
    }
    public void setTopic(String topic) {
        this.topic = topic;
    }

}