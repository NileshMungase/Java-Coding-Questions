package com.nt.string;

public class FirstNonRepeat {
    public static void main(String[] args) {
        String str = "Nilesh";

        for (char ch : str.toCharArray()) {
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println(ch);
                break;
            }
        }
    }
}

