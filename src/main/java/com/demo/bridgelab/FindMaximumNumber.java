package com.demo.bridgelab;
public class FindMaximumNumber {
    public Integer TestMaxNumber(Integer i1, Integer i2, Integer i3){
        Integer max = i1;
        if (i2.compareTo(max) > 0){
            max = i2;
        }
        if(i3.compareTo(max) > 0) {
            max = i3;
        }
        System.out.println("Maximum Number Is :" +max);
        return max;
    }
}
