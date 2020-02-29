package com.demo.bridgelab;
import org.junit.Assert;
import org.junit.Test;

public class TestMaximumNumber {
    @Test
    public void givenIntegerNumber_WhenAtFirstPosition_ReturnMaximumNumber() {
        FindMaximumNumber number = new FindMaximumNumber(3,2,1);
        Integer maximumValue = (Integer) number.ChecktestMaximumNumber();
        Assert.assertEquals((Integer) 3,maximumValue);
    }
    @Test
    public void givenIntegerNumber_WhenAtSecondPosition_ReturnMaximumNumber() {
        FindMaximumNumber number = new FindMaximumNumber(2,3,1);
        Integer maximumValue = (Integer)number.ChecktestMaximumNumber();
        Assert.assertEquals((Integer)3,maximumValue);
    }
    @Test
    public void givenIntegerNumber_WhenAtThirdPosition_ReturnMaximumNumber() {
        FindMaximumNumber number = new FindMaximumNumber(1,2,3);
        Integer maximumValue = (Integer)number.ChecktestMaximumNumber();
        Assert.assertEquals((Integer)3,maximumValue);
    }
    @Test
    public void givenFloatNumber_WhenAtFirstPosition_ReturnMaximumNumber() {
        FindMaximumNumber number = new FindMaximumNumber(3.3f,2.2f,1.1f);
        Float maximumNumber = (Float) number.ChecktestMaximumNumber();
        Assert.assertEquals(3.3f,maximumNumber,0.00);
    }

    @Test
    public void givenFloatNumber_WhenAtSecondPosition_ReturnMaximumNumber() {
        FindMaximumNumber number = new FindMaximumNumber(2.2f,3.3f,1.1f);
        Float maximumNumber = (Float) number.ChecktestMaximumNumber();
        Assert.assertEquals(3.3f,maximumNumber,0.00);
    }

    @Test
    public void givenFloatNumber_WhenAtThirdPosition_ReturnMaximumNumber() {
        FindMaximumNumber number = new FindMaximumNumber(2.2f,1.1f,3.3f);
        Float maximumNumber = (Float) number.ChecktestMaximumNumber();
        Assert.assertEquals(3.3f,maximumNumber,0.00);
    }
    @Test
    public void givenString_WhenAtFirstPosition_ReturnMaximumString() {
        FindMaximumNumber string = new FindMaximumNumber("Peach","Banana","Apple");
        String maximumString = (String) string.ChecktestMaximumNumber();
        Assert.assertEquals("Peach",maximumString);
    }

    @Test
    public void givenString_WhenAtSecondPosition_ReturnMaximumString() {
        FindMaximumNumber string = new FindMaximumNumber("Banana","Peach","Apple");
        String maximumString = (String) string.ChecktestMaximumNumber();
        Assert.assertEquals("Peach",maximumString);
    }

    @Test
    public void givenString_WhenAtThirdPosition_ReturnMaximumString() {
        FindMaximumNumber string = new FindMaximumNumber("Banana","Apple","Peach");
        String maximumString = (String) string.ChecktestMaximumNumber();
        Assert.assertEquals("Peach",maximumString);
    }

}
