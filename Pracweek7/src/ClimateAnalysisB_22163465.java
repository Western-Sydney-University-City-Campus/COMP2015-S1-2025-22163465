
/*
 * Name: Dikshant karki
 * Student ID: 22163465
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ClimateAnalysisB_22163465 {
    /**
     * Main method to execute the program.
     * @param args Command line arguments
     * @throws FileNotFoundException 
     */
    public static void main(String[] args) throws FileNotFoundException {
        // Define the filename containing temperature data
        String filename = "TempChange_1961-2022.txt";
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
                // Initialize counter for valid temperature values
                int count = 0;
                // Loop through temperature values (positions 2 to end)
                for (int i = 2; i < values.length; i++) {
                  
                    if (!values[i].isEmpty()) {
                        // string to double and add to sum
                        sum += Double.parseDouble(values[i]);
                       
                        count++;
                    }
                }
                // AVERAGE TEMP CHANGE
                double average = count > 0 ? sum / count : 0;
                
                // OUTPUT FOR THE FOLLOWING COUNTRY
                System.out.printf("", country, code, average);
            }
            
            
        } else {
            // ERROR MESSAGE IF FILE NOT EXISTS
            System.out.println("File not found: " + filename);
        }
    }
}