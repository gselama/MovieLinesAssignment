package service;

import java.io.*;
import java.util.Scanner;

public class MoviePipeline {

    public void loadMovies() throws Exception {

        Scanner sc = new Scanner(new File("\\home\\u8020807\\Downloads\\ml-20m\\movies.csv"));
        //parsing a CSV file into the constructor of Scanner class
        sc.useDelimiter(" ");
        System.out.println("Last 4 char String: " + str.substring(str.length() - 4));
        //setting comma as delimiter pattern
        while (sc.hasNext()) {
            System.out.print(sc.next());
        }
        sc.close();
        //closes the scanner

    }
}
