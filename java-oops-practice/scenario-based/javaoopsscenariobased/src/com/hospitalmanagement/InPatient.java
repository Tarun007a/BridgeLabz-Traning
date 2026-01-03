package hospitalmanagement;

public class InPatient extends Patient {
    private int daysAdmitted;

    public InPatient(int patientId, String name, int daysAdmitted) {
        super(patientId, name);
        this.daysAdmitted = daysAdmitted;
    }

    public void displayInfo() {
        System.out.println(getSummary() + " InPatient Days : " + daysAdmitted);
    }

    public int getDaysAdmitted() {
        return daysAdmitted;
    }
}
