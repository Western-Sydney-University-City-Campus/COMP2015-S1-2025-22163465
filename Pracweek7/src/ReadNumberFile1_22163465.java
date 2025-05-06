

/*
 * Name: Dikshant karki
 * Student ID: 22163465
 */	
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReadNumberFile1_22163465 {
    /**
     * Main method to execute the file reading process.
     * @param args Command line arguments 
     
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("numbers.txt");
        
        // IF FILE EXISTS BEFORE EXUCTING THE PROGRAM
        if (file.exists()) {
            Scanner scanner = new Scanner(file);
            // READ AND PRINT INTEGER FROM  THE FILE
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                System.out.println(number);
            }
            scanner.close();
        } else {
            System.out.println("File not found!");
        }
    }
}