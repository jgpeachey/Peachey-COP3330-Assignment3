/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 John Peachey
 */

package ex45.base;

/*
Given an input file named `exercise45_input.txt`, read the file and look for all occurrences of the word utilize. Replace each occurrence with use. Write the modified file to a new file.

Example Output
Given the input file of

One should never utilize the word "utilize" in writing. Use "use" instead.
For example, "She uses an IDE to write her Java programs" instead of "She
utilizes an IDE to write her Java programs".
The program should generate

One should never use the word "use" in writing. Use "use" instead.
For example, "She uses an IDE to write her Java programs" instead of "She
uses an IDE to write her Java programs".
Constraints
Prompt for the name of the output file.
Write the output to a new file.
Challenges
Modify the program to track the number of replacements and report that to the screen when the program finishes.
Create a configuration file that maps “bad” words to “good” words and use this file instead of a hard-coded value.
Modify the program so that it can handle every file in a folder of files instead of a single file.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //uses methods to read and create a sorted list of names
        //used as a central location
        //create class instances
        ex45.base.FileCentral editor = new FileCentral();

        //create variables needed
        Map<Integer, String> input = new HashMap<Integer, String>();

        //input setup
        input = editor.inputGetter();
        String name = userInput();

        //output setup
        editor.outputMaker(editor.wordSwapper(input, "utilize", "use"), name);
    }

    public static String userInput(){
        System.out.println("What would you like the name of the file to be?");
        String name = in.nextLine();
        return name;
    }
}
