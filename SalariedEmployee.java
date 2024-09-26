public class SalariedEmployee extends Employee{
    private double salary;

    public SalariedEmployee(){// no argument constructor
        this("", new Date(), 0.0);
    }

    public SalariedEmployee(String name, Date hireDate, double salary){// receives name, hireDate, and salary
        super(name, hireDate);
        setSalary(salary);
    }

    public SalariedEmployee(SalariedEmployee employee){// receives object
        super(employee);
        setSalary(employee.getSalary());
    }

    public double getSalary(){// getter
        return salary;
    }

    public void setSalary(double salary){// setter
        if(salary > 0){
            this.salary = salary;
        }
        else{
            System.out.println("Invalid salary");
            System.exit(0);
        }

    }

    @Override
    public String toString(){// toString method
        return super.toString() + " at Salary " + salary + ".";
    }


    public boolean equals(SalariedEmployee employee){// equals method
        return super.equals(employee) && getSalary() == employee.getSalary();
    }


}
