
public class Employee {
	private static int staffID;
    private static String firstName;
    private static String surname;
    private static String address;
    private static double annualLeave;
    private static double longServiceLeave;

    
    public static int getStaffID() 
    { return staffID;
    }
    public static String getFirstName()
    { 
    	return firstName;
    }
    public static String getSurname() { 
    	return surname; 
    }
    public static String getAddress() { 
    	return address;
    	}
    public static double getAnnualLeave() {
    	return annualLeave;
    	}
    public static double getLongServiceLeave() { 
    	return longServiceLeave; 
    	}
    
    public void setStaffID(int staffID) { 
    	this.staffID = staffID;
    	}
    public void setFirstName(String firstName) { 
    	this.firstName = firstName;
    	}
    public void setSurname(String surname) { 
    	this.surname = surname; }
    public void setAddress(String address) { 
    	this.address = address; 
    }
    public void setAnnualLeave(double annualLeave) { 
    	this.annualLeave = annualLeave; }
    public void setLongServiceLeave(double longServiceLeave) {
    	this.longServiceLeave = longServiceLeave;
    	}
    
    public Employee() {
        this.staffID = -1;
        this.firstName = "not known";
        this.surname = "not known";
    }
    
    public Employee(int staffID, String firstName, String surname, String address) {
        this.staffID = staffID;
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;
}public boolean requestLeave(String leaveType, int daysRequested) {
    double hoursRequested = daysRequested * 8.0;

    if (leaveType.equalsIgnoreCase("annual")) {
        if (annualLeave >= hoursRequested) {
            annualLeave -= hoursRequested;
            return true;
        }
    } else if (leaveType.equalsIgnoreCase("long service")) {
        if (longServiceLeave >= hoursRequested) {
            longServiceLeave -= hoursRequested;
            return true;
        }
    }
	return false;
}}
