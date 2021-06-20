/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 John Peachey
 */

package ex43.base;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileCentral {

    // used to make the directory at a specific location
    public String directoryMaker(Map<String, String> input){
        // create directory location name
            //creates the customized location names
        String name = subDirectoryMaker(input);
        String directory = "src/main/java/ex43/Directory/website/";
        // create file
        File file = fileMaker(directory, name);
        //make directory
        file.mkdirs();
        directory += input.get("Site name")+"/";

        return directory;
    }

    public String directoryMaker(String input){
        // create directory location name
        //creates the customized location names
        String name = input;
        String directory = "src/main/java/ex43/Directory/website/";
        // create file
        File file = fileMaker(directory, name);
        //make directory
        file.mkdirs();
        directory += name;

        return directory;
    }

    //creates string for directory
    public String subDirectoryMaker(Map<String, String> input){
        //creates standard directory name
        String name = input.get("Site name")+"/";
        //adds javaScript Folder if prompted
        if ((input.get("JavaScript")).equalsIgnoreCase("y") && (input.get("CSS")).equalsIgnoreCase("y")){
            directoryMaker(name+"js/");
            name += "css/";
        }
        else if ((input.get("JavaScript")).equalsIgnoreCase("y")){
            name += "js/";
        }
        //adds CSS Folder if prompted
        else if ((input.get("CSS")).equalsIgnoreCase("y")){
            name += "css/";
        }
        return name;
    }

    //used to take in directory and make a new file with a given name inside
    public File fileMaker(String directory, String fileName){
        // configure file name
        File file = new File(directory+fileName);
        return file;
    }

    //determine if file location is there
    public boolean isFile(String location){
        // create boolean
        boolean exist = false;
        // create temp file
        File temp = new File(location);
        // test if file or directory exist
        if (temp.isFile() || temp.isDirectory()) {
            exist = true;
        }
        return exist;
    }
}
