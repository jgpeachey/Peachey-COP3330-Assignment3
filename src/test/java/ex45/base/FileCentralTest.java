/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 John Peachey
 */

package ex45.base;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FileCentralTest {

    @Test
    void inputGetter() {
    }

    @Test
    void outputMaker() {
    }

    @Test
    void wordSwapper_swaps_words() {
        //given
        ex45.base.FileCentral a = new FileCentral();
        Map<Integer, String> input = new HashMap<>();
        input.put(0, "I");
        input.put(1, "will");
        input.put(3, "never");
        input.put(4, "crave");
        input.put(4, "death");

        //when
        Map<Integer, String> expected = new HashMap<>();
        expected.put(0, "I");
        expected.put(1, "will");
        expected.put(3, "always");
        expected.put(4, "crave");
        expected.put(4, "death");
        Map<Integer, String> actual = a.wordSwapper(input, "never", "always");

        //then
        assertEquals(expected, actual);
    }
}