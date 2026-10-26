package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose a story: \n 1. Goldilocks \n 2. Hansel and Gretel \n 3. Marry had a Little Lamb");
        int storyChoice= scanner.nextInt();
        FileReader fileReader = null;
        try {
            switch(storyChoice){
                case 1:
                     fileReader= new FileReader("goldilocks.txt");
                     break;
                case 2:
                    fileReader= new FileReader("hansel_and_gretel.txt");
                    break;
                case 3:
                    fileReader= new FileReader("mary_had_a_little_lamb.txt");
                    break;
            }

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
