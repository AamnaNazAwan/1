package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("sampleTect.txt");

        BufferedReader bf = new BufferedReader(new FileReader(file));

        String st= null;
        try {
            st = bf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        AtomicInteger sum = new AtomicInteger();
        sum.set(0);


        try {
            while ((st = bf.readLine()) != null) {
                sum.addAndGet(Integer.parseInt(String.valueOf(st)));
                System.out.println(st);

            }
            System.out.println("The sum of all numbers in the text file : "+sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}






