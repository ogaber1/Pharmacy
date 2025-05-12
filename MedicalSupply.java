public class MedicalSupply extends PharmacyItem{
    private String category;

    public MedicalSupply() {
    }
    public MedicalSupply(String name, String manufacturer, String description, double price, int quantity, String category) {
        super(name, manufacturer, description, price, quantity);
        this.category = category;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}
