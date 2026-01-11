package com.nt.string;

public class SwapString {
    public static void main(String[] args) {
        String a = "Nilesh";
        String b = "Mungase";

        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());

        System.out.println(a + " " + b);
    }
}
