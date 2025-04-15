
public class Employee {
	


	  private int staffID;              // employee unique identifier
	  private String firstName;
	  private String surname;
	  private String address;           // home address
	  private double annualLeave;       // accrued annual leave available (hours)
	  private double longServiceLeave;  // accrued long service leave available (hours)

	  /**
	   * @return staff Identification number
	   */
	  public Employee() {
	        staffID = -1;
	        firstName = "not known";
	        surname = "not known";
	        address= null;
	        annualLeave = 0.0;
	        longServiceLeave= 0.0;
	        
	        }
	  // Constructed with 4 arguments
	  public Employee(int staffID, String firstName, String surname, String address) {
		  this.staffID = staffID;
	        this.firstName = firstName;
	        this.surname = surname;
	        this.address = address;
	        this.annualLeave = 0.0;
	        this.longServiceLeave = 0.0;
	    }

	  /**
	   * @param ID - The new employees staff identification number
	   */
	  
	  public int getStaffID() { return staffID; }
	  public String getFirstName() { return firstName; }
	  public String getSurname() { return surname; }
	  public String getAddress() { return address; }
	    public double getAnnualLeave() { return annualLeave; }
	    public double getLongServiceLeave() { return longServiceLeave; }
	  
	        
	 
	    public void setStaffID(int staffID) { this.staffID = staffID; }
	    public void setSurname(String surname) { this.surname = surname; }
	    public void setAddress(String address) { this.address = address; }
	    public void setAnnualLeave(double annualLeave) { this.annualLeave = annualLeave; }
	    public void setLongServiceLeave(double longServiceLeave) { this.longServiceLeave = longServiceLeave; } 





	  
	  public boolean requestLeave(char leaveType, double requestedHours) {
	    if (leaveType == 'A') {
	      if (annualLeave > requestedHours) {
	        return true;
	      } else {
	        return false;
	      }
	    } else {
	      if (longServiceLeave > requestedHours) {
	        return true;
	      } else {
	        return false;
	      }
	    }
	  }
	  
	} // end Employee class

