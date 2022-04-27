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
    public void intMax1() {
        int actualValue = TestMaximum.testMaximum(25,24,19);
        Assert.assertEquals(25,actualValue);
    }

    /*
     * TC 1.2 Given Max Number at 2nd position return the Same Number.
     */
    @Test
    public void intMax2() {
        int actualValue = TestMaximum.testMaximum(5,13,12);
        Assert.assertEquals(13,actualValue);
    }

    /*
     * TC 1.3 Given Max Number at 3rd position return the Same Number.
     */
    @Test
    public void intMax3() {
        int actualValue = TestMaximum.testMaximum(5,1,18);
        Assert.assertEquals(18,actualValue);
    }
}
