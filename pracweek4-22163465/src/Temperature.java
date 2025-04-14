import java.util.Scanner;

public class Temperature {

	private static double coldSum;
	private static double mildSum;
	private static double extremeSum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner kb = new Scanner(System.in);
		 int freezdays= 0, colddays=0, milddays=0, warmdays=0 , hotdays=0 , extremedays=0;
		int freezeSum=0 , coldsum=0 , mildsum=0 , warmsum=0 , hotsum=0, extremesum=0 ;
		
		System.out.println("Welcome to the Sydney Daily Maximum Temperature Analyser!");
        System.out.println("Enter the daily maximum temperatures for Sydney. Enter -999 to finish.");
				 
        int day = 1;
        while(true)  {
            // Ask the user to enter the temperature for a specific day
            double temperature = getValidTemperature(kb, "Enter temperature for day " + day + ": ");

            // If the user enters -999, we stop asking for temperatures
            if (temperature == -999) {
                return;
            }

            // Categorize the temperature and update the appropriate counters and sums
            if (temperature < 0) {
                freezdays++;
                freezeSum += temperature;
            } else if (temperature < 10) {
                colddays++;
                coldsum += temperature;
            } else if (temperature < 20) {
                milddays++;
                mildsum += temperature;
            } else if (temperature < 30) {
                warmdays++;
                warmsum += temperature;
            } else if (temperature < 40) {
                hotdays++;
                hotsum += temperature;
            } else {
                extremedays++;
                extremesum += temperature;
            }

            day++; // Move to the next day
        }
	}

	private static double getValidTemperature(Scanner kb, String temp) {
		// TODO Auto-generated method stubystem.out.print(prompt);
		double temperature = 0;
		System.out.print(temp);
            temperature = kb.nextDouble();
            if (temperature == -999) {
                return temperature; 
            } else if (temperature >= -10 && temperature <= 50) {
                return temperature; 
            } else {
                System.out.println("Temperature must be between -10 and 50. Please try again.");
            }
		
	
return temperature;

}
	public static void printCategoryAnalysis(String category, int count, double sum) {
        if (count == 0) {
            System.out.println(category + ": 0 day(s), average temperature: N/A");
        } else {
            double average = sum / count;
            System.out.printf("%s: %d day(s), average temperature: %.1f°C\n", category, count, average);
        }
    }}
