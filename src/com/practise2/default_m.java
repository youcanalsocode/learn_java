package com.practise2;
interface  moblie{
    void camera();
   default  void security(){
        System.out.println("securty check");
    }
    class viva implements moblie{
       /*As security is declared as default it not needs t o compuulsary add to the clASS*/
       public void camera(){
           System.out.println("24pxl");
       }

    }

}

public class default_m {
    public static  void main(String args[]){
        //vivo v=new vivo();
        moblie.viva mb=new moblie.viva();
        mb.security();
    }
}
