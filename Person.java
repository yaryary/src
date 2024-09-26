public class Person {
    protected String name;// protected so it can still be accessed

    public Person(){ // no argument constructor
        this("");
    }

    public Person(String name){// receives string
        setName(name);
    }

    public Person(Person object){// receives object
        this(object.getName());
    }

    public String getName(){// getter
        return name;
    }

    public void setName(String name){// setter
        if(name != null){
            this.name = name;
        }
        else{
            System.out.println("Invalid name");
            System.exit(0);
        }

    }

    @Override
    public String toString(){// toString method
        return "The doctor " + name;
    }

    public boolean equals(Person other){// equals method
        return getName().equals(other.getName());
    }
}
