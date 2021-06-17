/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 John Peachey
 */

package ex41.base;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileCentral {
    //used to manage input  from file
    public Map inputFileGetter() {
        Map<Integer, String> fileInput = new HashMap<Integer, String>();
        int count = 0;
        //try method to make sure file is found
        try {
            //takes in file info
            File theNames = new File("src/main/java/ex41/base/exercise41_input.txt");
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
    public File outputFileCreator(String[] sortedNames){
        //create output file
        File output = new File("src/main/java/ex41/base/exercise41_output.txt");
        //implement a try catch method
        try {
            //set up file writer
            FileWriter fileWriter = new FileWriter(output);
            PrintWriter writer = new PrintWriter(fileWriter);
            //write appropriate statements to file
            writer.printf("Total of %d names%n", sortedNames.length);
            writer.printf("-----------------%n");
            //go through array to print names to file
            for (int i = 0; i < sortedNames.length; i++) {
                writer.printf("%s%n", sortedNames[i]);
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
}
