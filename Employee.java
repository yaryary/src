public class Employee extends Person{
    Date hireDate;

    public Employee(){ // no argument constructor
        this(" ",new Date(01,01,01));
    }

    public Employee(String name, Date hireDate){ //receives name and hireDate
        super(name);
        setHireDate(hireDate);
    }

    public Employee(Employee object){ // receives object
        super(object);
        setHireDate(object.getHireDate());
    }

    public Date getHireDate(){ // getter
        return hireDate;
    }

    public void setHireDate(Date hireDate){ // setter
        if(hireDate != null){
            this.hireDate = hireDate;
        }
        else{
            System.out.println("Invalid hire date");
            System.exit(0);
        }
    }

    @Override
    public String toString(){ // toString method
        return super.toString() + " was hired " + hireDate ;
    }


    public boolean equals(Employee employee){ // equals method
        return getHireDate().equals(employee.getHireDate());
    }
}
