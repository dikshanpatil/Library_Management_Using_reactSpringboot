package com.dikshadesign.springbootlibrary.utils;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class ExtractJWT {

    public static String payloadJWTExtraction(String token, String extraction){

        token.replace("Bearer ","");

        String[] chunks = token.split("\\.");//split the token in header,payload,signature that JWT has
        Base64.Decoder decoder = Base64.getUrlDecoder();//decide them

        String payload = new String(decoder.decode(chunks[1]));//decode payload

        String[] entries = payload.split(",");//split again to get sub from jwt

        Map<String, String> hash = new HashMap<>();


        for(String entry : entries){
            String[] key = entry.split(":");
            if(key[0].equals(extraction)){
                int remove = 1;
                if(key[1].endsWith("}")){
                    remove = 2;
                }
                key[1] = key[1].substring(0, key[1].length() - remove);//to remove last "} this two things
                key[1] = key[1].substring(1);//to remove first " this thing
                hash.put(key[0], key[1]);
            }
        }
        if(hash.containsKey(extraction)){
            return hash.get(extraction);
        }
        return null;
    }
}
