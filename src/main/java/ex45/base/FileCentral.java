/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 John Peachey
 */

package ex45.base;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileCentral {
    //used to manage input  from file
    public Map inputGetter() {
        Map<Integer, String> fileInput = new HashMap<Integer, String>();
        int count = 0;
        //try method to make sure file is found
        try {
            //takes in file info
            File theNames = new File("src/main/java/ex45/base/exercise45_input.txt");
            Scanner in = new Scanner(theNames);
            // reads next input from file
            while (in.hasNextLine()) {
                fileInput.put(count, in.nextLine());
                ++count;
            }
        }
        //catch method to make sure file is found
        catch (FileNotFoundException e){
            System.out.println("File not found.");
            e.printStackTrace();
        }
        // returns next input from file
        return fileInput;
    }

    //creates output file
    public File outputMaker(Map<Integer, String> input, String name){
        //create output file
        File output = new File("src/main/java/ex45/base/"+name+".txt");
        //implement a try catch method
        try {
            //set up file writer
            FileWriter fileWriter = new FileWriter(output);
            PrintWriter writer = new PrintWriter(fileWriter);
            //write appropriate statements to file
            //go through array to print output to file
            for (int i = 0; i < input.size(); i++) {
                writer.printf("%s ", input.get(i));
            }
            fileWriter.close();
        }
        catch (IOException e){
            System.out.println("Failed to write file.");
            e.printStackTrace();
        }
        //return file
        return output;
    }

    // used to swap words in file
    public Map wordSwapper(Map<Integer, String> input){
        Map<Integer, String> swapped = new HashMap<Integer, String>();
        String toSwap = "utilize";
        String updated = "use";
        // loops through map to find words to swap
        for (int i = 0; i < input.size(); i++) {
            // determine if word is the toSwap
            if (input.get(i).contains(toSwap)){
                swapped.put(i, updated);
            }
            else{
                System.out.println(input.get(i));
                swapped.put(i, input.get(i));
            }
        }
        return swapped;
    }
}
