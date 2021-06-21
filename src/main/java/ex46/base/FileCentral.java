/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 John Peachey
 */

package ex46.base;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class FileCentral {

    public Map fileInput(){
        //create map
        Map<String, Integer> input = new HashMap<>();
        //create buffered reader
        try {
            BufferedReader bread = new BufferedReader(new FileReader("src/main/java/ex46/base/exercise46_input.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return input;
    }

    public void wordCounter(Map<String, Integer> input){

    }
}
