interface ClaimProcessable {
    void processClaim();
}

class CarInsuranceClaim implements ClaimProcessable {
    String carDetails;
    double claimAmount;
    public void processClaim() {
        System.out.println("Processing car insurance claim...");
        System.out.println("Car Details: " + carDetails);
        System.out.println("Claim Amount: $" + claimAmount);
        System.out.println("Car insurance claim processed successfully.");
    }
}
class HealthInsuranceClaim implements ClaimProcessable {
    String patientName;
    double medicalExpenses;
    public void processClaim() {
        System.out.println("Processing health insurance claim...");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Medical Expenses: $" + medicalExpenses);
        System.out.println("Health insurance claim processed successfully.");
    }
}
public class InterfaceAbstrationInsuranceClaim {
    public static void main(String[] args) {
        CarInsuranceClaim carClaim = new CarInsuranceClaim();
        carClaim.carDetails = "Tom, 2020";
        carClaim.claimAmount = 5000;
        carClaim.processClaim(); 

        System.out.println(); 
        HealthInsuranceClaim healthClaim = new HealthInsuranceClaim();
        healthClaim.patientName = "Jerry";
        healthClaim.medicalExpenses = 1200;
        healthClaim.processClaim(); 
    }
}