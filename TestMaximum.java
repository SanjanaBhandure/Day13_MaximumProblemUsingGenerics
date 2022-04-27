/*
 * The Generics program implements Test cases that simply
 * finds Maximum of 3 variables using Generics.
 * REFACTOR 2: Refactor to create Generic Class to take in 3 Variable of Generic Type.
 *
 * @author: Sanjana Bhandure
 * @version: 1.4
 * @date: 28-04-2022
 */

package com.Bridgelabz.Day13_MaximumProblemUsingGenerics;

public class TestMaximum <T extends Comparable<T>>{
    private T x, y, z;

    // constructor test maximum
    public TestMaximum(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /*
     * testMaximum method extends comparable T
     */
    public static <T extends Comparable<T>> T testMaximum(T x, T y, T z) {
        // Initializing x as greater
        T max = x;
        if (y.compareTo(max) > 0)
            // as of now y is greater
            max = y;

        if (z.compareTo(max) > 0)
            // now z is greater
            max = z;
        printMax(x,y,z,max);
        return max;
    }

    /*
     *  printMax method created for displaying maximum values from the given 3 variables.
     */
    public static <T> void printMax(T x, T y, T z, T max) {
        System.out.printf("The Max of following variables %s, %s and %s is %s\n", x, y, z, max);
    }
}
