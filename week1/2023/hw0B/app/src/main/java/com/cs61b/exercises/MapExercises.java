package com.cs61b.exercises;

// interface
import java.util.List;
import java.util.Map;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.TreeMap;


public class MapExercises {
    public Map<Character, Integer> letterToNum() {
        Map<Character, Integer> result = new TreeMap<Character, Integer>();

        // 97 - 122
        int asciiStart = 97;
        int asciiStop = 122;
        for (int i=asciiStart; i<=asciiStop; i++) {
            result.put(((char) i), i);
        }
        return result;
    }
    public Map<Integer, Integer> squares(List<Integer> nums) {
        Map<Integer, Integer> result = new TreeMap<Integer, Integer>();
        if (nums.isEmpty()) {
            return result;
        }

        int numsLength = nums.size();
        for (int i=0; i<numsLength; i++) {
            int num = nums.get(i);
            if (result.containsKey(num)) {
                continue;
            }

            result.put(num, num * num);
        }

        return result;
    }
    public Map<Character, Integer> countWords(List<String> words) {
        TreeMap<Character, Integer> result = new TreeMap<Character, Integer>();
        if (words.isEmpty()) {
            return result;
        }

        int wordsLength = words.size();
        for (int i=0; i<wordsLength; i++) {
            String w = words.get(i);

            int wLength = w.length();
            for (int j=0; j<wLength; j++) {
                char c = w.charAt(j);
                if (!result.containsKey(c)) {
                    result.put(c, 1);
                    continue;
                }

                int temp = result.get(c);
                result.put(c, temp + 1);
            }
        }

        return result;
    }
}
