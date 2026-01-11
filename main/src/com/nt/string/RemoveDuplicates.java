package com.nt.string;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "Nilesh";
        String result = "";

        for (char ch : str.toCharArray()) {
            if (!result.contains(String.valueOf(ch)))
                result += ch;
        }
        System.out.println(result);
    }
}
