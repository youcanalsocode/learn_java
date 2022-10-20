package com.practise2;
interface cycle{
    void brake();
    void acellerator();
}
class avon implements cycle {
    public void brake(){
        System.out.println("applied brale");

    }
    public void acellerator(){
        System.out.println("applied aceelerator");
    }

}


public class interface1 {
    public static void main(String [] args){
avon av=new avon();
av.brake();

    }

}
