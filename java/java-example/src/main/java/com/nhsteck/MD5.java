package com.nhsteck;

import org.apache.commons.codec.digest.DigestUtils;

public class MD5 {
    
    public static String generateMD5(String inputString) throws Exception {
        String md5Hex = DigestUtils.md5Hex(inputString);
        return md5Hex;
    }

}
