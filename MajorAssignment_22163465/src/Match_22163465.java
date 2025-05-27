public class Match_22163465 {
	private String date;
	private int defenderRank;
	private String defenderName;
	private String challengerName;
	private int challengerRank;
	private String score;
	private String winnerName;

	public Match_22163465(String date, int defenderRank, String defenderName, String challengerName, int challengerRank,
			String score, String winnerName) {
		/*
		 * @param date game played date
		 * 
		 * @param defenderRank the rank of the defender before match
		 * 
		 * @param defenderName the name of the defender
		 * 
		 * @param challengername the name of the challanger
		 * 
		 * @param challengerRank the rank of the challanger before the match
		 * 
		 * @param score the score of the match
		 * 
		 * @param winnerName the name of the winner of the match inputs parameter value
		 * to the instance value
		 * 
		 */
		this.date = date; // store game date
		this.defenderRank = defenderRank;// store defender rank
		this.defenderName = defenderName;// store defender name
		this.challengerName = challengerName;// store challanger name
		this.challengerRank = challengerRank;// store challanger rank
		this.score = score; // store game score
		this.winnerName = winnerName;// stores winner name
	}

	// Getters
	/*
	 * @return gets the date of the match played
	 */
	public String getDate() {
		return date;
	}

	/*
	 * @return gets defenders rank before game
	 */
	public int getDefenderRank() {
		return defenderRank;
	}

	/*
	 * @return gets defender name
	 */
	public String getDefenderName() {
		return defenderName;
	}

	/*
	 * @return gets challengers name
	 */
	public String getChallengerName() {
		return challengerName;
	}

	/*
	 * @return gets challanger rank before game
	 */
	public int getChallengerRank() {
		return challengerRank;
	}

	/*
	 * @return gets game score after game
	 */
	public String getScore() {
		return score;
	}

	/*
	 * @return gets the name of the winner
	 */
	public String getWinnerName() {
		return winnerName;
	}
}