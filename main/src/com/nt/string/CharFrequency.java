package com.nt.string;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "banana";

        for (char ch : str.toCharArray()) {
            int count = 0;
            for (char c : str.toCharArray()) {
                if (ch == c)
                    count++;
            }
            System.out.println(ch + " = " + count);
        }
    }
}
