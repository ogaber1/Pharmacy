public abstract class PharmacyItem {
    private final int id;
    private static int nextId =1; // Static counter
    private String name;
    private String manufacturer;
    private String description;
    private double price;
    private int quantity;

    public PharmacyItem() {
        this.id = nextId++;//id is final- should have an initial value everywhere
    }

    public PharmacyItem (String name, String manufacturer, String description, double price, int quantity) {
        this.id = nextId++;
        this.name = name;
        this.manufacturer = manufacturer;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public static void setNextId(int nextId) {
        PharmacyItem.nextId = nextId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean checkAvailibility() {
        return quantity > 0;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Description: " + description);
    }


}
