/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 John Peachey
 */

package ex41.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class NameStorage {
    //creates a array so that values can be sorted better
    public String[] listCreator(Map<Integer, String> fileInput){
        //create array
        String[] theNames = new String[fileInput.size()];
        //set map values to the respective array positions
        for (int i = 0; i < fileInput.size(); i++) {
            theNames[i] = fileInput.get(i);
        }
        //sorts the array alphabetically
        Arrays.sort(theNames);
        return theNames;
    }
}
