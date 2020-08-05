package rentingsystem;

public abstract class Person {

    private String personID;
    private String PersonName;

    public Person(String personID, String PersonName) {
        this.personID = personID;
        this.PersonName = PersonName;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getPersonName() {
        return PersonName;
    }

    public void setPersonName(String PersonName) {
        this.PersonName = PersonName;
    }

}
