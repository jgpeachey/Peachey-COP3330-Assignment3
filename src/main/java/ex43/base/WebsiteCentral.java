/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 John Peachey
 */

package ex43.base;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WebsiteCentral {
    FileCentral file = new FileCentral();

    //used to create website file
    public File websiteCreator(String directory, Map<String, String> input){
        String html = "<div><h1>Welcome to "+input.get("Site name")+"</h1><p>Created by: "+input.get("Author")+"</p></div>";
        File webFile = file.fileMaker(directory, "Website.html");
        // create a buffered writer
        try {
            BufferedWriter buf = new BufferedWriter(new FileWriter(webFile));
            buf.write(html);
            buf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return webFile;
    }

}
