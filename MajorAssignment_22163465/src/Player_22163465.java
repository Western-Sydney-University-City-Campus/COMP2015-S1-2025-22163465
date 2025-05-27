public class Player_22163465 {
	private int ranking;
	private String name;
	private String mobile;
	private String email;
	private String clubID;

	// Constructors creating new player
	/*
	 * applies attributes to player
	 * 
	 * @param ranking the ranking of the player
	 * 
	 * @param name the name of the player
	 * 
	 * @param mobile the mobile of the player
	 * 
	 * @param email the email of the player
	 * 
	 * @param clubid the clubid of the player
	 */
	public Player_22163465(int ranking, String name, String mobile, String email, String clubID) {
		this.ranking = ranking;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.clubID = clubID;
	}

	// Getters
	/*
	 * @return gets the current ranking of the player
	 */
	public int getRanking() {
		return ranking;
	}

	/*
	 * @return gets the name of the player
	 */
	public String getName() {
		return name;
	}

	/*
	 * @return gets the mobile number of the player
	 */
	public String getMobile() {
		return mobile;
	}

	/*
	 * @return gets the email of the player
	 */
	public String getEmail() {
		return email;
	}

	/*
	 * @return gets the clubId of player
	 */
	public String getClubID() {
		return clubID;
	}

	// Setters
	/*
	 * allows user to write value
	 */
	/*
	 * @param write the current rank of the player
	 */
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	/*
	 * @param write the name of the player
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * @param write the mobile num of the player
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/*
	 * @param write the email of the player
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/*
	 * @param write the club id of the player
	 */
	public void setClubID(String clubID) {
		this.clubID = clubID;
	}
}