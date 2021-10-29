package com.nhsteck;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        try {
            String inputString = "nhsteck.com";
            String strHex = Hash.generateSHA256(inputString);
            System.out.println("Hex >> " + strHex);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
