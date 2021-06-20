/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 John Peachey
 */

package ex43.base;

/*
Create a program that generates a website skeleton with the following specifications:

Prompt for the name of the site.
Prompt for the author of the site.
Ask if the user wants a folder for JavaScript files.
Ask if the user wants a folder for CSS files.
Generate an index.html file that contains the name of the site inside the <title> tag and the author in a <meta> tag.
Example Output
Site name: awesomeco
Author: Max Power
Do you want a folder for JavaScript? y
Do you want a folder for CSS? y
Created ./website/awesomeco
Created ./website/awesomeco/index.html
Created ./website/awesomeco/js/
Created ./website/awesomeco/css/
The user should then find these files and directories created in the working directory of your program.

Challenges
Implement this in a scripting language on Windows, OSX, and Linux.
Implement this as a web application that provides the specified site as a zip file.
 */

import ex41.base.NameStorage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    private static final Scanner in = new Scanner(System.in);
    static WebsiteCentral web = new WebsiteCentral();
    static FileCentral file = new FileCentral();

    public static void main(String[] args) {

        //declare variables
        Map<String, String> input = new HashMap<String, String>();
        String directory = "";

        //get input
        input = userInput();
        //create directory
        directory = file.directoryMaker(input);
        //create website
        web.websiteCreator(directory, input);

        // print output
        outputCreator(directory, input);
    }

    // used to take in user input
    public static Map userInput(){
        //create map to be returned
        Map<String, String> input = new HashMap<String, String>();
        // create input questions and assign variables
        System.out.println("Site name: ");
        input.put("Site name", in.nextLine());
        System.out.println("Author: ");
        input.put("Author", in.nextLine());
        System.out.println("Do you want a folder for JavaScript? ");
        input.put("JavaScript", in.nextLine());
        System.out.println("Do you want a folder for CSS? ");
        input.put("CSS", in.nextLine());
        //return data stored in map
        return input;
    }

    public static void outputCreator(String directory, Map<String, String> input){
        if(file.isFile(directory)){
            System.out.println("Created "+directory);
        }
        if(file.isFile(directory+"/Website.html")){
            System.out.println("Created "+directory+"Website.html");
        }
        if(file.isFile(directory+"/js")){
            System.out.println("Created "+directory+"js/");
        }
        if(file.isFile(directory+"/css")){
            System.out.println("Created "+directory+"css/");
        }
    }
}
