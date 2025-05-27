/**
 * 
 */
public class Club_22163465 {
	private String clubID; // contains id for the club
	private String clubName;// Contains the name of the club

// Constructors
	/*
	 * @param clubID id for the club
	 * 
	 * @param clubName name of the club
	 */
	public Club_22163465(String clubID, String clubName) {
		this.clubID = clubID; // inputs parameter value to the instance value
		this.clubName = clubName;
	}

	// Getters
	/*
	 * @returns the id as string
	 * 
	 */
	public String getClubID() {
		return clubID;
	}
	// reads the clubs id
	/*
	 * @returns the name value as string
	 */

	public String getClubName() {
		return clubName;
	}// reads the club name

	// Setters
	/*
	 * @param allows the user to enter new name or id
	 */
	public void setClubID(String clubID) {
		this.clubID = clubID;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
}