package org.howard.edu.lsp.assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;



public class HelloWorld {
	public static void main(String[] args) {
        // Create a HashMap to store the words and their frequencies
        
        // Read the text file
		Scanner fileScanner = null;
		try {
			fileScanner = new Scanner( new File("/lsp_Spring23/src/org/howard/edu/lsp/assignment2/words.txt"));
	
		} catch (FileNotFoundException e) {
			System.out.println("Unable to open resource");
			System.exit(1);
		}
		HashMap<String, Integer> wordFrequency = new HashMap<>();


	
        // Loop through each line of the file
        while (fileScanner.hasNextLine()) 
        {
            // Read the line and split it into words
            String line = fileScanner.nextLine();
            String[] words = line.split("\\s+");

            // Loop through each word
            for (String word : words) {
                // Check if the word is a number
                if (isNumeric(word)) {
                    continue;
                }

                // Check the word 
                if (word.length() <= 3) {
                    continue;
                }

                // Add the word to the HashMap or increase it by one
                word = word.replaceAll("[^a-zA-Z0-9']", "");
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }

        // Print the results
        for (String word : wordFrequency.keySet()) {
            System.out.println(word + "    " + wordFrequency.get(word));
        }
    }

    // Another function to determine if a string is a number
    private static boolean isNumeric(String word) {
        try {
            Double.parseDouble(word);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}