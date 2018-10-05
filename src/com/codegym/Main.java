package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter the number of rows and columns in the array: \n");
        System.out.printf("Row: ");
        int row = scanner.nextInt();
        System.out.printf("Col: ");
        int col = scanner.nextInt();

        double[][] array = new double[row][col];
        inputArr(array,scanner);
        displayArr(array);

        Location.locateLargest(array).display();
    }

    public static void inputArr(double[][] arr, Scanner scanner){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.printf("arr[%d][%d]: ",i,j);
                arr[i][j] = scanner.nextDouble();
            }
        }
    }
    public static void displayArr(double[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.printf("%e ",arr[i][j]);
            }
            System.out.println("");
        }
    }

}

