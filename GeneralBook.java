public class GeneralBook extends Book{
    
    private boolean fiction;

    public GeneralBook(String title, String author, int year, String genre, String publisher, int pages, boolean fiction) {
        super(title, author, year, genre, publisher, pages);
    }

    public boolean isFiction() {
        return fiction;
    }
    public void setFiction(boolean fiction) {
        this.fiction = fiction;
    }

    

}