import java.util.List;

public class Customer {
    private final int id;
    private static int nextId =1;

    private String name;
    private String address;
    private String phone;
    private List<Order> orders;


    public int getId() {
        return id;
    }

    public static void setId(int id) {
        nextId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Customer() {
        this.id = nextId++;
    }
    public Customer( String name, String address, String phone) {
        this.id = nextId++;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public Order placeOrder(List<PharmacyItem> items) {
        Order order = new Order();
        for (PharmacyItem item : items) {
            order.addItem(item);
        }
        orders.add(order);
        order.getPayment().generateReceipt(order);
        return order;
    }
    public List<Order> viewOrderHistory() {
        return getOrders();
    }
    public List<Order> getOrders() {
        return orders;
    }
}