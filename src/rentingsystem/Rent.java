package rentingsystem;

import java.sql.Time;
import java.sql.Date;

public class Rent {

    private String rentID;
    private Item item;
    private Date rentDate;
    private Time rentTime;
    private Date returnDate;
    private boolean hasExceeded;

    public Rent(String rentID, Item item, Date rentDate, Time rentTime, Date returnDate, boolean hasExceeded) {
        this.rentID = rentID;
        this.item = item;
        this.rentDate = rentDate;
        this.rentTime = rentTime;
        this.returnDate = returnDate;
        this.hasExceeded = hasExceeded;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getRentID() {
        return rentID;
    }

    public void setRentID(String rentID) {
        this.rentID = rentID;
    }

    public Item getItem() {
        return item;
    }

    public void setItemID(Item item) {
        this.item = item;
    }

    public Date getRentDate() {
        return rentDate;
    }

    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    public Time getRentTime() {
        return rentTime;
    }

    public void setRentTime(Time rentTime) {
        this.rentTime = rentTime;
    }

    public boolean getHasExceeded() {
        return hasExceeded;
    }

    public void setHasExceeded(boolean hasExceeded) {
        this.hasExceeded = hasExceeded;
    }

    public String getRent() {
        String rent = "Rent ID: " + rentID + "\n---------------------\n";
        rent += "Item Details:\n" + item.toString();
        rent += "---------------------\nDate of Rent: " + this.rentDate.toString() + "\n";
        rent += "Time of Rent: " + this.rentTime.toString() + "\n";
        rent += "Return Date: " + this.returnDate.toString() + "\n";
        rent += "Date Exceeded: " + Boolean.toString(hasExceeded) + "\n\n";
        return rent;
    }
}
