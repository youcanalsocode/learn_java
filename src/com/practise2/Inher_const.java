package com.practise2;

class stud{
    private  int id;
    private String name;

    /*constructor*/
    public stud(){
        id=8;
        name="neha";
    }
    /*---------------*/


    /*constructor for  showing that it support method overloading called when variable is alrady passed in main value*/
    public stud(int myid,String myname)
    { id=myid;
        name=myname;

    }
    /*getter dettter for pribvate variables*/
    public void setId(int i){
        this.id=i;

    }

    public void setName(String n){
        this.name=n;

    }
    public String getname(){
        return name;
    }
    public int getId(){
        return id;
    }
    /*--------------------------------------*/

}
/*inheritance of class stud*/
class test extends stud{

}


public class Inher_const {
    public static void main(String args[]) {
        /*object called for constructor through its inherited class test*/
         test a=new test();
        /*---------------*/

        /*object called by passing variable*/
        //student a = new student(3,"riya");
        /*----------------*/

        System.out.println(a.getId());
        System.out.println(a.getname());

    }
}
