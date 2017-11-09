package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{

        String fileName = "StudentScores.txt";
        Scanner sf = new Scanner(new File(fileName));
        Student[] students = new Student[5];
        int maxIndx = -1;

        while (sf.hasNext()){

            String[] text = sf.nextLine().split("\\s+");
            students[++maxIndx] = new Student(text);
        }
        sf.close();

        for(Student s: students){

            System.out.println(s.name + ", average = " + s.getAverage());
        }
    }
}
