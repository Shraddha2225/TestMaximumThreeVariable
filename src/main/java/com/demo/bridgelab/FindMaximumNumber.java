package com.demo.bridgelab;
public class FindMaximumNumber {
    public <E extends Comparable<E>> E TestMaximumNumber(E i1, E i2, E i3){
            E max = i1;
            if (i2.compareTo(max) > 0){
                max = i2;
            }
            if(i3.compareTo(max) > 0) {
                max = i3;
            }
            return max;
    }

}
