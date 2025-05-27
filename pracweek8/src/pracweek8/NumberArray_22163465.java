/*
 * Name: Dikshant karki
 * Student ID: 22163465
 */

package pracweek8;

import java.io.*;
import java.util.Scanner;


public class NumberArray_22163465 {
    /**
     * Main method that drives the program.
     * Reads numbers from a file, then presents a menu of options to the user.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String fileName;
        
        System.out.print("Enter the name of the file to read: ");
        fileName = keyboard.nextLine();
        
        // Create an object to hold both the array and count
        ArrayResult result = readNumbersFromFile(fileName);
        int[] numbers = result.array;
        int count = result.count;
        
        if (count > 0) {
            int choice = 0;
            
            while (choice != 5) {
                // Display menu
                System.out.println("\nMenu Options:");
                System.out.println("1. Display sum of array values");
                System.out.println("2. Display average of array values");
                System.out.println("3. Display array contents");
                System.out.println("4. Create output file");
                System.out.println("5. Exit program");
                System.out.print("Enter your choice (1-5): ");
                
                // Get user choice
                String input = keyboard.nextLine();
                boolean validInput = true;
                
                // Validate input is a number
                for (int i = 0; i < input.length(); i++) {
                    if (!Character.isDigit(input.charAt(i))) {
                        validInput = false;
                        break;
                    }
                }
                
                if (validInput) {
                    choice = Integer.parseInt(input);
                    
                    // Process user choice with if-else statements instead of switch
                    if (choice == 1) {
                        System.out.println("Sum of array values: " + calculateSum(numbers, count));
                    } else if (choice == 2) {
                        System.out.println("Average of array values: " + calculateAverage(numbers, count));
                    } else if (choice == 3) {
                        displayArray(numbers, count);
                    } else if (choice == 4) {
                        boolean success = writeArrayToFile(numbers, count);
                        if (success) {
                            System.out.println("File 'numbersoutput.txt' has been created.");
                        } else {
                            System.out.println("Error creating output file.");
                        }
                    } else if (choice == 5) {
                        System.out.println("Exiting program. Goodbye!");
                    } else {
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                }
            }
        }
        
        keyboard.close();
    }
    
    /**
     * Class to hold both the array and count since methods can only return one value.
     * This is a helper class to return multiple values from the readNumbersFromFile method.
     */
    static class ArrayResult {
        /** The array of numbers read from the file */
        int[] array;
        
        /** The count of numbers actually stored in the array */
        int count;
        
        /**
         
         * @param array The array of numbers
         * @param count The count of numbers in the array
         */
        ArrayResult(int[] array, int count) {
            this.array = array;
            this.count = count;
        }
    }
    
    /**
     * Reads numbers from a file into an array.
     * The array size is limited to 100 elements.
     * 
     * @param fileName The name of the file to read
     * @return An ArrayResult object containing the array and count of numbers read
     */
    public static ArrayResult readNumbersFromFile(String fileName) {
        int[] numbers = new int[100]; // Array with max size of 100
        int count = 0;
        
        File file = new File(fileName);
        Scanner fileScanner = null;
        boolean fileOpened = false;
        
        // Attempt to open the file
        if (file.exists() && file.isFile()) {
            try {
                fileScanner = new Scanner(file);
                fileOpened = true;
            } catch (FileNotFoundException e) {
                // This block will rarely execute since we checked file exists
                System.out.println("Error: File not found.");
            }
        } else {
            System.out.println("Error: File not found.");
        }
        
        // Read from file if successfully opened
        if (fileOpened) {
            // Read up to 100 numbers from the file
            while (fileScanner.hasNextInt() && count < 100) {
                numbers[count] = fileScanner.nextInt();
                count++;
            }
            
            if (fileScanner.hasNextInt()) {
                System.out.println("Warning: File contains more than 100 values. Only the first 100 have been read.");
            }
            
            fileScanner.close();
            System.out.println("Successfully read " + count + " numbers from the file.");
        }
        
        return new ArrayResult(numbers, count);
    }
    
    /**
     * Calculates the sum of all values in the array.
     
     * 
     * @param numbers The array of numbers
     * @param count The count of numbers to consider in the array
     * @return The sum of all values in the array
     */
    public static int calculateSum(int[] numbers, int count) {
        int sum = 0;
        int i = 0;
        
        // Using a while loop instead of for loop
        while (i < count) {
            sum += numbers[i];
            i++;
        }
        
        return sum;
    }
    
    /**
     * Calculates the average of all values in the array.
    
     * @param numbers The array of numbers
     * @param count The count of numbers to consider in the array
     * @return The average of all values in the array, or 0.0 if the array is empty
     */
    public static double calculateAverage(int[] numbers, int count) {
        if (count == 0) {
            return 0.0;
        }
        
        int sum = 0;
        int i = 0;
        
        // Using a do-while loop
        do {
            sum += numbers[i];
            i++;
        } while (i < count);
        
        return (double) sum / count;
    }
    
    /**
     * Displays the contents of the array to the console.
    
     * @param numbers The array of numbers
     * @param count The count of numbers to display from the array
     */
    public static void displayArray(int[] numbers, int count) {
        if (count == 0) {
            System.out.println("The array is empty.");
            return;
        }
        
        System.out.println("Array contents:");
        
        // Using a for loop
        for (int i = 0; i < count; i++) {
            System.out.println(numbers[i]);
        }
    }
    
    /**
     * Writes the contents of the array to a file named "numbersoutput.txt".
     
     * @param numbers The array of numbers
     * @param count The count of numbers to write from the array
     * @return true if the file was successfully created and written, false otherwise
     */
    public static boolean writeArrayToFile(int[] numbers, int count) {
        boolean success = false;
        PrintWriter writer = null;
        
        // Attempt to create the file
        try {
            writer = new PrintWriter("numbersoutput.txt");
            success = true;
        } catch (FileNotFoundException e) {
            return false;
        }
        
        if (success) {
            int i = 0;
            
            // Using a while loop
            while (i < count) {
                writer.println(numbers[i]);
                i++;
            }
            
            writer.close();
        }
        
        return success;
    }
}