/*
 * Name: Dikshant karki
 * Student ID: 22163465
 */
package pracweek8;
import java.util.Scanner;


public class ArrayPlay_22163465 {

    static Scanner keyboard = new Scanner(System.in);
    final static String DELIM = "  ";  

    /**
     * Creates and returns an initial array of integers.
     * @return An array of integers with predefined values
     */
    public static int[] createArray() {
        int[] numbers = { 15, 17, 27, 3, 34, 2, 1, 87, 63, 21, 56, 2 };
        return numbers;
    }

    /**
     * Displays all values from the array starting from the first element.
     * @param array The array to be displayed
     */
    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + DELIM);
        }
        System.out.println();
    }

    /**
     * Displays all values from the array starting from the last element.
     * @param array The array to be displayed in reverse order
     */
    public static void displayArrayBackwards(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + DELIM);
        }
        System.out.println();
    }

    /**
     
     * @param array The array to calculate the total for
     * @return The sum of all array values
     */
    public static int totalArray(int[] array) {
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total;
    }

    /**
     * RETURNS THE AVERAGE OF ALL VALUE
     * @param array The array to calculate the average for
     * @return The average of all array values
     */
    public static float averageArray(int[] array) {
        return (float) totalArray(array) / array.length;
    }

    /**
     * USER TO ENTER NEW VALUE
     * @param The array to be filled with new values
     */
    public static void fillArray(int[] array) {
        System.out.println("Enter " + array.length + " new values:");
        for (int i = 0; i < array.length; i++) {
            array[i] = keyboard.nextInt();
        }
    }

    /**
     
     * METHOD TO EXECUTE ARRAY PROGRRAM
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        boolean exitProgram = false;
        int menuChoice = 0;
        int total;
        float average;

        int[] myNumbers = createArray();     

        while (!(exitProgram)) {
            // GET USERS CHOISE
            System.out.println();
            System.out.println("1. Display array");
            System.out.println("2. Display array backwards");
            System.out.println("3. Display array total");
            System.out.println("4. Display array average");
            System.out.println("5. Change numbers in array");
            System.out.println("6. Exit Program");
            System.out.print("Choose a menu option [1 to 6]:");
            menuChoice = keyboard.nextInt();

            // MENU OPTION CHOOSE BY USER
            if (menuChoice == 1) {
                displayArray(myNumbers);
            } else if (menuChoice == 2) {
                displayArrayBackwards(myNumbers);
            } else if (menuChoice == 3) {
                total = totalArray(myNumbers);
                System.out.println("\nTotal: " + total);
            } else if (menuChoice == 4) {
                average = averageArray(myNumbers);
                System.out.println("\nAverage: " + average);
            } else if (menuChoice == 5) {
                fillArray(myNumbers);
            } else if (menuChoice == 6) {
                exitProgram = true;
            }
        }
        System.out.println("Program Terminated.");
    }
}