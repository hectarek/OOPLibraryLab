public class PublishingCompany {
    
    private String name, city, state;
    private int yearEstablished;
    private boolean inBusiness;

    public PublishingCompany(){
        this.name = "Company Name";
        this.city = "Company City";
        this.state = "Company State";
        this.yearEstablished = 2000;
        this.inBusiness = false;
    }

    public PublishingCompany(String name, String city, String state, int yearEstablished, boolean inBusiness) {
        this.name = name;
        this.city = city;
        this.state = state;
        this.yearEstablished = yearEstablished;
        this.inBusiness = inBusiness;
    }

    //Getters and Setters

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public int getYearEstablished() {
        return yearEstablished;
    }
    public void setYearEstablished(int yearEstablished) {
        this.yearEstablished = yearEstablished;
    }

    public boolean isInBusiness() {
        return inBusiness;
    }
    public void setInBusiness(boolean inBusiness) {
        this.inBusiness = inBusiness;
    }
    

}