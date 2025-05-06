/*
 * Name: Dikshant karki
 * Student ID: 22163465
 */
import java.util.Scanner;

public class EmployeeDemo_22163465 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create accountant using no-arg constructor
        Employee_22163465 accountant = new  Employee_22163465();
        System.out.println("Accountant (no-arg constructor):");
        displayEmployee_22163465(accountant);

        //Create cleaner using four-argument constructor and user input
        System.out.println("\nEnter details for Cleaner:");
        System.out.print("Staff ID: ");
        int cleanerID = input.nextInt();
        System.out.print("First Name: ");
        String cleanerFirst = input.next();
        System.out.print("Surname: ");
        String cleanerLast = input.next();
        float cleanerRate;
        do {
            System.out.print("Pay Rate: ");
            cleanerRate = input.nextFloat();
            if (cleanerRate < 0) System.out.println("Pay rate must be non-negative.");
        } while (cleanerRate < 0);

        Employee_22163465 cleaner = new  Employee_22163465(cleanerID, cleanerFirst, cleanerLast, cleanerRate);

        input.nextLine(); // consume newline
        System.out.print("Position: ");
        String cleanerPos = input.nextLine();
        cleaner.setPosition(cleanerPos);

        System.out.print("Supervisor ID: ");
        int cleanerSup = input.nextInt();
        cleaner.setSupervisorID(cleanerSup);

        float cleanerHours;
        do {
            System.out.print("Hours Worked: ");
            cleanerHours = input.nextFloat();
            if (cleanerHours < 0) System.out.println("Hours worked must be non-negative.");
        } while (cleanerHours < 0);
        cleaner.setHoursWorked(cleanerHours);

        System.out.println("\nCleaner Details:");
        displayEmployee_22163465(cleaner);
        System.out.printf("Gross Pay: $%.2f\n", cleaner.calculateGrossPay());

        // Create technician using all-argument constructor and user input
        System.out.println("\nEnter details for Technician:");
        System.out.print("Staff ID: ");
        int techID = input.nextInt();
        System.out.print("First Name: ");
        String techFirst = input.next();
        System.out.print("Surname: ");
        String techLast = input.next();

        float techRate;
        do {
            System.out.print("Pay Rate: ");
            techRate = input.nextFloat();
            if (techRate < 0) System.out.println("Pay rate must be non-negative.");
        } while (techRate < 0);

        input.nextLine(); // consume newline
        System.out.print("Position: ");
        String techPos = input.nextLine();

        System.out.print("Supervisor ID: ");
        int techSup = input.nextInt();

        float techHours;
        do {
            System.out.print("Hours Worked: ");
            techHours = input.nextFloat();
            if (techHours < 0) System.out.println("Hours worked must be non-negative.");
        } while (techHours < 0);

        Employee_22163465 technician = new  Employee_22163465(techID, techFirst, techLast, techRate, techPos, techSup, techHours);

        System.out.println("\nTechnician Details:");
        displayEmployee_22163465(technician);
        System.out.printf("Gross Pay: $%.2f\n", technician.calculateGrossPay());

        input.close();
    }

    
    private static void displayEmployee_22163465(Employee_22163465 accountant) {
		// TODO Auto-generated method stub
		
	}


	/**
     
     * @param METHOD TO DISPLAY EMPLOYEE INFO
     */
    public static void displayEmployee( Employee_22163465 emp) {
        System.out.println("Staff ID: " + emp.getStaffID());
        System.out.println("First Name: " + emp.getFirstName());
        System.out.println("Surname: " + emp.getSurname());
        System.out.println("Position: " + emp.getPosition());
        System.out.println("Supervisor ID: " + emp.getSupervisorID());
        System.out.println("Pay Rate: " + emp.getPayRate());
        System.out.println("Hours Worked: " + emp.getHoursWorked());
    }
}

