package com.nhsteck;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        try {
            String inputString = "nhsteck.com";
            String strHex = Hash.generateSHA1(inputString);
            System.out.println("MD5 >> " + strHex);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
