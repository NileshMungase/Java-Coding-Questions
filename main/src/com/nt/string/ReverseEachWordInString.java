package com.nt.string;

public class ReverseEachWordInString {
    static void main(String[] args) {
        String input = "java code";
        System.out.println("Original String: "+input);
        String output = "";
        String[] words = input.split(" ");
        for (String word : words)
        {
            String revWord = "";

            for (int i = word.length()-1;i>=0;i--)
                revWord += word.charAt(i);
            output += revWord + " ";
        }
        System.out.println("Reversed String : "+output);

    }
}
