package rentingsystem;

public class Fine {

    private String rentID;
    private double fineAmount;
    private boolean hasPaid;

    public Fine(String rentID, double fineAmount, boolean hasPaid) {
        this.rentID = rentID;
        this.fineAmount = fineAmount;
        this.hasPaid = hasPaid;
    }

    public String getRentID() {
        return rentID;
    }

    public void setRentID(String rentID) {
        this.rentID = rentID;
    }

    public double getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(double fineAmount) {
        this.fineAmount = fineAmount;
    }

    public boolean getHasPaid() {
        return hasPaid;
    }

    public void setHasPaid(boolean hasPaid) {
        this.hasPaid = hasPaid;
    }

    public String getFine() {
        String fine = "Rent ID: " + rentID + "\n";
        fine += "Fine: " + this.fineAmount + "\n";
        fine += "Paid Status: " + Boolean.toString(hasPaid) + "\n\n";
        return fine;
    }
}
