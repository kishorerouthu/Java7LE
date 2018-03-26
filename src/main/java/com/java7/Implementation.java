package com.java7;

/**
 * @author Kishore Routhu on 22/10/17 11:52 AM.
 */

public class Implementation implements InterfaceA, InterfaceB  {
    public void defaultMethod(){
        InterfaceA.super.defaultMethod();
    }
}
