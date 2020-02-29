package com.demo.bridgelab;
import java.util.Arrays;
import java.util.Collections;

public class FindMaximumNumber <E extends Comparable <E>>{
    E i1;
    E i2;
    E i3;
    public FindMaximumNumber(E i1, E i2, E i3){
        this.i1 = i1;
        this.i2 = i2;
        this.i3 = i3;
    }
    public E ChecktestMaximumNumber(){
        return ChecktestMaximumNumber(i1,i2,i3);
    }
    public static <E extends Comparable<E>> E ChecktestMaximumNumber(E i1, E i2, E i3, E...optionalParameter){
            E max = i1;
            if (i2.compareTo(max) > 0){
                max = i2;
            }
            if(i3.compareTo(max) > 0) {
                max = i3;
            }
            if (optionalParameter.length != 0){
                Arrays.sort(optionalParameter, Collections.reverseOrder());
                if (optionalParameter[0].compareTo(max) > 0){
                    max = optionalParameter[0];
                }
            }
            printMaximum(max);
            return max;
    }

    private static <E extends Comparable<E>> void printMaximum(E max) {
        System.out.println("Maximum Variable Is :" +max);
    }
}
