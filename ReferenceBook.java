public class ReferenceBook extends Book {
    
    private String topic;

    public ReferenceBook(String title, String author, int year, String genre, String publisher, int pages, String topic) {
        super(title, author, year, genre, publisher, pages);
    }

    public String getTopic() {
        return topic;
    }
    public void setTopic(String topic) {
        this.topic = topic;
    }

}