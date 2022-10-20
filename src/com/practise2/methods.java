package com.practise2;

public class methods {
    /*method for addition*/
    static int add(int a, int b){
        int s=a+b;
        return s;
    }
/*method overloading-has same name but different functionality*/
static void add(){
    System.out.println("hello method overloading");
}

    public static void main(String args[]){
        /*method called*/
       int sum=add(2,3);
       /*method overloading called*/
        add();
       System.out.println(sum);
    }
}
