package com.company;

/**
 * Created by jh424 on 11/9/17.
 */
public class Student {

    public String name;
    private int[] scores = new int[10];

    public Student(String[] stud){

        name = stud[0];

        for (int i=1; i<=stud.length-1; i++){

            scores[i-1] = Integer.parseInt(stud[i]);
        }
    }

    public int getAverage(){

        int avg = 0;
        int count =0;

        for (int c: scores){

            avg += c;
            if (c>0){
                count++;
            }
        }
        avg /= count;

        return avg;
    }
}
