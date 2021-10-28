package com.nhsteck;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        try {
            String inputString = "nhsteck.com";
            String md5Hex = MD5.generateMD5(inputString);
            System.out.println("MD5 >> " + md5Hex);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
