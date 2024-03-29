/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.cs61b.exercises;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import javax.print.DocFlavor.STRING;


class ListExercisesTest {
    private ListExercises listExercises;

    @BeforeEach
    void setUp() {
        this.listExercises = new ListExercises();
    }

    @Test void testSumWithEmptyList() {
        ArrayList<Integer> value = new ArrayList<Integer>();
        assertEquals(0, this.listExercises.sum(value));
    }
    @Test void testSumWithList() {
        ArrayList<Integer> value = new ArrayList<Integer>(
            Arrays.asList(1, 2, 3, 4)
        );
        assertEquals(10, this.listExercises.sum(value));
    }

    @Test void testEvenswithEmptyList() {
        ArrayList<Integer> value = new ArrayList<Integer>();
        assertEquals(
            new ArrayList<Integer>(),
            this.listExercises.evens(value)
        );
    }
    @Test void testEvenswithList() {
        ArrayList<Integer> value = new ArrayList<Integer>(
            Arrays.asList(1, 2, 3, 4)
        );
        assertEquals(
            new ArrayList<Integer>(
                Arrays.asList(2, 4)
            ),
            this.listExercises.evens(value)
        );
    }

    @Test void testCommonWithEmptyList() {
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();

        assertEquals(
            new ArrayList<Integer>(),
            this.listExercises.common(a, b)
        );

    }
    @Test void testCommonWithNoCommonValue() {
        ArrayList<Integer> a = new ArrayList<Integer>(
            Arrays.asList(1, 2)
        );
        ArrayList<Integer> b = new ArrayList<Integer>(
            Arrays.asList(4, 5)
        );

        assertEquals(
            new ArrayList<Integer>(),
            this.listExercises.common(a, b)
        );
    }
    @Test void testCommonWithCommonValue() {
        ArrayList<Integer> a = new ArrayList<Integer>(
            Arrays.asList(3, 1)
        );
        ArrayList<Integer> b = new ArrayList<Integer>(
            Arrays.asList(1, 4)
        );

        assertEquals(
            new ArrayList<Integer>(Arrays.asList(1)),
            this.listExercises.common(a, b)
        );
    }

    @Test void testCount0WithNoOccur() {
        ArrayList<String> word = new ArrayList<String>(
            Arrays.asList(
                "Google",
                "Netflix",
                "Amazone"
            )
        );
        char target = 'c';

        assertEquals(
            0,
            this.listExercises.countOccurrencesOfC(word, target)
        );
    }
    @Test void testCount0WithOccur() {
        ArrayList<String> word = new ArrayList<String>(
            Arrays.asList(
                "Google",
                "Netflix",
                "Amazone",
                "Facebook"
            )
        );
        char target = 'c';

        assertEquals(
            1,
            this.listExercises.countOccurrencesOfC(word, target)
        );
    }
}
