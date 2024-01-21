public class Entry {
    private String lastName, firstName, phoneNumber;

    public Entry(String lastName, String firstName, String phoneNumber){
        this.lastName=lastName;
        this.firstName=firstName;
        this.phoneNumber=phoneNumber;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
}
