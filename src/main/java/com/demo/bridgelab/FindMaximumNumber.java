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

    public Double TestMaxDoubleNumber(Double i1, Double i2, Double i3){
        Double max = i1;
        if(i2.compareTo(max) > 0){
            max = i2;
        }
        if(i3.compareTo(max) > 0){
            max = i3;
        }
        System.out.println("Maximum Float Number Is :" +max);
        return max;
    }
    public String TestCharacter(String str1, String str2, String str3){
        String max = str1;
        if(str2.compareTo(max) > 0){
            max = str2;
        }
        if(str3.compareTo(max) > 0){
            max = str3;
        }
        System.out.println("Maximum String Is :" +max);
        return max;
    }


}
