package com.practise2;

class student{
    private  int id;
    private String name;

/*constructor*/
    public student(){
        id=8;
        name="neha";
    }
    /*---------------*/


    /*constructor for  showing that it support method overloading called when variable is alrady passed in main value*/
    public student(int myid,String myname)
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


public class construct {
    public static void main(String args[]){
      /*object called for constructor*/
       // student a=new student();
        /*---------------*/

        /*object called by passing variable*/
        student a=new student(3,"riya");
        /*----------------*/

        System.out.println(a.getId());
        System.out.println(a.getname());

    }
}
