import java.util.List;

public class Order implements Payable {
    private final int id;
    private static int nextId = 1;
    private double totalAmount;
    private Payment payment;
    private List<PharmacyItem>cart;
    private List<Prescription>prescriptions;

    public Order() {
        this.id = nextId++;
    }
    public Order( double totalAmount, List<PharmacyItem> cart, List<Prescription> prescriptions) {
        this.id = nextId++;
        this.totalAmount = totalAmount;
        this.cart = cart;
        this.prescriptions = prescriptions;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public List<PharmacyItem> getCart() {
        return cart;
    }

    public void setCart(List<PharmacyItem> cart) {
        this.cart = cart;
    }

    public int getId() {
        return id;
    }

    public static void setId(int id) {
        nextId = id;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<PharmacyItem> getItems() {
        return cart;
    }

    public void setItems(List<PharmacyItem> cart) {
        this.cart = cart;
    }

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(List<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }
    public void addItem(PharmacyItem item) {
        cart.add(item);
    }
    public void addPrescription(Prescription prescription) {
        prescriptions.add(prescription);
    }
    public void removeItem(PharmacyItem item) {
        cart.remove(item);
    }
    public double calculateTotalAmount() {
        totalAmount = 0;
        for (PharmacyItem item : cart) {
            totalAmount += item.getPrice()*item.getQuantity();
        }
        return totalAmount;
    }
    public boolean processPayment() {//should be a button
        return payment.getBalance()>=calculateTotalAmount();
    }
}
