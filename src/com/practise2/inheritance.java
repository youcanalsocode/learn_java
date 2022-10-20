package com.practise2;
/*base class*/
class animal{
    String voice;
    public String getString(){
        return voice;
    }
    public void setString(String v)
    { System.out.println("class animal setting voice");
        this.voice=v;
    }
    public void ani(){
        System.out.println("class animal");
    }

}
/*-------------*/
/*class derived from base(inherited)*/
class  dog extends animal{
    String name;
    public void anim(){
        System.out.println("class dog");
    }
}
/*----------------*/
public class inheritance {
    public static void main(String[] args) {
/*main class calling setter of base class from derievd one*/
        dog a=new dog();
        a.setString("no");
        System.out.println(a.getString());
    }

}
