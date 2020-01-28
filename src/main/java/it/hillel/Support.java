package it.hillel;

public class Support extends User {

    private String location;

    public Support (String phone){
        super(phone);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public int getSalary() {
        return +20000;
    }


}
