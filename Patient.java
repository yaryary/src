public class Patient extends Person{
    private Doctor primaryPhysician;

    public Patient(){// no argument constructor
        this("", new Doctor());
    }

    public Patient(String name, Doctor primaryPhysician){// receives name and doctor
        super(name);
        this.primaryPhysician = primaryPhysician;
    }

    public Patient(Patient patient){// receives object
        super(patient);
        this.primaryPhysician = patient.primaryPhysician;
    }

    public Doctor getPrimaryPhysician(){// getter
        return primaryPhysician;
    }

    public void setPrimaryPhysician(Doctor primaryPhysician){// setter
        if(primaryPhysician != null){
            this.primaryPhysician = primaryPhysician;
        }
        else{
            System.out.println("Invalid primary physician");
            System.exit(0);
        }
    }

    @Override
    public String toString(){// toString method
        return "The name is: " + name + ", Primary doctor is: " + primaryPhysician.getName();
    }


    public boolean equals(Patient patient){// equals method
        return getName().equals(patient.getName()) && getPrimaryPhysician() == patient.getPrimaryPhysician();
    }
}
