package com.practise2;
class trd3 implements Runnable{
   public void run()
   { while(true){
       System.out.print("succes");
   }

   }

}

public class thrd_inter {
    public static void main(String args[])
    {
        trd3 td=new trd3();
        Thread t=new Thread(td); //in case of interface the object is passed to thhe constructor
        t.start();
    }
}
