package com.example.javaiouygulamalari;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class JavaIOMain {
    public static void main(String[] args) {
        // fileWriter();
        // fileRead();
        // outputStreamWriter();
        // inputStreamReader();
        // bufferedWriter();
         bufferedReader();

    }




    public static void bufferedWriter(){

        try {

            File newFile = new File("/Users/aslihan/Desktop/dosyabuffer.txt");

            if (!newFile.exists()){
                newFile.createNewFile();
            }

            FileWriter fw = new FileWriter(newFile);
            BufferedWriter writer = new BufferedWriter(fw);
            writer.write("Hello 3");
            writer.flush();
            writer.close();


        } catch (Exception e){
            e.printStackTrace();
        }


    }

    public static void bufferedReader (){

        try {

            File newFile = new File("/Users/aslihan/Desktop/dosyabuffer.txt");
            FileReader fr = new FileReader(newFile);
            BufferedReader reader = new BufferedReader(fr);

            StringBuilder sb = new StringBuilder();
            String line = "";

            while ((line= reader.readLine())!=null){
                sb.append(line+"\n");
            }

            reader.close();
            System.out.println(sb.toString());


        } catch (Exception e){
            e.printStackTrace();
        }


    }



    public static void outputStreamWriter (){
        try {

            File newFile = new File("/Users/aslihan/Desktop/dosya.txt");
            if (!newFile.exists()){
                newFile.createNewFile();
            }

            FileOutputStream fos = new FileOutputStream(newFile);
            OutputStreamWriter writer2 = new OutputStreamWriter(fos, "utf-8");

            writer2.write("Hello 2");


            writer2.flush();
            writer2.close();

        } catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void inputStreamReader(){

        try {
            File newFile = new File("/Users/aslihan/Desktop/dosya.txt");
            FileInputStream fis = new FileInputStream(newFile);
            InputStreamReader reader2 = new InputStreamReader(fis, "utf-8");
            StringBuilder sp = new StringBuilder();

            int info = 0;

            while ((info= reader2.read())!=-1){
                sp.append((char)info);
            }

            reader2.close();

            System.out.println("Okunan: " +sp.toString());

        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void fileWriter() {

        try {
            File newFile = new File("/Users/aslihan/Desktop/dosya.txt");
            if (!newFile.exists()) {
                newFile.createNewFile();
            }

            FileWriter writer = new FileWriter(newFile);
            writer.write("Hello");

            writer.flush();
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void fileRead() {
        try {
            File newFile = new File("/Users/aslihan/Desktop/dosya.txt");
            FileReader reader = new FileReader(newFile);
            StringBuilder sp = new StringBuilder();
            int info = 0;
            while ((info= reader.read())!=-1){

                sp.append((char)info);
            }

            reader.close();

            System.out.println("Okunan : " + sp.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

