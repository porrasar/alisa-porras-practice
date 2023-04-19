package practiceExercises.sba_exercises.part4;

public class Item {
    //------------------------------VARIABLES---------------------------
    private String itemName;
    private String itemDescription;
    private double price;
    private int quantity;
    private int availableQuantity;

    //List<Item> itemCollection = new ArrayList<>();

    //-------------------------------CONSTRUCTOR -----------------------
    public Item() {
        this.quantity = 1;
    }

    public Item(String itemName, String itemDescription, double price, int availableQuantity)
    {
        this();                                   //calling default constructor using this()
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }

    public Item(String[] s)
    {

    }


    //------------------------------GETTER/SETTER-------------------------

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
}