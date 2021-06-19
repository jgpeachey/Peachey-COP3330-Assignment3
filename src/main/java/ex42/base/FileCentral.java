/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 John Peachey
 */

package ex42.base;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileCentral {
    //used to create a map from input
    public Map fileInput() {

        Map<Integer, String> input = new HashMap<Integer, String>();
        int count = 0;
        //try method to make sure file is found
        try {
            //takes in file info
            File theNames = new File("src/main/java/ex42/base/exercise42_input.txt");
            Scanner in = new Scanner(theNames);
            // reads next input from file
            while (in.hasNext()) {
                //make it to where the scanner separates by , instead of space
                in.useDelimiter(", *");
                //used to deal with \n characters
                if ((count + 1)%3 == 0){
                    in.useDelimiter("\n *");
                    in.skip(",");
                    input.put(count, in.nextLine());
                    ++count;
                }
                //take in things separated by ,
                else {
                    input.put(count, in.next());
                    ++count;
                }
            }
        }
        //catch method to make sure file is found
        catch (FileNotFoundException e){
            System.out.println("File not found.");
            e.printStackTrace();
        }
        // returns next input from file
        return input;
    }

    //creates output from file data & store as string
    public String filePrinter(Map<Integer, String> input){
        //create string
        String output = "";
        //Print start (no data needed)
        System.out.printf("%-10s %-10s %-10s%n", "First", "Last", "Salary");
        System.out.printf("----------------------------%n");
        //loop through 3 variables at a time
        for (int i = 0; i < input.size(); i+=3) {
            //create output with data
            System.out.printf("%-10s %-10s %-10s%n", input.get(i), input.get(i+1), input.get(i+2));
            //add to string
            output += input.get(i)+" "+input.get(i+1)+" "+input.get(i+2)+" ";
        }
        return output;
    }
}
