import java.util.Date;

public class Payment {
    private final int id;
    private static int nextId=1;

    private double balance;
    private String paymentMethod;
    private Date paymentDate;

    public Payment() {
        this.id=nextId++;
    }

    public Payment(double balance, String paymentMethod, Date paymentDate) {
        this.id = nextId++;
        this.balance = balance;
        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
    }

    public int getId() {
        return id;
    }

    public static  void setId(int id) {
        nextId = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public void generateReceipt(Order order) {
        System.out.println("Invoice for " + order.getId());
        for (PharmacyItem item : order.getItems()) {
            System.out.println(item.toString());
            System.out.println(item.getQuantity()*item.getPrice());
        }
        System.out.println("Total amount for " + order.getId() + ": " + order.calculateTotalAmount());
    }
    public boolean refund(Order order) {
        return order.calculateTotalAmount()<=500.0;
    }
}
