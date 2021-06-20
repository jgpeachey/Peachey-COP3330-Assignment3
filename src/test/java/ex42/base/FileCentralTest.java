/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 John Peachey
 */

package ex42.base;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FileCentralTest {

    @Test
    void fileInput_assigns_correct_info_to_correct_location() {
        //given
        FileCentral a = new FileCentral();
        Map<Integer, String> actual = new HashMap<Integer, String>();
        Map<Integer, String> expected = new HashMap<Integer, String>();

        //when
        expected.put(0, "Ling");
        expected.put(1, "Mai");
        expected.put(2, "55900");
        expected.put(3, "Johnson");
        expected.put(4, "Jim");
        expected.put(5, "56500");
        expected.put(6, "Jones");
        expected.put(7, "Aaron");
        expected.put(8, "46000");
        expected.put(9, "Jones");
        expected.put(10, "Chris");
        expected.put(11, "34500");
        expected.put(12, "Swift");
        expected.put(13, "Geoffrey");
        expected.put(14, "14200");
        expected.put(15, "Xiong");
        expected.put(16, "Fong");
        expected.put(17, "65000");
        expected.put(18, "Zarnecki");
        expected.put(19, "Sabrina");
        expected.put(20, "51500");
        actual = a.fileInput();

        //then
        assertEquals(expected, actual);
    }

    @Test
    void filePrinter_returns_the_proper_string() {
        //given
        FileCentral a = new FileCentral();
        Map<Integer, String> input = new HashMap<Integer, String>();
        input.put(0, "Ling");
        input.put(1, "Mai");
        input.put(2, "55900");
        input.put(3, "Johnson");
        input.put(4, "Jim");
        input.put(5, "56500");
        input.put(6, "Jones");
        input.put(7, "Aaron");
        input.put(8, "46000");
        input.put(9, "Jones");
        input.put(10, "Chris");
        input.put(11, "34500");
        input.put(12, "Swift");
        input.put(13, "Geoffrey");
        input.put(14, "14200");
        input.put(15, "Xiong");
        input.put(16, "Fong");
        input.put(17, "65000");
        input.put(18, "Zarnecki");
        input.put(19, "Sabrina");
        input.put(20, "51500");

        //when
        String expected = "Ling Mai 55900 Johnson Jim 56500 Jones Aaron 46000 Jones Chris 34500 Swift Geoffrey 14200 Xiong Fong 65000 Zarnecki Sabrina 51500 ";
        String actual = a.filePrinter(input);

        //then
        assertEquals(expected, actual);
    }
}