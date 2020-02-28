package com.demo.bridgelab;
import org.junit.Assert;
import org.junit.Test;

public class TestMaximumNumber {
    @Test
    public void givenIntegerNumber_WhenAtFirstPosition_ReturnMaximumNumber() {
        FindMaximumNumber number = new FindMaximumNumber();
        int maximumValue = number.TestMaxNumber(3,2,1);
        Assert.assertEquals(3,maximumValue);
    }
    @Test
    public void givenIntegerNumber_WhenAtSecondPosition_ReturnMaximumNumber() {
        FindMaximumNumber number = new FindMaximumNumber();
        int maximumValue = number.TestMaxNumber(2,3,1);
        Assert.assertEquals(3,maximumValue);
    }
    @Test
    public void givenIntegerNumber_WhenAtThirdPosition_ReturnMaximumNumber() {
        FindMaximumNumber number = new FindMaximumNumber();
        int maximumValue = number.TestMaxNumber(1,2,3);
        Assert.assertEquals(3,maximumValue);
    }
    @Test
    public void givenFloatNumber_WhenAtFirstPosition_ReturnMaximumNumber() {
        FindMaximumNumber number = new FindMaximumNumber();
        Double maximumNumber = number.TestMaxDoubleNumber(3.3,2.2,1.1);
        Assert.assertEquals(3.3,maximumNumber,0.00);
    }

    @Test
    public void givenFloatNumber_WhenAtSecondPosition_ReturnMaximumNumber() {
        FindMaximumNumber number = new FindMaximumNumber();
        Double maximumNumber = number.TestMaxDoubleNumber(2.2,3.3,1.1);
        Assert.assertEquals(3.3,maximumNumber,0.00);
    }

    @Test
    public void givenFloatNumber_WhenAtThirdPosition_ReturnMaximumNumber() {
        FindMaximumNumber number = new FindMaximumNumber();
        Double maximumNumber = number.TestMaxDoubleNumber(1.1,2.2,3.3);
        Assert.assertEquals(3.3,maximumNumber,0.00);
    }

}
