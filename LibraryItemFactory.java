import java.time.LocalDate;

public class LibraryItemFactory {
    
    public static LibraryItem CreateLibraryItem(LibraryItemNames item) {

        LibraryItem thing = null;

        if (item == null){
            return null;
        }

        Author name = new Author();
        PublishingCompany company = new PublishingCompany();

        switch(item) {
            case BOOK:
                thing = new Book("Title", name , 2000, "NoGenre", company, 0, LocalDate.now());
                break;
            case PERIODICAL:
                thing = new Periodical("Title", name, 2000, "NoGenre", company, LocalDate.now(), 3, IssueFrequencies.QUARTERLY);
                break;
            default:
                break;
        }

        return thing;

    }

}