package com.practise2;

import java.util.Scanner;
class error_tt extends Exception{
    @Override
    public String toString() {
        return "age is less then 25";
    }
}

public class errors {
    public static void main(String args[]){
        int a=19;
        int b=0;

        /*-----------basic try catch block----------*/
        try{
            int c=a/b;
        }catch(Exception e){
          System.out.println("program running fails");
          System.out.println(e);

        }
        /*----------------------Arroy out of range excepton--------------------*/
        int ar[]=new int[3];
        Scanner sc=new Scanner(System.in);
        try{
            int x=sc.nextInt();
            System.out.println("the valule at index is:"+ar[x]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("out of range");
        }
        /*-----------Nested try catch ---------------------------------------------------------------*/
        try{
            int x=sc.nextInt();
            System.out.println("the valule at index is:"+ar[x]);
            try{
                int y =3/0;
                System.out.println("succes");
            }catch(Exception e){
                System.out.println("nested catch");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("out of range");
        }
/*-------------------- Exceptionclass ---------------------------------------------------------------------------------*/
int age=27;
if(age<25)try{
    throw new ArithmeticException("This is an exception");
}catch(Exception e){
    System.out.println(e.toString());
}


    }
}
