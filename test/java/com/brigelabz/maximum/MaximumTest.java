package com.brigelabz.maximum;

import com.Bridgelabz.Day13_MaximumProblemUsingGenerics.TestMaximum;
import org.junit.Assert;
import org.junit.Test;

/*
 * MaximumTest class created to test the code is working or not with Test Cases.
 */
public class MaximumTest {

    /*
     * TC 1.1 Given Max String at 1st position return the Same String.
     */

    @Test
    public void stringMax1() {
        String actualValue = TestMaximum.testMaximum("jam","apple","banana");
        Assert.assertTrue("banana",true);
    }

    /*
     * TC 1.2 Given Max String at 2nd position return the Same String.
     */

    @Test
    public void stringMax2() {
        String actualValue = TestMaximum.testMaximum("cat","goat","dog");
        Assert.assertTrue("goat",true);
    }

    /*
     * TC 1.3 Given Max String at 3rd position return the Same String.
     */

    @Test
    public void stringMax3() {
        String actualValue = TestMaximum.testMaximum("bat","carrom","tennis");
        Assert.assertTrue("tennis",true);
    }
}
