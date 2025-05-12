import java.util.Date;

public class Prescription {
    private static int nextId=0;
    private final int id;
    private Date date;
    private String doctorName;

    public Prescription() {
        this.id = nextId++;
    }

    public Prescription( String doctorName) {
        this.id = nextId++;
        this.doctorName = doctorName;
    }

    public static void setid(int nextid) {
        nextId = nextid;
    }

    public int getId() {
        return id;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Prescription.nextId = nextId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    public void linkToMedication(Medication m) {//readjust requires back to true after validation is complete(or purchase), this is the simplest idea could be modified
        m.setRequiresPrescription(false);
    }
    public boolean isExpired(){
        return date.after(new Date());//this is wrong, should check for a maximum time after the prescription.
    }
}
