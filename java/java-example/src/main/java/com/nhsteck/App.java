package com.nhsteck;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        try {
            // Generate Argon2
            String inputString = "nhsteck.com";
            String strHex = Hash.generateArgon2(inputString);
            System.out.println("Hex >> " + strHex);

            // Verify Argon2
            boolean isValid = Hash.verifyArgon2(inputString, strHex);
            System.out.println("Verify >> " + isValid);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
