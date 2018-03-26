package com.java7;

/**
 * @author Kishore Routhu on 9/10/17 12:16 PM.
 */
public class StringInSwitchCase {

    public static void main(String[] args) {
        String mode = args[0];

        switch (mode) {
            case "ACTIVE":
                System.out.println("Running on Active mode");
                break;

            case "PASSIVE":
                System.out.println("Running on Passive mode");
                break;

            case "SAFE":
                System.out.println("Running on Safe mode");
                break;

            default:
                throw new IllegalArgumentException("Invalid mode");
        }
    }

    //After compilation
    public static void main1(String args[]) {
        String mode = args[0];
        String s;
        switch ((s = mode).hashCode()) {
            default:
                throw new IllegalArgumentException("Invalid mode");
            case 74056953:
                if (s.equals("PASSIVE")) {
                    System.out.println("Running on Active mode");
                }
                break;
            case 2537357:
                if (s.equals("SAFE")) {
                    System.out.println("Running on Passive mode");
                }
                break;
            case 1925346054:
                if (s.equals("ACTIVE")) {
                    System.out.println("Running on Safe mode");
                }
                break;
        }
    }
}
