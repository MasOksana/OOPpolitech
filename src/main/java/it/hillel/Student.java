package it.hillel;

public class Student extends User {

    /*public static int staticVar;    статическая переменная, суть
    public static void method(){
        System.out.println("100001");
    }                                   статический метод                          */

    private int strikes;

    public Student(String phone){
        super(phone);
    }

    public Student(String name, String phone, int strikes){
        super(name, phone);
        this.strikes = strikes;

    }

    public int getStrikes() {
        return strikes;
    }

    public void setStrikes(int strikes) {
        this.strikes = strikes;
    }

    @Override
    public int getSalary() {
        return 1000;
    }
}
