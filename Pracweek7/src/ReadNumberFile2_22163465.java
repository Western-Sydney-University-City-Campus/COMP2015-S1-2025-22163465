/*
 * Name: Dikshant karki
 * Student ID: 22163465
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReadNumberFile2_22163465 {
    /**
     * Main method to execute the file reading process.
     * @param args Command line arguments 
     
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("numbers3.txt");
        
        //IF FILE EXISTS BEFORE RUNNING THE PROGRAM
        if (file.exists()) {
            Scanner scanner = new Scanner(file);
           
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] numbers = line.split(" ");
                System.out.println(numbers[0] + " " + numbers[1]);
            }
            scanner.close();
        } else {
            System.out.println("File not found!");
        }
    }
}