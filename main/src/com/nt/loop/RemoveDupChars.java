package com.nt.loop;

public class RemoveDupChars {
    static void main(String[] args) {
        String str = "programming";

        //Approach -1

        StringBuilder sb1 = new StringBuilder();
        str.chars().distinct().forEach(c -> sb1.append((char) c));
        System.out.println(sb1);
    }
}
