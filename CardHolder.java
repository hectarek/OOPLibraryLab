import java.time.LocalDate;

public class CardHolder {
    
    private OverdueList<Book> overdueBooks;
    private OverdueList<Periodical> overduePeriodicals;

    private String firstname, lastname, age, address;
    private int libraryNum;
    private boolean canCheckout;
    private LocalDate memberSince;

    public CardHolder(String firstname, String lastname, String age, String address, int libraryNum,
            boolean canCheckout, LocalDate memberSince) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.address = address;
        this.libraryNum = libraryNum;
        this.canCheckout = canCheckout;
        this.memberSince = memberSince;
    }

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public int getLibraryNum() {
        return libraryNum;
    }
    public void setLibraryNum(int libraryNum) {
        this.libraryNum = libraryNum;
    }

    public boolean isCanCheckout() {
        return canCheckout;
    }
    public void setCanCheckout(boolean canCheckout) {
        this.canCheckout = canCheckout;
    }

    public LocalDate getMemberSince() {
        return memberSince;
    }
    public void setMemberSince(LocalDate memberSince) {
        this.memberSince = memberSince;
    }
    
}