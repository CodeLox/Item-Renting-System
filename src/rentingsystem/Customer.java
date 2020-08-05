package rentingsystem;

public class Customer extends Person {

    private String phoneNo;
    private String CustomerEmail;

    public Customer(String customerID, String customerName, String phoneNo, String CustomerEmail) {
        super(customerID, customerName);
        this.phoneNo = phoneNo;
        this.CustomerEmail = CustomerEmail;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String CustomerEmail) {
        this.CustomerEmail = CustomerEmail;
    }

    @Override
    public String toString() {
        return "Customer ID: " + this.getPersonID() + "\n"
                + "Name: " + this.getPersonName() + "\n"
                + "Phone No: " + this.getPhoneNo() + "\n"
                + "Email: " + this.getCustomerEmail() + "\n---------------------\n";
    }

}
