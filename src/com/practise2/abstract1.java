package com.practise2;
 abstract class employ{
     abstract void name();
 }
 class commpany extends employ{
     void name(){
         String n="neha";
         System.out.println(n);
     }

 }




public class abstract1 {

    public static void main(String args[]){
      //  System.out.println("data");
        employ sc=new commpany();
        sc.name();

    }
}
