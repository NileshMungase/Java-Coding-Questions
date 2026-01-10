package com.nt.string;

public class RemvAllWhiteSpace {
    static void main(String[] args) {
        String str = "n i l e s h";
        String str1 = str.replaceAll("\\s","");
        System.out.println(str1);
    }
}
