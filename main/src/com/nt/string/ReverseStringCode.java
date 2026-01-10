package com.nt.string;

public class ReverseStringCode {
    static void main(String[] args) {
        String str = "hello";

        //Approach -1
        char[] chArr = str.toCharArray();
        for (int i = chArr.length - 1; i >= 0; i--) {
            System.out.println(chArr[i]);
        }

        System.out.println(" ");

        //Approach -2
        for (int i = str.length() - 1; i >= 0 ; i--) {
            System.out.println(str.charAt(i));
        }

        System.out.println(" ");

        //Approach -3
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

        System.out.println(" ");

        //Approach -4
        StringBuilder sb1 = new StringBuilder(str);
        System.out.println(sb1.reverse());
    }
}
