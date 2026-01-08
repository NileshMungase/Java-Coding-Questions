package com.nt.loop;

public class RmvSpecChar {
    static void main(String[] args) {
        String str = "@Ni#le&sh$";

        //Approach -1
       String plainStr =  str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(plainStr);
    }
}
