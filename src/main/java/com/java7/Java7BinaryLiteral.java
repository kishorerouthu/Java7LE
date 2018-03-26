package com.java7;

/**
 * @author Kishore Routhu on 9/10/17 4:44 PM.
 */
public class Java7BinaryLiteral {

    public static void main(String[] args) {
        int i=0b0111;
        byte b=(byte) 0b0111;
        long l= 0B0111L;

        System.out.println("i="+i);
        System.out.println("b="+b);
        System.out.println("l="+l);
    }
}
