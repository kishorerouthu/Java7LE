package com.java7;

/**
 * @author Kishore Routhu on 10/10/17 6:06 PM.
 */
public interface DefaultMethodInterface {

    public void existingMethod();

    default public void newDefaultMethod() {
        System.out.println("New default method is added in interface");
    }
}

class DefaultMethodInterfaceImpl implements  DefaultMethodInterface {

    @Override
    public void existingMethod() {
        System.out.println("Existing method implementation");
    }

    public static void main(String[] args) {
        DefaultMethodInterfaceImpl obj = new DefaultMethodInterfaceImpl();
        obj.newDefaultMethod();
    }
}