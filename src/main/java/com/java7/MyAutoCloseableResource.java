package com.java7;

/**
 * @author Kishore Routhu on 22/10/17 11:56 AM.
 */
class MyAutoCloseable implements AutoCloseable {

    public void doIt() {
            System.out.println("MyAutoCloseable doing it!");
    }
    @Override
    public void close() throws Exception {
        System.out.println("MyAutoCloseable closed!");
    }
}

public class MyAutoCloseableResource {
    public static void main(String[] args) throws Exception {
        try(MyAutoCloseable myAutoClosable = new MyAutoCloseable()){
            myAutoClosable.doIt();
        }
    }
}
