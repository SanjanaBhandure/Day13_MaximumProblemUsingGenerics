/*
 * The Generics program implements Test cases that simply
 * finds Maximum of 3 variables using Generics.
 * UC1 - Given 3 Integers find the maximum
 *
 * @author: Sanjana Bhandure
 * @version: 1.0
 * @date: 27-04-2022
 */
package com.Bridgelabz.Day13_MaximumProblemUsingGenerics;

public class TestMaximum {
    int x, y, z;

    // constructor
    public TestMaximum(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /*
     * testMaximum method created for checking max of three integers
     */
    public static Integer testMaximum(Integer x, Integer y, Integer z) {
        // Initializing x as greater
        Integer max = x;
        if (y.compareTo(max) > 0)
            // as of now y is greater
            max = y;

        if (z.compareTo(max) > 0)
            // now z is greater
            max = z;
        printMax(x, y, z, max);
        return max;

    }

    /*
     *  printMax method created for displaying maximum values from the given 3 variables.
     */
    public static void printMax(Integer x, Integer y, Integer z, Integer max) {
        System.out.printf("The max of %s, %s and %s is %s\n", x, y, z, max);

    }
}
