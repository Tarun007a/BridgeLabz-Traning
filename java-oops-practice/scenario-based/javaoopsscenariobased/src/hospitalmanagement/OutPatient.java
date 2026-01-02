package hospitalmanagement;

public class OutPatient extends Patient {
    private int visitCount;

    public OutPatient(int patientId, String name, int visitCount) {
        super(patientId, name);
        this.visitCount = visitCount;
    }

    public void displayInfo() {
        System.out.println(getSummary() + " OutPatient Visits : " + visitCount);
    }

    public int getVisitCount() {
        return visitCount;
    }
}

