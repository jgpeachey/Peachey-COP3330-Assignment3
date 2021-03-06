/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 John Peachey
 */

package ex41.base;

/*
Create a program that reads in the following list of names from a file called `exercise42_input.txt` and sorts the list alphabetically:

Ling, Mai
Johnson, Jim
Zarnecki, Sabrina
Jones, Chris
Jones, Aaron
Swift, Geoffrey
Xiong, Fong
Then print the sorted list to a file called `exercise41_output.txt` that looks like the following example output.

Example Output
Total of 7 names
-----------------
Johnson, Jim
Jones, Aaron
Jones, Chris
Ling, Mai
Swift, Geoffrey
Xiong, Fong
Zarnecki, Sabrina
Constraint
Don't hard-code the number of names.
Challenges
Implement this program by reading in the names from the user, one at a time, and printing out the sorted results to a file.
Use the program to sort data from a large data set (e.g. census data) and use a profiler to analyze its performance.
 */

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        //uses methods to read and create a sorted list of names
        //used as a central location
        //create class instances
        NameStorage list = new NameStorage();
        FileCentral editor = new FileCentral();

        //create variables needed
        Map<Integer, String> input = new HashMap<Integer, String>();

        //input setup
        input = editor.inputFileGetter();

        //output setup
        editor.outputFileCreator(list.listCreator(input));
    }
}
