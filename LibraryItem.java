
public class LibraryItem {

    private String title, genre, publisher;
    private int year;
    private Author author;

    LibraryItem(String title, Author author, int year, String genre, String publisher){
        this.title = title;
        this.author = new Author();
        this.year = year;
        this.genre = genre;
        this.publisher = publisher;
    }

    // Getters and Setters

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}