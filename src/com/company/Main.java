package com.company;
/*
    Ivan Freeman
    January 13, 2022
    There are three methods
    method two() gets user input for a two by two integer 2d array, then prints the sum of row two and column two
    method three() puts random numbers between 1-100 in a 4 by 5 integer 2d array, then prints the sum of the major diagonal
    method four() calculates the number of negative numbers, positive numbers, and zeros in any given integer 2d array
 */
import java.util.Scanner;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
        int[][] val = {{1,2},{-1,-2}}; // this array is for debugging purposes, but is kept in so that I don't get an error
        // runs the three programs
	    //two();
        //three();
        four(val);
    }

    public static void two(){
        // creates scanner and array
        Scanner sc = new Scanner(System.in);
        double[][] num = new double[2][2];

        // gets input for the array
        for(int x = 0; x < num.length; x++){
            for(int y = 0; y < num[x].length; y++){
                System.out.print("Enter Row "+(x+1)+", Column "+(y+1)+" of a 2d array:");
                num[x][y] = sc.nextInt();
            }
        }
        // sums the second row and prints it out
        int rowTwoSum = 0;
        for(int x = 1; x < num.length; x++) {
            for (int y = 0; y < num[x].length; y++) {
                rowTwoSum += num[x][y];
            }
        }
        System.out.println("Row Two's Sum: "+rowTwoSum);

        // sums the second column and prints it out
        int columnTwoSum = 0;
        for(int y=1; y< num[1].length; y++){
            for (double[] doubles : num) {
                columnTwoSum += doubles[y];
            }
        }
        System.out.println("Column Two's Sum: "+columnTwoSum);

    }
    public static void three(){
        // creates an array and fills it with diagonal numbers
        int[][] randomArray = new int[4][5];
        for(int x = 0; x<randomArray.length;x++){
            for(int y = 0; y<randomArray[x].length;y++){
                int randomNum = (int)(Math.random() * 100);
                randomArray[x][y] = randomNum;
            }
        }
        // sums and prints the sum of the diagonal numbers
        int diagonalSum = 0;
        for(int x = 0; x<randomArray.length;x++){
            for(int y = 0; y<randomArray[x].length;y++){
                System.out.print("["+randomArray[x][y]+"]");
                if(x == y){
                    diagonalSum += randomArray[x][y];
                }
            }
            System.out.println();
        }
        System.out.println("Sum of diagonals: "+diagonalSum);
    }
    public static void four(int[][] val){
        // creates variables and counts the amount of positive, zero, and negative numbers
        int negNums = 0;
        int zeros = 0;
        int posNums = 0;
        for (int[] x : val) {
            for (int y : x) {
                if (y > 0) {
                    posNums++;
                } else if (y < 0) {
                    negNums++;
                } else {
                    zeros++;
                }
            }
        }
        // prints the amount of negative, zero, and positive numbers
        System.out.println("Number of negative numbers: "+negNums);
        System.out.println("Number of zeros: "+zeros);
        System.out.println("Number of positive numbers: "+posNums);
    }
}
