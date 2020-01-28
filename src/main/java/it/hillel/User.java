package it.hillel;

public abstract class User implements UserI {

    private int id;
    private String name;
    private String phone;
    private int salary;



    public User(String phone2){

        this.phone=phone2;
    }

    public User (String name, String phone2){

        this.phone = phone2;
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getPhone() {

        return phone;
    }

    public void setPhone(String phone) {

        this.phone = phone;
    }

    public abstract int getSalary();


    public void setSalary(int salary) {

        this.salary = salary;
    }
}
