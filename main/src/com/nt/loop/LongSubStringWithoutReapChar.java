package com.nt.loop;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongSubStringWithoutReapChar {
    static void main(String[] args) {
        LengthOfLongestSubString("java");
    }
        public static void LengthOfLongestSubString(String s)
        {
            String LongestSubString = null;
            int LongestSubStringLength = 0;

            Map<Character, Integer> map = new LinkedHashMap<>();

            char[] arr = s.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                char ch = arr[i];
                if(!map.containsKey(ch))
                {
                    map.put(ch,i);
                }
                else
                {
                    i = map.get(ch);
                    map.clear();
                }
                if(map.size()>LongestSubStringLength)
                {
                    LongestSubStringLength = map.size();
                    LongestSubString = map.keySet().toString();
                }
            }

            System.out.println("The Longest Substring : " + LongestSubString);
            System.out.println("The Longest Substring length : "+LongestSubStringLength);
        }
}
