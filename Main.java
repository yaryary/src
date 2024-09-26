import java.util.Scanner; // import scanner

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in); // create scanner

        //declare and initialize doctors
        Doctor d1 = new Doctor("Bob", new Date(), 50000.0, "Pediatric", 250.0);
        Doctor d2 = new Doctor("Joseph", new Date(), 70000.0, "Dermatology", 150.0);
        Doctor d3 = new Doctor("Gabriel", new Date(), 100000.0, "Family Medicine", 200.0);

        //declare initialize patients
        Patient p1 = new Patient("Sarah", d1);
        Patient p2 = new Patient("John", d2);
        Patient p3 = new Patient("Leslie", d3);

        //create bills
        Billing b1 = new Billing(p1, d1, 250.0);
        Billing b2 = new Billing(p2, d2, 100.0);
        Billing b3 = new Billing(p3, d3, 95.0);

        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());

        System.out.println();
        System.out.println("*Patient's Information*");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        System.out.println();
        System.out.println("*Billing's Information*");

        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());

        System.out.println();
        System.out.println("The total income from billing records is: " + Billing.calculateTotalIncome());


    }

}
