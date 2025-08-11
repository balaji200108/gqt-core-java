package com.gqt.corejava.arrays;
import java.util.Scanner;

class ArrayOperations5 {
    String[][][] arr;          // 3D array: colleges → classes → students
    long[] collegeFee;         // Fee per student for each college
    long[] studentCounts;      // Student count per college
    long total_revenue = 0;    // Total revenue
    Scanner sc = new Scanner(System.in);

    // Method to create the structure of the array
    void createArray() {
        System.out.println("Enter college count:");
        int clg = sc.nextInt();

        arr = new String[clg][][];       // College array
        collegeFee = new long[clg];      // Fee array
        studentCounts = new long[clg];   // Student count array

        // Number of classes per college
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the count of classes inside the college no: " + (i + 1));
            arr[i] = new String[sc.nextInt()][];
        }

        // Fee for each college
        for (int i = 0; i < clg; i++) {
            System.out.println("Enter fee per student (in rupees) for college " + (i + 1) + ":");
            collegeFee[i] = sc.nextLong();
        }

        // Number of students per class in each college
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter student count for each class in college no: " + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter count of students in class no: " + (j + 1));
                arr[i][j] = new String[sc.nextInt()];
            }
        }
        System.out.println("Array is created");
        System.out.println("---------------------");
    }

    // Method to collect names of students
    void collectData() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Inside college no: " + (i + 1));
            int collegeStudentCount = 0;

            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter names for class " + (j + 1) + ": ");
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println("Enter name of student " + (k + 1) + ":");
                    arr[i][j][k] = sc.next();
                    collegeStudentCount++; // Count total students for this college
                }
            }

            // Save student count for this college
            studentCounts[i] = collegeStudentCount;
        }
        System.out.println("Data Collected");
        System.out.println("-------------------");
    }

    // Method to display data and calculate revenue
    void displayData() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Inside college no: " + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Class no: " + (j + 1) + " has " + arr[i][j].length + " students:");
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println("Student " + (k + 1) + ": " + arr[i][j][k]);
                }
            }

            // Calculate revenue for this college
            long revenue = studentCounts[i] * collegeFee[i];
            total_revenue += revenue;

            System.out.println("Total students in this college: " + studentCounts[i]);
            System.out.println("Revenue from this college: " + revenue + " rupees\n");
        }

        System.out.println("Grand Total Revenue: " + total_revenue + " rupees");
        System.out.println("---------------");
    }
}

public class Array3D4GQ {
    public static void main(String[] args) {
        ArrayOperations5 ao = new ArrayOperations5();
        ao.createArray();
        ao.collectData();
        ao.displayData();
    }
}
