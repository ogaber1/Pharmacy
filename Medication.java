import java.util.Date;

public class Medication extends PharmacyItem {
    private String dosage;
    private Date expirationDate;
    private boolean requiresPrescription;

    public Medication() {
    }

    public Medication(String name, String manufacturer, String description, double price, int quantity, String dosage, Date expirationDate, boolean requiresPrescription) {
        super(name, manufacturer, description, price, quantity);
        this.dosage = dosage;
        this.expirationDate = expirationDate;
        this.requiresPrescription = requiresPrescription;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }


    public boolean getRequiresPrescription() {
        return requiresPrescription;
    }

    public void setRequiresPrescription(boolean requiresPrescription) {
        this.requiresPrescription = requiresPrescription;
    }

    public boolean isExpired(){
        return expirationDate.after(new Date());
    }
}
