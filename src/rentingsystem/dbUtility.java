package rentingsystem;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

public class dbUtility {

    Connection con;
    Statement stmt;
    PreparedStatement pstmt;
    ResultSet rs;

    dbUtility() //cons
    {
        try {
            String s = "jdbc:mysql://localhost:3306/RentingSystem?zeroDateTimeBehavior=convertToNull";
            con = DriverManager.getConnection(s, "root", "123456");

            stmt = con.createStatement();
            RentingSystemRunner.wc.setNotification("Database Connected Successfully");

        } catch (Exception e) {
            RentingSystemRunner.wc.setNotification(e.getMessage());
        }
    }

    public boolean adminLogin(String adminID, String password) {

        String query = "SELECT* from ADMIN_LOGIN";
        try {
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                if (adminID.equals(rs.getString("adminID")) && password.equals(rs.getString("adminPassword"))) {
                    return true;
                }
            }
        } catch (SQLException ex) {
            RentingSystemRunner.wc.setNotification(ex.getMessage());
        }
        RentingSystemRunner.wc.setNotification("Incorrect Password/AdminID");
        return false;
    }

    public boolean customerLogin(String customerID, String password) {

        String query = "SELECT* from CUSTOMER_LOGIN";
        try {
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                if (customerID.equals(rs.getString("custID")) && password.equals(rs.getString("custPassword"))) {
                    return true;
                }
            }
        } catch (SQLException ex) {
            RentingSystemRunner.wc.setNotification(ex.getMessage());
        }
        RentingSystemRunner.wc.cL.setNotification("Customer Not Found");
        return false;
    }

    public boolean registerCustomer(Customer c, String password) throws SQLException {

        String query = "SELECT * from CUSTOMERS";
        try {
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                if (c.getPersonID().equals(rs.getString("custID"))) {
                    RentingSystemRunner.wc.reg.setNotification("Customer ID already exist");
                    return false;
                }
            }
        } catch (SQLException ex) {
            RentingSystemRunner.wc.setNotification(ex.getMessage());
        }

        query = " INSERT INTO CUSTOMERS (custID, custName, custEmail, custPhoneNo)"
                + " VALUES (?, ?, ?, ?)";
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, c.getPersonID());
        pstmt.setString(2, c.getPersonName());
        pstmt.setString(3, c.getCustomerEmail());
        pstmt.setString(4, c.getPhoneNo());
        pstmt.executeUpdate();

        query = " INSERT INTO CUSTOMER_LOGIN (custID, custPassword)"
                + " VALUES (?, ?)";
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, c.getPersonID());
        pstmt.setString(2, password);
        pstmt.executeUpdate();

        return true;
    }

    public Customer getcurrentCustomer(String customerID) {

        String query = "SELECT* from CUSTOMERS";
        try {
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                if (customerID.equals(rs.getString("custID"))) {
                    Customer c = new Customer(rs.getString("custID"), rs.getString("custName"), rs.getString("custEmail"), rs.getString("custPhoneNo"));
                    return c;
                }
            }
        } catch (SQLException ex) {
            RentingSystemRunner.wc.setNotification(ex.getMessage());
        }
        RentingSystemRunner.wc.cL.setNotification("Customer Not Found");
        return null;
    }

    public String[] getcurrentCustomerRents(String customerID) {
        String rf[] = new String[2];
        String query = "SELECT* from RENT where RENT.custID = '" + customerID + "'";
        try {
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                String itemID = rs.getString("itemID");
                query = "SELECT *from item_inventory where ITEM_INVENTORY.itemID ='" + itemID + "'";
                Statement tempstmt = con.createStatement();
                ResultSet rs_item = tempstmt.executeQuery(query);
                while (rs_item.next()) {
                    Item i = new Item(rs_item.getString("itemID"),
                            rs_item.getString("itemName"),
                            rs_item.getString("itemType"),
                            rs_item.getString("itemBrand"),
                            rs_item.getString("itemModel"),
                            rs_item.getDouble("itemPrice")
                    );
                    Rent r = new Rent(
                            rs.getString(1),
                            i,
                            rs.getDate(5),
                            rs.getTime(4),
                            rs.getDate(6),
                            rs.getBoolean(7)
                    );
                    rf[0] += r.getRent();
                    rf[1] += getCurrentCustomerFine(rs.getString(1));

                }
            }
            return rf;
        } catch (SQLException ex) {
            customerLogin.custProf.dispose();
            RentingSystemRunner.wc.setNotification(ex.getMessage());
            RentingSystemRunner.wc.cL = new customerLogin();
        }
        rf[0] = "You have no fine dues\n";
        rf[1] = "You have not rented any times!!\n"
                + "Click rent item to do so.\n";
        return rf;
    }

    public String getCurrentCustomerFine(String rentID) {
        String fine = new String();
        double totalfine = 0;
        String query = "SELECT* from FINE where FINE.rentID = '" + rentID + "'";
        try {
            Statement stmtTemp = con.createStatement();
            ResultSet rs_t = stmtTemp.executeQuery(query);
            while (rs_t.next()) {
                Fine F = new Fine(rs_t.getString(1), rs_t.getDouble(2), rs_t.getBoolean(3));
                totalfine += rs_t.getDouble(2);
                fine += F.getFine();
            }
            fine += "Total Fine is: " + Double.toString(totalfine) + "\n";
            return fine;
        } catch (SQLException ex) {
            customerLogin.custProf.dispose();
            RentingSystemRunner.wc.setNotification(ex.getMessage());
            RentingSystemRunner.wc.cL = new customerLogin();
        }
        return "";
    }

    public Fine getFine(String rentID) {
        Fine F = null;
        String query = "SELECT* from FINE where FINE.rentID = '" + rentID + "'";
        try {
            Statement stmtTemp = con.createStatement();
            ResultSet rs_t = stmtTemp.executeQuery(query);
            while (rs_t.next()) {
                F = new Fine(rs_t.getString(1), rs_t.getDouble(2), rs_t.getBoolean(3));
            }
            return F;
        } catch (SQLException ex) {
            customerLogin.custProf.dispose();
            RentingSystemRunner.wc.setNotification(ex.getMessage());
            RentingSystemRunner.wc.cL = new customerLogin();
        }
        return F;
    }

    public ArrayList<Rent> getRents(String customerID) {
        ArrayList<Rent> rents = new ArrayList();
        String query = "SELECT* from RENT where RENT.custID = '" + customerID + "'";
        try {
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                String itemID = rs.getString("itemID");
                query = "SELECT *from item_inventory where ITEM_INVENTORY.itemID ='" + itemID + "'";
                Statement tempstmt = con.createStatement();
                ResultSet rs_item = tempstmt.executeQuery(query);
                while (rs_item.next()) {
                    Item i = new Item(rs_item.getString("itemID"),
                            rs_item.getString("itemName"),
                            rs_item.getString("itemType"),
                            rs_item.getString("itemBrand"),
                            rs_item.getString("itemModel"),
                            rs_item.getDouble("itemPrice")
                    );
                    Rent r = new Rent(
                            rs.getString(1),
                            i,
                            rs.getDate(5),
                            rs.getTime(4),
                            rs.getDate(6),
                            rs.getBoolean(7)
                    );
                    rents.add(r);
                }
            }
        } catch (SQLException ex) {
            customerLogin.custProf.dispose();
            RentingSystemRunner.wc.setNotification(ex.getMessage());
            RentingSystemRunner.wc.cL = new customerLogin();
        }
        return rents;
    }

    public void InsertItem(Item i) throws SQLException {

        String query = " INSERT INTO ITEM_INVENTORY (itemID, itemName, itemType, itemBrand, itemModel, itemPrice)"
                + " VALUES (?, ?, ?, ?, ?, ?)";
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, i.getItemID());
        pstmt.setString(2, i.getItemName());
        pstmt.setString(3, i.getItemType());
        pstmt.setString(4, i.getItemBrand());
        pstmt.setString(5, i.getItemModel());
        pstmt.setDouble(6, i.getPrice());
        pstmt.executeUpdate();
    }

    String getInventoryList() throws SQLException {
        String Inventory = new String();
        try {
            String query = "SELECT* from ITEM_INVENTORY";

            rs = stmt.executeQuery(query);
            while (rs.next()) {
                Item i = new Item(rs.getString("itemID"),
                        rs.getString("itemName"),
                        rs.getString("itemBrand"),
                        rs.getString("itemModel"),
                        rs.getString("itemType"),
                        rs.getDouble("itemPrice")
                );
                Inventory += i.toString() + "---------------------\n";
            }
            return Inventory;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return Inventory;
    }

    public ArrayList<Item> getInventory() throws SQLException {
        ArrayList<Item> Inventory = new ArrayList();
        try {
            String query = "SELECT* from ITEM_INVENTORY";

            rs = stmt.executeQuery(query);
            while (rs.next()) {
                Item i = new Item(rs.getString("itemID"),
                        rs.getString("itemName"),
                        rs.getString("itemBrand"),
                        rs.getString("itemModel"),
                        rs.getString("itemType"),
                        rs.getDouble("itemPrice")
                );
                Inventory.add(i);
            }
            return Inventory;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return Inventory;
    }

    public ArrayList<Customer> getCustomers() throws SQLException {
        ArrayList<Customer> Customers = new ArrayList();
        try {
            String query = "SELECT* from CUSTOMERS";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                Customer c = new Customer(
                        rs.getString("custID"),
                        rs.getString("custName"),
                        rs.getString("custPhoneNo"),
                        rs.getString("custEmail")
                );
                Customers.add(c);
            }
            return Customers;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return Customers;
    }

    public void removeItem(Item i) throws SQLException {
        String query = "delete from ITEM_INVENTORY where itemId = ?";
        PreparedStatement preparedStmt = con.prepareStatement(query);
        preparedStmt.setString(1, i.getItemID());
        // execute the preparedstatement
        preparedStmt.execute();
    }

    public void removeCustomer(Customer c) throws SQLException {
        String query = "delete from CUSTOMERS where custId = ?";
        PreparedStatement preparedStmt = con.prepareStatement(query);
        preparedStmt.setString(1, c.getPersonID());
        // execute the preparedstatement
        preparedStmt.execute();
    }

    public int updateItem(Item i) throws SQLException {
        String query = "update ITEM_INVENTORY"
                + " set itemName = ?,"
                + " itemType = ?,"
                + " itemBrand = ?,"
                + " itemModel = ?,"
                + " itemPrice = ?"
                + " where itemID = ?;";
        PreparedStatement preparedStmt = con.prepareStatement(query);
        preparedStmt.setString(1, i.getItemName());
        preparedStmt.setString(2, i.getItemType());
        preparedStmt.setString(3, i.getItemBrand());
        preparedStmt.setString(4, i.getItemModel());
        preparedStmt.setDouble(5, i.getPrice());
        preparedStmt.setString(6, i.getItemID());
        int executeUpdate = preparedStmt.executeUpdate();
        return executeUpdate;

    }

    public int updateCustomer(Customer c, String password) throws SQLException {
        String query = "update CUSTOMERS"
                + " set custName = ?,"
                + " custEmail = ?,"
                + " custPhoneNo = ?"
                + " where custID = ?;";
        PreparedStatement preparedStmt = con.prepareStatement(query);
        preparedStmt.setString(1, c.getPersonName());
        preparedStmt.setString(2, c.getCustomerEmail());
        preparedStmt.setString(3, c.getPhoneNo());
        preparedStmt.setString(4, c.getPersonID());
        int executeUpdate = preparedStmt.executeUpdate();

        query = "update CUSTOMER_LOGIN"
                + " set custPassword = ?"
                + " where custID = ?;";
        PreparedStatement preparedStmt1 = con.prepareStatement(query);

        preparedStmt1.setString(1, password);
        preparedStmt1.setString(2, c.getPersonID());

        executeUpdate += preparedStmt1.executeUpdate();

        return executeUpdate;

    }

    public String getCustomerPassword(String customerID) throws SQLException {
        String pw = new String();
        String query = "SELECT custPassword from CUSTOMER_LOGIN where custID = '" + customerID + "'";

        rs = stmt.executeQuery(query);
        while (rs.next()) {
            pw = rs.getString(1);
        }
        return pw;
    }

    public void InsertRent(Rent r, String personID) throws SQLException {
        String query = " INSERT INTO RENT (rentID, itemID, custID, rentTime, rentDate, returnDate, hasExceeded)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?)";
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, r.getRentID());
        pstmt.setString(2, r.getItem().getItemID());
        pstmt.setString(3, personID);
        pstmt.setTime(4, r.getRentTime());
        pstmt.setDate(5, r.getRentDate());
        pstmt.setDate(6, r.getReturnDate());
        pstmt.setBoolean(7, false);
        pstmt.executeUpdate();
    }

    public String getRents() {
        ArrayList<Rent> rents = new ArrayList();
        ArrayList<String> customersID = new ArrayList();
        String rentString = new String();
        String query = "SELECT* from RENT";
        try {
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                String itemID = rs.getString("itemID");
                customersID.add(rs.getString("custID"));
                query = "SELECT *from item_inventory where ITEM_INVENTORY.itemID ='" + itemID + "'";
                Statement tempstmt = con.createStatement();
                ResultSet rs_item = tempstmt.executeQuery(query);
                while (rs_item.next()) {
                    Item i = new Item(rs_item.getString("itemID"),
                            rs_item.getString("itemName"),
                            rs_item.getString("itemType"),
                            rs_item.getString("itemBrand"),
                            rs_item.getString("itemModel"),
                            rs_item.getDouble("itemPrice")
                    );
                    Rent r = new Rent(
                            rs.getString(1),
                            i,
                            rs.getDate(5),
                            rs.getTime(4),
                            rs.getDate(6),
                            rs.getBoolean(7)
                    );
                    rents.add(r);
                }
            }
        } catch (SQLException ex) {
            customerLogin.custProf.dispose();
            RentingSystemRunner.wc.setNotification(ex.getMessage());
            RentingSystemRunner.wc.cL = new customerLogin();
        }
        int i = 0;
        for (Rent r : rents) {
            rentString += "CustomerID: " + customersID.get(i++) + "\n";
            rentString += r.getRent();
        }
        return rentString;
    }

    void updateFine() throws SQLException {
        Double itemFine = 0.0;
        String query = "SELECT *FROM RENT";
        rs = stmt.executeQuery(query);
        while (rs.next()) {
            LocalDate exceeded = LocalDate.now();
            Date returnD = rs.getDate("returnDate");
            String rentID = rs.getString("rentID");
            if (returnD.toLocalDate().compareTo(exceeded) <= 0) {
                query = "SELECT *from item_inventory where ITEM_INVENTORY.itemID ='" + rs.getString("itemID") + "'";
                Statement tempstmt = con.createStatement();
                ResultSet rs_item = tempstmt.executeQuery(query);
                while (rs_item.next()) {
                    itemFine = rs_item.getDouble("itemPrice") * 0.22;
                }
                query = "INSERT INTO FINE"
                        + " (rentID, fineAmount, hasPaid)"
                        + " VALUES('" + rentID + "', '" + itemFine + "', '" + 1 + "')";
                Statement smt = con.createStatement();
                int executeUpdate1 = smt.executeUpdate(query);

                query = "UPDATE RENT "
                        + "set hasExceeded = ?"
                        + " where rentID = ?;";
                PreparedStatement pstmt1 = con.prepareStatement(query);
                pstmt1.setBoolean(1, true);
                pstmt1.setString(2, rentID);
                int executeUpdate = pstmt1.executeUpdate();
            }

        }
    }

    void removeRent(Rent toRemove) throws SQLException {
        String query = "delete from RENT where rentID = ?";
        PreparedStatement preparedStmt = con.prepareStatement(query);
        preparedStmt.setString(1, toRemove.getRentID());
        // execute the preparedstatement
        preparedStmt.execute();
    }
}
