public class Doctor extends SalariedEmployee{
    private String specialty;
    private double officeVisitFee;

    public Doctor(){// no argument constructor
        this("", new Date(), 0.0, "", 0.0);
    }

    public Doctor(String name, Date hireDate, double salary, String specialty, double officeVisitFee){// receives values constructor
        super(name, hireDate, salary);
        setSpecialty(specialty);
        setOfficeVisitFee(officeVisitFee);
    }

    public Doctor(Doctor doctor){// receives object
        super(doctor);
        this.specialty = doctor.specialty;
        this.officeVisitFee = doctor.officeVisitFee;
    }

    //getters
    public String getSpecialty(){
        return specialty;
    }

    public double getOfficeVisitFee(){
        return officeVisitFee;
    }

    //setters
    public void setSpecialty(String specialty){
        if(specialty != null){
            this.specialty = specialty;
        }
        else{
            System.out.println("Invalid specialty");
            System.exit(0);
        }

    }

    public void setOfficeVisitFee(double officeVisitFee){
        if(officeVisitFee > 0){
            this.officeVisitFee = officeVisitFee;
        }
        else{
            System.out.println("Invalid fee");
            System.exit(0);
        }
    }

    @Override
    public String toString(){// toString method
        return super.toString() + "\nThe specialty is " + specialty + " and visit fee is $" + officeVisitFee + ".";
    }


    public boolean equals(Doctor doctor){// equals method
        return getSpecialty().equals(doctor.getSpecialty()) && getOfficeVisitFee() == doctor.getOfficeVisitFee();
    }
}
