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

class WebsiteCentralTest {

    @Test
    void websiteCreator_creates_a_file() {
        //given
        WebsiteCentral a = new WebsiteCentral();
        Map<String, String> input = new HashMap<String, String>();
        input.put("Site name", "awesomeco");
        input.put("Author", "Max Power");
        input.put("JavaScript", "y");
        input.put("CSS", "y");

        //when
        String expected = "src\\main\\java\\ex43\\Directory\\website\\Website.html";
        File file = a.websiteCreator("src/main/java/ex43/Directory/website/", input);
        String actual = String.valueOf(file.toPath());

        //then
        assertEquals(expected, actual);
    }
}