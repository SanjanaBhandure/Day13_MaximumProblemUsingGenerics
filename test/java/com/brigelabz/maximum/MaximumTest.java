package com.brigelabz.maximum;

import com.Bridgelabz.Day13_MaximumProblemUsingGenerics.TestMaximum;
import org.junit.Assert;
import org.junit.Test;

  /*
   *MaximumTest class created to test the code is working or not with Test Cases.
   */
public class MaximumTest {

     /*
      * TC 1.1 Given 3 String find the maximum String
      */
    @Test
    public void stringMax1() {
        String actualValue = TestMaximum.testMaximum("peach","apple","banana");
        Assert.assertEquals("peach",actualValue);
    }

     /*
      * TC 1.2 Given Max Integer find the maximum Integer Value.
      */
    @Test
    public void intMax2() {
        int actualValue = TestMaximum.testMaximum(5,18,12);
        Assert.assertEquals(12,actualValue);
    }

    /*
     * TC 1.3 Given Max Float find the maximum Float Value.
     */
    @Test
    public void floatMax3() {
        Float actualValue = TestMaximum.testMaximum(2.5f, 11.5f, 9.8f);
        Assert.assertTrue(true);
    }

    /*
     * TC 4 Extending the max method to take more than three parameters
     */
    @Test
    public void givenStringValuesWhenGetMaximumShouldReturnCorrectValue() {
          String actualResult = TestMaximum.testMaximum("Apple", "Peach", "Banana", "Mango","Strawberry","Guava");
          Assert.assertEquals("Strawberry", actualResult);
      }

}
