package com.brigelabz.maximum;

import com.Bridgelabz.Day13_MaximumProblemUsingGenerics.TestMaximum;
import org.junit.Assert;
import org.junit.Test;

/*
 * MaximumTest class created to test the code is working or not with Test Cases.
 */
public class MaximumTest {

    /*
     * TC 1.1 Given Max Number at 1st position return the Same Number.
     */

    @Test
    public void floatMax1() {
        float actualValue = TestMaximum.testMaximum(8.2f, 6.5f, 4.5f);
        Assert.assertTrue(true);
    }

    /*
     * TC 1.2 Given Max Number at 2nd position return the Same Number.
     */
    @Test
    public void floatMax2() {
        float actualValue = TestMaximum.testMaximum(3.8f,12.8f,6.8f);
        Assert.assertTrue(true);
    }

    /*
     * TC 1.3 Given Max Number at 3rd position return the Same Number.
     */

    @Test
    public void floatMax3() {
        float actualValue = TestMaximum.testMaximum(5.2f, 6.3f,14.8f);
        Assert.assertTrue(true);
    }
}
