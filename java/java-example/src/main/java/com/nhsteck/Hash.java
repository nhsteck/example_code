package com.nhsteck;

import org.apache.commons.codec.digest.DigestUtils;

public class Hash {
    
    public static String generateMD5(String inputString) throws Exception {
        String md5Hex = DigestUtils.md5Hex(inputString);
        return md5Hex;
    }

    public static String generateSHA1(String inputString) throws Exception {
        String sha1Hex = DigestUtils.sha1Hex(inputString);
        return sha1Hex;
    }

}
