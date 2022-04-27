package com.Bridgelabz.Day13_MaximumProblemUsingGenerics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to check max of three variables");
        Scanner sc = new Scanner(System.in);
        //Taking String input from the user
        System.out.println("Enter values of String 1, String 2, String 3: ");
        String string1 = sc.nextLine();
        String string2 = sc.nextLine();
        String string3 = sc.nextLine();
        //Taking integer values from the user
        System.out.println("Enter values of a, b, c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        //Taking float values from the user
        System.out.println("Enter values of x, y, z: ");
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        float z = sc.nextFloat();

        //testMaximum method called
        TestMaximum.testMaximum(string1, string2, string3);
        TestMaximum.testMaximum(a,b,c);
        TestMaximum.testMaximum(x,y,z);
    }
}
