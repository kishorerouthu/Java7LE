package com.java7;

/**
 * @author Kishore Routhu on 21/10/17 11:41 AM.
 */
public class UnderScoresInLiterals {
    public static void main(String[] args) {
        long creditCardNumber = 1234_5678_9012_3456L;
        long socialSecurityNumber = 999_99_9999L;
        long balance = 9_99_999;

        System.out.println("CreditCardNumber :: " + creditCardNumber);
        System.out.println("SocialSecurityNumber :: " + socialSecurityNumber);
        System.out.println("Balance :: " + balance);
    }
}
