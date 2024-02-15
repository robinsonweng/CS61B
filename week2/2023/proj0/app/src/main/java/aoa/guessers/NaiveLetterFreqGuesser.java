package aoa.guessers;

import aoa.utils.FileUtils;
import java.util.List;
import java.util.Map;

import java.util.TreeMap;

public class NaiveLetterFreqGuesser implements Guesser {
    private final List<String> words;

    public NaiveLetterFreqGuesser(String dictionaryFile) {
        words = FileUtils.readWords(dictionaryFile);
    }

    @Override
    /** Makes a guess which ignores the given pattern. */
    public char getGuess(String pattern, List<Character> guesses) {
        return getGuess(guesses);
    }

    /** Returns a map from a given letter to its frequency across all words.
     *  This task is similar to something you did in hw0b! */
    public Map<Character, Integer> getFrequencyMap() {
        Map<Character, Integer> result = new TreeMap<>();
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

    /** Returns the most common letter in WORDS that has not yet been guessed
     *  (and therefore isn't present in GUESSES). */
    public char getGuess(List<Character> guesses) {
        // TODO: Fill in this method.
        return '?';
    }

    public static void main(String[] args) {
        NaiveLetterFreqGuesser nlfg = new NaiveLetterFreqGuesser("data/example.txt");
        System.out.println("list of words: " + nlfg.words);
        System.out.println("frequency map: " + nlfg.getFrequencyMap());

        List<Character> guesses = List.of('e', 'l');
        System.out.println("guess: " + nlfg.getGuess(guesses));
    }
}
