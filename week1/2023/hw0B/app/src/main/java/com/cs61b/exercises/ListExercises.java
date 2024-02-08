package com.cs61b.exercises;

import java.util.ArrayList;

public class ListExercises {
    public int sum(ArrayList<Integer> target) {
        if (target.isEmpty()) {
            return 0;
        }

        int result = 0;
        int targetLength = target.size();
        for (int i=0; i<targetLength; i++) {
            result += target.get(i);
        }

        return result;
    }
    public ArrayList<Integer> evens(ArrayList<Integer> target) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int targetLength = target.size();
        for (int i=0; i<targetLength; i++) {
            int value = target.get(i);
            if (value % 2 == 0) {
                result.add(value);
            }
        }

        return result;
    }
    public ArrayList<Integer> common(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (a.isEmpty() || b.isEmpty()) {
            return result;
        }

        if (b.size() > a.size()) {
            // promise the longest array is always a
            ArrayList<Integer> temp = new ArrayList<Integer>();
            a = temp;
            a = b;
            b = temp;
        }

        // use the shortest length
        int bLength = b.size();
        for (int i=0; i<bLength; i++) {
            int bElement = b.get(i);
            if (a.contains(bElement)) {
                result.add(bElement);
            }
        }

        return result;
    }
    public int countOccurrencesOfC(ArrayList<String> words, char c) {
        int result = 0;
        int wordLength = words.size();
        for (int i=0; i<wordLength; i++) {
            String w = words.get(i);
            if (!w.contains(Character.toString(c))) {
                continue;
            }

            int wLength = w.length();
            for (int j=0; j<wLength; j++) {
                if (w.charAt(j) == c) {
                    result ++;
                }
            }
        }

        return result;
    }
}
