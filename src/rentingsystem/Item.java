package rentingsystem;

public class Item {

    private String itemID;
    private String itemName;
    private String itemBrand;
    private String itemModel;
    private String itemType;
    private double price;

    public Item(String itemID, String itemName, String itemBrand, String itemModel, String itemType, double price) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemBrand = itemBrand;
        this.itemModel = itemModel;
        this.itemType = itemType;
        this.price = price;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemBrand() {
        return itemBrand;
    }

    public void setItemBrand(String itemBrand) {
        this.itemBrand = itemBrand;
    }

    public String getItemModel() {
        return itemModel;
    }

    public void setItemModel(String itemModel) {
        this.itemModel = itemModel;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item ID: " + itemID
                + "\nItem Name: " + itemName
                + "\nItem Brand: " + itemBrand
                + "\nItem Model: " + itemModel
                + "\nItem Type: " + itemType
                + "\nRent Amount: " + price + '\n';
    }

}
