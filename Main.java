package com.Bridgelabz.Day13_MaximumProblemUsingGenerics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to check max of three variables");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a, b and c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        //testMaximum method called
        TestMaximum.testMaximum(a,b,c);
    }
}
