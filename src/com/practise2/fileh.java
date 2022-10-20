package com.practise2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileh {
    public static void main(String args[]){
        File ob=new File("jav_dem.txt");
        /*creation a new file*/
        try {
            ob.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*-----------------------------writing to  file--------------------------------*/
        try {
            FileWriter fw=new FileWriter("jav_dem.txt");
            fw.write("hello and. Welcome");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*Writing from a file--------------------------*/
        try {
            Scanner sc=new Scanner(ob);
            while(sc.hasNextLine()){
                String l=sc.nextLine();
                System.out.println(l);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
   /*-------------------------------------deleting the file----------------*/
        if(ob.delete()){
            System.out.print("file deleted succesfully");
        }else{
            System.out.println("file deletion failed");
        }

    }
}
