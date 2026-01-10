package com.nt.string;

import java.util.HashMap;
import java.util.Map;

public class OccurOfEachChar {
    static void main(String[] args) {
        String input = "hello";
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = input.toCharArray();
        for(char ch : chars)
        {
            if(!map.containsKey(ch))
            {
                map.put(ch, 1);
            }
            else
            {
                int value = map.get(ch);
                Integer put = map.put(ch, value+1);
            }
        }
        System.out.println(map);
    }
}
