package com.java7;

/**
 * @author Kishore Routhu on 9/10/17 12:16 PM.
 */
public class StringInSwitchCase {

    public static void main(String[] args) {
        String mode = args[0];

        switch (mode) {
            case "ACTIVE" :
                System.out.println("Running on Active mode");
                break;

            case "PASSIVE" :
                System.out.println("Running on Passive mode");
                break;

            case "SAFE" :
                System.out.println("Running on Safe mode");
                break;
        }
    }
}
