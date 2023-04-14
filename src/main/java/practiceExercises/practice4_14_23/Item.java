package practiceExercises.practice4_14_23;

public class Item {
    //------------------------------VARIABLES---------------------------
    private String name;
    private String description;
    private double price;
    private int availableQuantity;


    //-------------------------------CONSTRUCTOR -----------------------

    public Item(String name, String description, double price, int availableQuantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }


    //------------------------------GETTER/SETTER-------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
}


