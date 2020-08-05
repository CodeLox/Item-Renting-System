package rentingsystem;

import java.util.ArrayList;

public class Profile {

    private Customer cust;
    private ArrayList<Rent> allRents;
    private ArrayList<Fine> allFines;

    public Profile() {
    }

    public Profile(Customer cust, ArrayList<Rent> allRents, ArrayList<Fine> allFines) {
        this.cust = cust;
        this.allRents = allRents;
        this.allFines = allFines;
    }

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    public ArrayList<Rent> getAllRents() {
        return allRents;
    }

    public void setAllRents(ArrayList<Rent> allRents) {
        this.allRents = allRents;
    }

    public ArrayList<Fine> getAllFines() {
        return allFines;
    }

    public void setAllFines(ArrayList<Fine> allFines) {
        this.allFines = allFines;
    }

    @Override
    public String toString() {
        String customerProfile = new String();
        customerProfile = allRents.stream().map((r) -> r.toString()).reduce(customerProfile, String::concat);
        customerProfile = allFines.stream().map((f) -> f.toString()).reduce(customerProfile, String::concat);
        return customerProfile;
    }

}
