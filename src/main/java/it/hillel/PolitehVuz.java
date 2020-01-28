package it.hillel;

import java.util.ArrayList;
import java.util.List;

public class PolitehVuz {

    private List<User> users;

    public PolitehVuz (){
        this.users = new ArrayList<User>();
    }

    public void  addUser (User looser){
        users.add (looser);
    }

    public void print(){

        for (User u:this.users){

            System.out.println(u.getSalary());

    }




}}
