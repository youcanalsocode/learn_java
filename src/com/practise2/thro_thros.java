package com.practise2;

public class thro_thros {
  public static int div() throws Exception{
      int  a=7;
      return a;
  }


    public static void main(String args[]){


         try{
             int x=div();
             int c=x/0;
         }catch(Exception e){
             System.out.println("divide by 0 failed");
         }


     }


}
