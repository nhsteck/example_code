package com.nhsteck;

import org.apache.commons.codec.digest.DigestUtils;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import de.mkammerer.argon2.Argon2Factory.Argon2Types;

public class Hash {
    
    public static String generateMD5(String inputString) throws Exception {
        String md5Hex = DigestUtils.md5Hex(inputString);
        return md5Hex;
    }

    public static String generateSHA1(String inputString) throws Exception {
        String sha1Hex = DigestUtils.sha1Hex(inputString);
        return sha1Hex;
    }

    public static String generateSHA256(String inputString) throws Exception {
        String strHex = DigestUtils.sha256Hex(inputString);
        return strHex;
    }

    public static String generateSHA512(String inputString) throws Exception {
        String strHex = DigestUtils.sha512Hex(inputString);
        return strHex;
    }

    public static String generateArgon2(String inputString) throws Exception {
        int iterations = 2;
        int mem = 16;
        int parallelism = 2;
        int saltLen = 16;
        int hashLen = 16;
        Argon2Types type = Argon2Types.ARGON2d; // Argon2Types.ARGON2i and Argon2Types.ARGON2id

        Argon2 argon2 = Argon2Factory.create(type, saltLen, hashLen);
        char []byteInput = inputString.toCharArray();

        String strHex = argon2.hash(iterations, mem, parallelism, byteInput);
        return strHex;
    }

    public static boolean verifyArgon2(String inputString, String hash) throws Exception {
        int saltLen = 16;
        int hashLen = 16;
        Argon2Types type = Argon2Types.ARGON2d; // Argon2Types.ARGON2i and Argon2Types.ARGON2id

        char []byteInput = inputString.toCharArray();
        Argon2 argon2 = Argon2Factory.create(type, saltLen, hashLen);
        boolean isValid = argon2.verify(hash, byteInput);

        return isValid;
    }

}
