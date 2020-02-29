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
    @Test
    public void givenIntegerNumberOptionalArgument_WhenProper_ReturnMaximumNumber() {
        Integer maximumNumber = (Integer) FindMaximumNumber.ChecktestMaximumNumber(1,2,3,4,5,6);
        Assert.assertEquals((Integer) 6,maximumNumber);
    }

    @Test
    public void givenFloatNumberOptionalArgument_WhenProper_ReturnMaximumNumber() {
        Float maximumNumber = (Float) FindMaximumNumber.ChecktestMaximumNumber(1.1f, 2.2f, 3.4f, 4.7f, 7.8f, 18.2f);
        Assert.assertEquals(18.2f,maximumNumber,0.00);
    }

    @Test
    public void givenStringOptionalArgument_WhenProper_ReturnMaximunString() {
        FindMaximumNumber string = new FindMaximumNumber("Banana","Apple","Peach");
        String maximumString = (String) FindMaximumNumber.ChecktestMaximumNumber("Banana","Apple","Peach","Mango","Grapes","StrawBerry");
        Assert.assertEquals("StrawBerry",maximumString);
    }
}
