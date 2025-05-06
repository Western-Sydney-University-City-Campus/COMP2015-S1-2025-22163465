/*
 * Name: Dikshant karki
 * Student ID: 22163465
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

	
	public class ReadNumberFile4_22163465 {
	    /**
	     * Main method to execute the file reading process.
	     * @param args Command line arguments 
	     
	     */
	    public static void main(String[] args) throws FileNotFoundException {
	        File file = new File("numbers6.txt");
	        
	        // IF FILE EXIST BEFORE RUNNING
	        if (file.exists()) {
	            Scanner scanner = new Scanner(file);
	            
	            while (scanner.hasNextLine()) {
	                String line = scanner.nextLine();
	                String[] values = line.split(" ");
	                System.out.println(values[0] + " " + values[1] + " " + values[2]);
	            }
	            scanner.close();
	        } else {
	            System.out.println("File not found!");
	        }
	    }
	}

