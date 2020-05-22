public class Author {
    
    private String firstName, lastName, homeTown;
    private int age;

    public Author() {
        this.firstName = "Author's FirstName";
        this.lastName = "Author's LastName";
        this.homeTown = "Author's HomeTown";
        this.age = 0;
    }

    public Author(String firstName, String lastName, String homeTown, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeTown = homeTown;
        this.age = age;
    }

    //Getters and Setters

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHomeTown() {
        return homeTown;
    }
    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}