/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 John Peachey
 */

package ex43.base;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FileCentralTest {

    @Test
    void directoryMaker_map_input() {
        //given
        ex43.base.FileCentral a = new FileCentral();
        Map<String, String> input = new HashMap<String, String>();
        input.put("Site name", "awesomeco");
        input.put("Author", "Max Power");
        input.put("JavaScript", "y");
        input.put("CSS", "y");

        //when
        String expected = "src/main/java/ex43/Directory/website/awesomeco/";
        String actual = a.directoryMaker(input);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void directoryMaker_string_input() {
        //given
        ex43.base.FileCentral a = new FileCentral();

        //when
        String expected = "src/main/java/ex43/Directory/website/awesomeco/";
        String actual = a.directoryMaker("awesomeco");

        //then
        assertEquals(expected, actual);
    }

    @Test
    void subDirectoryMaker_creates_proper_strings() {
        //given
        ex43.base.FileCentral a = new FileCentral();
        Map<String, String> input = new HashMap<String, String>();
        input.put("Site name", "awesomeco");
        input.put("Author", "Max Power");
        input.put("JavaScript", "y");
        input.put("CSS", "y");

        //when
        String expected = "awesomeco/css/";
        String actual = a.subDirectoryMaker(input);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void fileMaker_does_make_file() {
        //given
        ex43.base.FileCentral a = new FileCentral();

        //when
        String expected = "src\\main\\java\\ex43\\Directory\\website\\awesomeco";
        File file = a.fileMaker("src/main/java/ex43/Directory/website/", "awesomeco/");
        String actual = String.valueOf(file.toPath());

        //then
        assertEquals(expected, actual);
    }

    @Test
    void isFile_returns_true() {
        //given
        ex43.base.FileCentral a = new FileCentral();

        //when
        boolean expected = true;
        boolean actual = a.isFile("src/main/java/ex43/");

        //then
        assertEquals(expected, actual);
    }
}