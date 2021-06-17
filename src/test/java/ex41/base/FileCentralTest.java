package ex41.base;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FileCentralTest {

        @Test
        void fileReader_reads_file() {
            //given
            FileCentral a = new FileCentral();
            Map<Integer, String> actual = new HashMap<Integer, String>();
            Map<Integer, String> expected = new HashMap<Integer, String>();

            //when
            expected.put(0, "Ling, Mai");
            expected.put(1, "Johnson, Jim");
            expected.put(2, "Zarnecki, Sabrina");
            expected.put(3, "Jones, Chris");
            expected.put(4, "Jones, Aaron");
            expected.put(5, "Swift, Geoffrey");
            expected.put(6, "Xiong, Fong");
            actual = a.inputFileGetter();

            //then
            assertEquals(expected, actual);
        }

    @Test
    void creates_correct_output_File() {
        //given
        FileCentral a = new FileCentral();
        String[] input = new String[]{"Johnson, Jim", "Jones, Aaron", "Jones, Chris", "Ling, Mai", "Swift, Geoffrey", "Xiong, Fong", "Zarnecki, Sabrina"};

        //when
        String expected = "Total of 7 names" +
                "-----------------" +
                "Johnson, Jim" +
                "Jones, Aaron" +
                "Jones, Chris" +
                "Ling, Mai" +
                "Swift, Geoffrey" +
                "Xiong, Fong" +
                "Zarnecki, Sabrina";
        String actual = "";
        File output = a.outputFileCreator(input);
        try {
            //takes in file info
            Scanner in = new Scanner(output);
            // reads next input from file
            while (in.hasNextLine()) {
                String next = in.nextLine();
                actual += next;
            }
        }
        //catch method to make sure file is found
        catch (FileNotFoundException e){
            System.out.println("File not found.");
            e.printStackTrace();
        }

        //then
        assertEquals(expected, actual);
    }
}
