import java.time.LocalDate;

public class LibraryItem {

    private String title, author, genre, publisher;
    private int year;
    private boolean fiction;

    LibraryItem(String title, String author, int year, String genre, String publisher, boolean fiction){
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.publisher = publisher;
        this.fiction = fiction;
    }

    // Getters and Setters

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
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

    public boolean isFiction() {
        return fiction;
    }
    public void setFiction(boolean fiction) {
        this.fiction = fiction;
    }


    



}