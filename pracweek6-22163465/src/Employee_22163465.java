/*
 * Name: Dikshant karki
 * Student ID: 22163465
 */
public class Employee_22163465 {
 
	// attributeS
    private int staffID;
    private String firstName;
    private String surname;
    private String position;
    private int supervisorID;
    private float payRate;
    private float hoursWorked;

    // No-arg constructor 
    
    public Employee_22163465() {
        staffID = -1;
        firstName = "not known";
        surname = "not known";
        position = "not known";
        supervisorID = -1;
        payRate = 16.75f; // minimum payrate
        hoursWorked = 0.0f;
    }

   
    /**
     * Four-argument constructor that initializes basic employee information.
     * @param ID The staff ID
     * @param fName The first name
     * @param sName The surname
     * @param rate The pay rate
     */
    public Employee_22163465(int ID, String fName, String sName, float rate) {
        staffID = ID;
        firstName = fName;
        surname = sName;
        position = "not known";
        supervisorID = -1;
        payRate = rate;
        hoursWorked = 0.0f;
    }

    // All-argument constructor
    /**
     * All-argument constructor that initializes all employee attributes.
     * @param ID The staff ID
     * @param fName The first name
     * @param sName The surname
     * @param rate The pay rate
     * @param pos The position
     * @param supID The supervisor ID
     * @param hours The hours worked
     */
    public Employee_22163465(int ID, String fName, String sName, float rate, String pos, int supID, float hours) {
        staffID = ID;
        firstName = fName;
        surname = sName;
        payRate = rate;
        position = pos;
        supervisorID = supID;
        hoursWorked = hours;
    }

    // Accessor (getter) and mutator (setter) methods
    public int getStaffID() { return staffID; }
    public void setStaffID(int id) { staffID = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String name) { firstName = name; }

    public String getSurname() { return surname; }
    public void setSurname(String name) { surname = name; }

    public String getPosition() { return position; }
    public void setPosition(String pos) { position = pos; }

    public int getSupervisorID() { return supervisorID; }
    public void setSupervisorID(int id) { supervisorID = id; }

    public float getPayRate() { return payRate; }
    public void setPayRate(float rate) {
        if (rate >= 0) payRate = rate;
    }

    public float getHoursWorked() { return hoursWorked; }
    public void setHoursWorked(float hours) {
        if (hours >= 0) hoursWorked = hours;
    }

  
    /**
     
     * @return The calculated gross pay 
     */
    public float calculateGrossPay() {
        return payRate * hoursWorked;
    }
}
