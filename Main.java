package com.Bridgelabz.Day13_MaximumProblemUsingGenerics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to check max of three variables");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of String 1: ");
        String string1 = sc.nextLine();
        System.out.println("Enter values of String 2: ");
        String string2 = sc.nextLine();
        System.out.println("Enter values of String 3: ");
        String string3 = sc.nextLine();
        //testMaximum method called
        TestMaximum.testMaximum(string1, string2, string3);
    }
}
