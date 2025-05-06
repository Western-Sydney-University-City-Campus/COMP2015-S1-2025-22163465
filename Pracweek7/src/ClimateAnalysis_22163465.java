
/*
 * Name: Dikshant karki
 * Student ID: 22163465
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ClimateAnalysis_22163465 {
    /**
     * Main method to execute the program.
     * @param args Command line arguments 
     */
    public static void main(String[] args) throws FileNotFoundException {
        // Define the filename containing temperature data
        String filename = "TempChange_1970-1979.txt";
        
        // Create a File object for the specified filename
        File file = new File(filename);
        
        // Check if file exists before attempting to read
        if (file.exists()) {
            // Create a Scanner object to read the file
            Scanner scanner = new Scanner(file);
            
            // Print the file being processed
            System.out.println("File Processed: " + filename);
            // Print column headers for the output
            System.out.printf("", "Country", "Code", "Avg");
            
            // Process each line in the file
            while (scanner.hasNextLine()) {
                // Read the next line from the file
                String line = scanner.nextLine();
                // Split the line into individual values using space as delimiter
                String[] values = line.split(" ");
                
                // Extract country name from the first value
                String country = values[0];
                // Extract country code from the second value
                String code = values[1];
                
                // Initialize sum for temperature changes
                double sum = 0;
                
                for (int i = 2; i < 12; i++) {
                    // STRING TO DOUBLE AN DADD IT UP
                    sum += Double.parseDouble(values[i]);
                }
                // Calculate average temperature change
                double average = sum / 10;
                
                // FORMATTED OUTPUT FOR THE FOLLOWING COUNTRY
                System.out.printf("", country, code, average);
            }
            
            
        } else {
            // PRINTS ERROR MESSAGE IF FILE NOT FOUND
            System.out.println("File not found: " + filename);
        }
    }
}