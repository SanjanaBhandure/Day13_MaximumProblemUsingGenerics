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
    public static<T extends Comparable<T>> T testMaximum(T...values){
        T max = values[0];
        for(T element : values){
            if(element.compareTo(max)>0){
                max = element;
            }
        }
        printMax(max);
        return max;
    }

    /*
     *  printMax method created for displaying maximum values from the given 3 variables.
     */
    public static <T> void printMax(T max) {
        System.out.println("The maximum values is:\t" +max);
    }
}
