package com.demo.bridgelab;
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
    public static <E extends Comparable<E>> E ChecktestMaximumNumber(E i1, E i2, E i3){
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
