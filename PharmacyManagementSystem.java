import java.util.List;

public class PharmacyManagementSystem {
    private final String username = "admin";
    private final String password = "adminpassword";
    private List<PharmacyItem> inventory;

    public PharmacyManagementSystem(List<PharmacyItem> inventory) {
        this.inventory = inventory;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<PharmacyItem> getInventory() {
        return inventory;
    }

    public void setInventory(List<PharmacyItem> inventory) {
        this.inventory = inventory;
    }

    public void addItem(PharmacyItem item) {
        inventory.add(item);
    }

    public void removeItem(PharmacyItem item) {
        inventory.remove(item);
    }
    public void updateItem(PharmacyItem item) {//do we pass an item or pass id or name, and how exactly do we update?
        inventory.set(inventory.indexOf(item), item);
    }
    public void viewInventory() {
        for (PharmacyItem item : inventory) {
            System.out.println(item);
        }
    }

    public PharmacyItem getItemByName(String name) {
        return inventory.stream().filter(item -> item.getName().equals(name)).findFirst().orElse(null);
    }
}



