package rentingsystem;

public class comboItem {

    private String ID;
    private String Name;

    public comboItem(String ID, String Name) {
        this.ID = ID;
        this.Name = Name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public String toString() {
        return this.Name + " : " + this.ID;
    }

}
