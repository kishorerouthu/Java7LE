package com.java7;

/**
 * @author Kishore Routhu on 22/10/17 11:51 AM.
 */
public interface InterfaceA {
    default void defaultMethod(){
        System.out.println("Interface A default method");
    }
}
