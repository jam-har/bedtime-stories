package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BedtimeStories {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("goldilocks.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            int i = 1;
            while ((line = bufferedReader.readLine()) != null) {          // readLine gives null at the end of the file
                System.out.println(i +". " + line);
                i ++;
            }
        }
        catch(Exception exception) {
            System.out.println("Error");

        }
    }
}
