import java.util.Scanner;
public class EmployeeDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        final double DAY_HOURS = 8.0;

        
        Employee accountant = new Employee();
        System.out.println("Initial values for accountant object data fields:");
        System.out.println("Staff ID:" + accountant.getStaffID());
        System.out.println("First Name:" + accountant.getFirstName());
        System.out.println("Surname:" + accountant.getSurname());
        System.out.printf("Annual Leave:", accountant.getAnnualLeave());
        System.out.printf("Long Service Leave:", accountant.getLongServiceLeave());
        System.out.println("Home Address:" + accountant.getAddress());

        // d) Create a new employee using user input
        System.out.println("\nEnter details for a new employee:");
        System.out.print("Staff ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("First Name: ");
        String name = scanner.nextLine();

        System.out.print("Surname: ");
        String Surename = scanner.nextLine();

        System.out.print("Address: ");
        String address = scanner.nextLine();

        Employee geek = new Employee(id, name, Surename, address);
        System.out.println("\nGeek object state:");
        System.out.println("Staff ID:\t\t" + geek.getStaffID());
        System.out.println("Name:\t\t\t" + geek.getFirstName() + " " + geek.getSurname());
        System.out.println("Address:\t\t" + geek.getAddress());

        
        geek.setAnnualLeave(40.0);
        System.out.println("\nAfter adding 40 hours of annual leave:");
        System.out.println("Annual Leave:\t\t" + geek.getAnnualLeave());

        
        System.out.print("\nDo you want to take leave? (yes/no): ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            System.out.print("Leave type (annual/long service): ");
            String type = scanner.nextLine();

            System.out.print("Number of days: ");
            int days = scanner.nextInt();

            boolean granted = geek.requestLeave(type, days);

            if (granted) {
                System.out.println("Leave granted. Remaining leave:");
            } else {
                System.out.println("Insufficient leave. No leave granted.");
            }

            System.out.printf("Annual Leave: %.2f\\n ", geek.getAnnualLeave());
            System.out.printf("Long Service Leave: %.2f\\n", geek.getLongServiceLeave());
        }

        scanner.close();
    }


	}


