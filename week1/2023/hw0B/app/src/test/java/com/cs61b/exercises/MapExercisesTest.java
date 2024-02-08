package com.cs61b.exercises;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;


public class MapExercisesTest {
    private MapExercises mapExercises;
    private TreeMap<Character, Integer> lowerCase;

    @BeforeEach
    private void MapExercises() {
        this.mapExercises = new MapExercises();
    }

    private void givenLowerCase() {
        TreeMap<Character, Integer> expected = new TreeMap<Character, Integer>();

        expected.put('a', 97);
        expected.put('b', 98);
        expected.put('c', 99);
        expected.put('d', 100);
        expected.put('e', 101);
        expected.put('f', 102);
        expected.put('g', 103);
        expected.put('h', 104);
        expected.put('i', 105);
        expected.put('j', 106);
        expected.put('k', 107);
        expected.put('l', 108);
        expected.put('m', 109);
        expected.put('n', 110);
        expected.put('o', 111);
        expected.put('p', 112);
        expected.put('q', 113);
        expected.put('r', 114);
        expected.put('s', 115);
        expected.put('t', 116);
        expected.put('u', 117);
        expected.put('v', 118);
        expected.put('w', 119);
        expected.put('x', 120);
        expected.put('y', 121);
        expected.put('z', 122);

        this.lowerCase = expected;
    }

    @Test void testMapExercises() {
        givenLowerCase();

        assertEquals(
            this.lowerCase,
            this.mapExercises.letterToNum()
        );
    }

    @Test void testSquaresWithEmptyList() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        assertEquals(new TreeMap<Integer, Integer>(), this.mapExercises.squares(nums));
    }
    @Test void testSquaresWithList() {
        ArrayList<Integer> nums = new ArrayList<Integer>(
            Arrays.asList(
                1, 2, 3, 4
            )
        );

        TreeMap<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 1);
        expected.put(2, 4);
        expected.put(3, 9);
        expected.put(4, 16);

        assertEquals(
            expected,
            this.mapExercises.squares(nums)
        );
    }

    @Test void testCountWordsWithEmptyList() {
        ArrayList<String> words = new ArrayList<String>();
        assertEquals(
            new TreeMap<String, Integer>(),
            this.mapExercises.countWords(words)
        );
    }
    @Test void testCountWordswithList() {
        ArrayList<String> words = new ArrayList<String>(
            Arrays.asList(
                "Google",
                "Apple"
            )
        );

        TreeMap<Character, Integer> expected = new TreeMap<Character, Integer>();
        expected.put('G', 1);
        expected.put('o', 2);
        expected.put('g', 1);
        expected.put('l', 2);
        expected.put('e', 2);
        expected.put('A', 1);
        expected.put('p', 2);

        assertEquals(
            expected,
            this.mapExercises.countWords(words)
        );
    }
}
