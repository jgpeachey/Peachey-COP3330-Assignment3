/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 John Peachey
 */

package ex41.base;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class NameStorageTest {

    @Test
    void listCreator_sorts_alphabetically() {
        //given
        NameStorage a = new NameStorage();
        Map<Integer, String> sample = new HashMap<Integer, String>();
        String[] actual = new String[sample.size()];

        //when
        sample.put(0, "Ling, Mai");
        sample.put(1, "Johnson, Jim");
        sample.put(2, "Zarnecki, Sabrina");
        sample.put(3, "Jones, Chris");
        sample.put(4, "Jones, Aaron");
        sample.put(5, "Swift, Geoffrey");
        sample.put(6, "Xiong, Fong");
        String[] expected = new String[]{"Johnson, Jim", "Jones, Aaron", "Jones, Chris", "Ling, Mai", "Swift, Geoffrey", "Xiong, Fong", "Zarnecki, Sabrina"};
        actual = a.listCreator(sample);

        String is = "";
        String should = "";
        for (int i = 0; i < expected.length; i++) {
            is = expected[i];
            should = actual[i];
        }

        //then
        assertEquals(is, should);
    }
}