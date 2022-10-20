package com.practise2;

class employee{
     private int id;
   private String work;
   public int getid(){
       return id;
   }
   public void setid(int i){
       this.id=i;
   }
   public void setwork(String w){
       this.work=w;
   }
   public String getwork(){
       return work;
   }
}

public class get_set_access_modifier {

    public static void main(String [] args)
    {
       employee neha =new employee();
       neha.setid(10);
       neha.setwork("sys");
       System.out.println(neha.getid());
        System.out.println(neha.getwork());
    }
}
