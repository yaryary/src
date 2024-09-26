import java.util.ArrayList;

public class Billing {
    private Patient patient;
    private Doctor primaryPhysician;
    private double amountDue;
    private static ArrayList<Billing> totalIncome = new ArrayList<>();

    public Billing(){// no argument constructor
        this(new Patient(), new Doctor(), 0.0);
    }

    public Billing(Patient patient, Doctor primaryPhysician, double amountDue){// receives patient, doctor, double
        setPatient(patient);
        setPrimaryPhysician(primaryPhysician);
        setAmountDue(amountDue);
        totalIncome.add(this);
    }

    public Billing(Billing bill){// receives class object
        this(bill.getPatient(), bill.getPrimaryPhysician(), bill.getAmountDue());
    }

    // getters
    public Patient getPatient(){
        return patient;
    }

    public Doctor getPrimaryPhysician(){
        return primaryPhysician;
    }

    public double getAmountDue(){
        return amountDue;
    }


    // setters
    public void setPatient(Patient patient){
        if(patient != null){
            this.patient = patient;
        }
        else{
            System.out.println("Invalid patient");
            System.exit(0);
        }
    }

    public void setPrimaryPhysician(Doctor primaryPhysician){
        if(primaryPhysician != null){
            this.primaryPhysician = primaryPhysician;
        }
        else{
            System.out.println("Invalid primary physician");
            System.exit(0);
        }
    }

    public void setAmountDue(double amountDue){
        if(amountDue > 0){
            this.amountDue = amountDue;
        }
        else{
            System.out.println("Invalid amount due");
            System.exit(0);
        }
    }

    @Override
    public String toString(){// toString method
        return "Patient: " + patient.getName() + "\nDoctor: " + primaryPhysician.getName() + "\nAmount Due: $" + getAmountDue();
    }


    public boolean equals(Billing bill){// equals method
        return getPatient().equals(bill.getPatient()) && getPrimaryPhysician() == bill.getPrimaryPhysician() && getAmountDue() == bill.getAmountDue();
    }

    public static double calculateTotalIncome(){
        double total = 0;
        for(Billing b : totalIncome){
            total += b.getAmountDue();
        }
        return total;
    }
}
