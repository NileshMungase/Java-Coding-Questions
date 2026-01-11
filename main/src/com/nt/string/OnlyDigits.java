package com.nt.string;

public class OnlyDigits {
    public static void main(String[] args) {
        String str = "12345";
        System.out.println(str.matches("\\d+"));
    }
}
