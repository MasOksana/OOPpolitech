package it.hillel;

public class UsersTest {

    public static void main(String[] args) {

        Student st = new Student("12345");
        System.out.println(st.getPhone());


        Support supp1 = new Support("12301");
        Student st2 = new Student("12302");
        PolitehVuz politech = new PolitehVuz();

        politech.addUser(st);
        politech.addUser(supp1);
        politech.addUser(st2);
        politech.addUser(new Student("12304"));

        politech.print();

       /*  статическа переменная, суть


       Student test1 = new Student("sdfsdf");
        Student test2 = new Student("sdfsdf");
        test1.setStrikes(10);
        test2.setStrikes(15);
        System.out.println(test1.getStrikes());
        System.out.println(test2.getStrikes());

        Student.staticVar = 10;
        System.out.println(Student.staticVar);

        //статический метод

        Student.method(); */




    }


}
