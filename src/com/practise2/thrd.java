package com.practise2;

import static java.lang.Thread.MAX_PRIORITY;

class trd extends Thread{

@Override
public void run() {
        while (true){
        System.out.println("success");
        }
        }


        }
class trd1 extends Thread{

    @Override
    public void run() {
        while (true){
            
            System.out.println("fail");
        }
    }


}

public class thrd {
    public static void main(String args[]){
        trd t1=new trd();
        trd1 t2=new trd1();
        //t1.setPriority(MAX_PRIORITY);
        /*try {
            t2.join(400000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        try {
            t2.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.start();
        t2.start();

    }
}
