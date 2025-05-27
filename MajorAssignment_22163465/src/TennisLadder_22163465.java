import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.io.FileNotFoundException;

public class TennisLadder_22163465 {
    
    private static ArrayList<Player_22163465> players = new ArrayList<>();// STORES NAME OF ALL PLAYER
    
    private static ArrayList<Match_22163465> matches = new ArrayList<>();//STORES MEMORY OF ALL MATCHES
    
    private static ArrayList<Club_22163465> clubs = new ArrayList<>();//Stores the name of all clubs
    
    private static Scanner scanner = new Scanner(System.in);//reads value from keyboard

   // files which we created and where all the value are saved and compared
    private static final String PLAYER_FILE = "player.csv";
    private static final String MACHES_FILE = "maches.csv"; 
    private static final String CLUB_FILE = "clubs.csv";
	
	private static final String PLAYERS_FILE = PLAYER_FILE;

	private static final String MATCHES_FILE = MACHES_FILE;

	private static final String CLUBS_FILE = CLUB_FILE;

    
    public static void main(String[] args) throws FileNotFoundException {
        // load data from file
        loadData(PLAYER_FILE, "player.csv", "player");
        loadData(MACHES_FILE, "maches.csv", "maches");
        loadData(CLUB_FILE, "clubs.csv", "club");

        int OPTION = 0;
       //WHILE LOOPS RUNS UNTIL NUMBER 6 IS SELECTED TO EXIT
        while (OPTION != 6) {
            printMenu();
            try {
            	OPTION = Integer.parseInt(scanner.nextLine());// ENTER USERS INTRESTED OPTION
                
                if ( OPTION== 1) {
                    addNewPlayer();
                } else if (OPTION == 2) {
                    enterMatchResult();
                } else if (OPTION == 3) {
                    displayLadder();
                } else if (OPTION == 4) {
                    displayPlayerMatchHistory();
                } else if (OPTION == 5) {
                    saveData();
                } else if (OPTION == 6) {
                    System.out.println("Exit the program .");
                } else {
                    System.out.println("Please choose a number between 1-6");
                }
            } catch (NumberFormatException e) {
                System.out.println(" U entered a number other than 1-6");
            }
        }
    }

    /**
     * 
     * @param fileename the start of the file
     * @param reader method to read the file
     * @param dataType type of data being used
     */
    private static void loadData(String fileename, String presentFile, String dType) {
        String presentFileename = fileename;
        while (presentFileename != presentFile) {
            System.out.println(" not able to read the file " + presentFileename + " Please correct the filename " + dType + "or type exit to quit");
            presentFileename = scanner.nextLine();
            if (presentFileename.equalsIgnoreCase("exit")) {
                System.out.println("Exit menu.");
                System.exit(0); // Exit the program if user types 'exit'
            }
        }
    }

    private static void printMenu() {
        System.out.println("-- Ladder Menu ---");
        System.out.println("1. Add a New Player");
        System.out.println("2. Enter a Match Result");
        System.out.println("3. Display Ladder");
        System.out.println("4. Display Player Match History");
        System.out.println("5. Save");
        System.out.println("6. Exit Program");
        System.out.print("Enter your choice: ");
    }

    private static void addNewPlayer() {
        System.out.println("\n--- Add a New Player ---");

        // get name of the user
        String name = getUniquePlayerNameInput("Enter player's name: ");

        // gets correct mobile number
        String mobile = getValidatedInput("Players mobile no: ", "number must be 10 digit.", "\\d{10}");//makes sure the number is 10 digits

        // get correct email id
        String email = getValidatedInput(" Player's email address: ", "Email must be at least 5 characters and contain '@' and '.'.", ".{5,}@.+\\..+");//makes sure use of at least five character @ and .

        // get club id of the player
        String clubID = getClubIDInput("Enter player's club name: ");

        //  RANK AS LAST IN THE LADDER
        int ranking = players.size() + 1;

        // ALLOWS TO ADD NEW PLAYER
        Player_22163465 newPlayer = new Player_22163465(ranking, name, mobile, email, clubID);
        players.add(newPlayer);

        System.out.println("Player added successfully: " + name + " (Ranking: " + ranking + ")");
    }

    private static void enterMatchResult() {
        System.out.println("--- Enter a Match Result ---");

        // GET  DEFENDERS NAME
        Player_22163465 defender = getPlayerInput("defender's name: ");

        // GET THE CHALLANGERS NAME
        Player_22163465 challenger = getChallengerInput("challenger's name: ", defender);

        // GET THE DATE OF THE DAY THAT THE MATCH OCCORED
        String date = getMatchDateInput("match date (yyyy-mm-dd): ", defender, challenger);

        // GET THE SCORE AT THE END OF THE MATCH
        String score = getMatchScoreInput("END MATCH SCORE (SUPPOSE 6-3): ");

        // GET THE NAME OF THE WINNER
        Player_22163465 winner = getWinnerInput(" winner's name: ", defender, challenger);

        // THE PLAYERS RANK BEFORE THE MATCH
        int defenderRankBefore = defender.getRanking();
        int challengerRankBefore = challenger.getRanking();

        // CHNAGE THE RANKING IF CHALLENGER WINS 
        if (winner == challenger && challenger.getRanking() > defender.getRanking()) {
            // CHANGE RANKING OF THE DEFENDER AND CHALLANGER
            int temp = defender.getRanking();
            defender.setRanking(challenger.getRanking());
            challenger.setRanking(temp);

            // RE MAKE THE LIST USING THE FOR LOOP
            for (int i = 0; i < players.size() - 1; i++) {
                for (int j = i + 1; j < players.size(); j++) {
                    if (players.get(i).getRanking() > players.get(j).getRanking()) {
                        Player_22163465 tempPlayer = players.get(i);
                        players.set(i, players.get(j));
                        players.set(j, tempPlayer);
                    }
                }
            }
        }

       // STATES THE PLAYERS RANKING AFTER THE MATCH
        int defenderRankAfter = defender.getRanking();
        int challengerRankAfter = challenger.getRanking();

        // NEW MATCH ADDS TO THE MATCH PILE
        matches.add(new Match_22163465(
            date,
            defenderRankBefore,
            defender.getName(),
            challenger.getName(),
            challengerRankBefore,
            score,
            winner.getName()
        ));

        // Display summary
        System.out.println("Match Summary:");
        System.out.println("DateOfMatch: " + date);
        System.out.println("Defender Name: " + defender.getName() + " Defenders Ranking before: " + defenderRankBefore + ",defenders ranking after: " + defenderRankAfter + ")");
        System.out.println("Challenger Name: " + challenger.getName() + " (Chllangers Ranking before: " + challengerRankBefore + ", challangers ranking after: " + challengerRankAfter + ")");
        System.out.println("Score: " + score);
        System.out.println("Winner: " + winner.getName());
    }

   

    /**
     * @param dispuser display the user
     * @return !string input
     */
    private static String getNonEmptyInput(String dispuser) {
        String input;
        int attempts = 0;
        int maxAttempts = 3;
        
        while (attempts < maxAttempts) {
            System.out.print(dispuser);
            input = scanner.nextLine().trim();
            
            if (!input.isEmpty()) {
                return input;
            }
            
            attempts++;
            System.out.println("Cannot be empty. " + (maxAttempts - attempts) + " remaining chances");
        }
        
        System.out.println("maximum attempt reached enter default value");
        return "Default";
    }

    /**
     * @param dispuser display the user
     * @param errorMessage error message to display if validation fails.
     * @return The validated string input.
     */
    private static String getValidatedInput(String dispuser, String errorMessage, String regex) {
        String input;
        int attempts = 0;
        int maxAttempts = 3;
        
        while (attempts < maxAttempts) {
            input = getNonEmptyInput(dispuser);
            if (input.matches(regex)) {
                return input;
            }
            System.out.println(errorMessage);
            attempts++;
            System.out.println((maxAttempts - attempts) + " attempts remaining.");
        }
        
        System.out.println("Maximum attempts Using default value.");
        return "Default";
    }

    /**
     * Prompts for a player name and ensures it's unique.
     * @param dispuser  display to the user
     * @return  unique player name.
     */
    private static String getUniquePlayerNameInput(String dispuser) {
        int attempts = 0;
        int maxAttempts = 3;
        
        while (attempts < maxAttempts) {
            String name = getNonEmptyInput(dispuser);
            boolean nameExists = false;
            for (int i = 0; i < players.size(); i++) {
                Player_22163465 p = players.get(i);
                if (p.getName().equalsIgnoreCase(name)) {
                    nameExists = true;
                    break;
                }
            }
            if (!nameExists) {
                return name;
            }
            attempts++;
            System.out.println("name already exists. " + (maxAttempts - attempts) + " attempts remaining.");
        }
        
        System.out.println("Maximum attempts reached.");
        return "Player" + (players.size() + 1);
    }

    /**
     * @param dispuser display to the user.
     * @return The club ID.
     */
    private static String getClubIDInput(String dispuser) {
        int attempts = 0;
        int maxAttempts = 3;
        
        while (attempts < maxAttempts) {
            String clubName = getNonEmptyInput(dispuser);
            for (Club_22163465 c : clubs) {
                for (int i = 0; i < clubName.length(); i++) {
                    if (c.getClubName().charAt(i) != Character.toLowerCase(clubName.charAt(i)) &&
                        c.getClubName().charAt(i) != Character.toUpperCase(clubName.charAt(i))) {
                        continue;
                    }
                    if (i == clubName.length() - 1) {
                        return c.getClubID();
                    }
                }
                    
                
            }
            attempts++;
            System.out.println("Club name not found. " + (maxAttempts - attempts) + " attempts remaining.");
        }
        
        System.out.println("Maximum attempts reached. Using default club.");
        if (clubs.isEmpty()) {
            return "DEFAULT";
        }
        return clubs.get(0).getClubID();
    }

    /**
     * @param dispuser display to the user.
     * @return The Player_22163465 object.
     */
    private static Player_22163465 getPlayerInput(String dispuser) {
        Player_22163465 player = null;
        while (player == null) {
            String playerName = getNonEmptyInput(dispuser);
            for (int i = 0; i < players.size(); i++) {
                Player_22163465 p = players.get(i);
                if (p.getName().equalsIgnoreCase(playerName)) {
                    player = p;
                    break;
                }
            }
            if (player == null) {
                System.out.println("Player not found. Please enter a valid player name.");
            }
        }
        return player;
    }

    /**
     
     * @param dispuser display to the user.
     * @param defender The defending player name
     * @return The Challenger Player_22163465 object.
     */
    private static Player_22163465 getChallengerInput(String dispuser, Player_22163465 defender) {
        Player_22163465 challenger = null;
        while (challenger == null) {
            String challengerName = getNonEmptyInput(dispuser);
            if (challengerName.equalsIgnoreCase(defender.getName())) {
                System.out.println("Challenger cannot be the same as defender.");
                continue;
            }
            for (int i = 0; i < players.size(); i++) {
                Player_22163465 p = players.get(i);
                if (p.getName().equalsIgnoreCase(challengerName)) {
                    challenger = p;
                    break;
                }
            }
            if (challenger == null) {
                System.out.println("Challenger not found.");
            }
        }
        return challenger;
    }

    /**
     * @param dispuser  display to the user.
     * @param defender The defending player name
     * @param challenger The challenging player name
     * @return The validated match date string.
     */
    private static String getMatchDateInput(String dispuser, Player_22163465 defender, Player_22163465 challenger) {
        int attempts = 0;
        int maxAttempts = 3;
        
        while (attempts < maxAttempts) {
            String date = getValidatedInput(dispuser, "Invalid date format. Please use yyyy-mm-dd.", "\\d{4}-\\d{2}-\\d{2}");
            LocalDate matchDate = LocalDate.parse(date);
            if (matchDate.isAfter(LocalDate.now())) {
                System.out.println("Match date cannot be in the future.");
                attempts++;
                continue;
            }

            // Check if match date is within last 7 days
            if (matchDate.isBefore(LocalDate.now().minusDays(7))) {
                System.out.println("Match date must be within the last 7 days.");
                attempts++;
                continue;
            }
            LocalDate lastDefenderMatch = getLastMatchDate(defender.getName());
            LocalDate lastChallengerMatch = getLastMatchDate(challenger.getName());
    
            if ((lastDefenderMatch != null && matchDate.isBefore(lastDefenderMatch)) ||
                (lastChallengerMatch != null && matchDate.isBefore(lastChallengerMatch))) {
                System.out.println("Match date must be after both players' most recent matches.");
                attempts++;
                continue;
            }
            return date;
        }
        
        System.out.println("Maximum attempts reached. Using today's date.");
        return LocalDate.now().toString();
    }

    /**
     * Prompts for a match score and validates it against a list of valid scores.
     * @param dispuser display to the user.
     * @return validated match score string.
     */
    private static String getMatchScoreInput(String dispuser) {
        String[] validScores = {"6-0","6-1","6-2","6-3","6-4","7-5","7-6"};
        int attempts = 0;
        int maxAttempts = 3;
        
        while (attempts < maxAttempts) {
            String score = getNonEmptyInput(dispuser);
            for (int i = 0; i < validScores.length; i++) {
                if (validScores[i].equals(score)) {
                    return score;
                }
            }
            attempts++;
            System.out.println("Invalid score. Valid scores: 6-0 " + 
                           (maxAttempts - attempts) + " attempts remaining.");
        }
        
        System.out.println("Maximum attempts reached. Using default score.");
        return "6-0";
    }

    /**
     * Prompts for the winner's name and ensures it's either the defender or challenger.
     * @param dispuser  display to the user.
     * @param defender The defending player name
     * @param challenger The challenging player namr
     * @return The winning Player_22163465 object.
     */
    private static Player_22163465 getWinnerInput(String dispuser, Player_22163465 defender, Player_22163465 challenger) {
        Player_22163465 winner = null;
        while (winner == null) {
            String winnerName = getNonEmptyInput(dispuser);
            if (winnerName.equalsIgnoreCase(defender.getName())) {
                winner = defender;
            } else if (winnerName.equalsIgnoreCase(challenger.getName())) {
                winner = challenger;
            } else {
                System.out.println("Winner must be either the defender or the challenger.");
            }
        }
        return winner;
    }

    // last match date from a player
    private static LocalDate getLastMatchDate(String playerName) {
        LocalDate lastDate = null;
        for (int i = 0; i < matches.size(); i++) {
            Match_22163465 m = matches.get(i);
            if (m.getDefenderName().equalsIgnoreCase(playerName) || m.getChallengerName().equalsIgnoreCase(playerName)) {
                LocalDate matchDate = LocalDate.parse(m.getDate());
                if (lastDate == null || matchDate.isAfter(lastDate)) {
                    lastDate = matchDate;
                }
            }
        }
        return lastDate;
    }
// plays the tennis laddera
private static void displayLadder() {
    System.out.println("--- Tennis Ladder ---");
    
    if (players.isEmpty()) {
        System.out.println("No players on the ladder.");
        return;
    }
    
    // groups player using nested loop
    for (int i = 0; i < players.size() - 1; i++) {
        for (int j = i + 1; j < players.size(); j++) {
            if (players.get(i).getRanking() > players.get(j).getRanking()) {
                // Swap players if current player's ranking is higher
                Player_22163465 temp = players.get(i);
                players.set(i, players.get(j));
                players.set(j, temp);
            }
        }
    }
    
   
    System.out.printf("%-8s %-20s %-15s %-25s %-15s %-12s%n", 
        "Ranking", "Name", "Phone Number", "Email Address", "Matches Played", "Last Match");
    System.out.println("----------------------------------------------------------------------------------------");
    
    // shows each player
    for (int i = 0; i < players.size(); i++) {
        Player_22163465 p = players.get(i);
        int matchesPlayed = getMatchesPlayedCount(p.getName());
        String lastMatch = getLastMatchDateString(p.getName());
        
        System.out.printf("%-8d %-20s %-15s %-25s %-15d %-12s%n", 
            p.getRanking(), 
            p.getName(), 
            p.getMobile(), 
            p.getEmail(), 
            matchesPlayed, 
            lastMatch.isEmpty() ? "N/A" : lastMatch);
    }
}

// displays match history for each player
private static void displayPlayerMatchHistory() {
    System.out.println("--- Display Player Match History ---");
    
    if (players.isEmpty()) {
        System.out.println("No players on the ladder.");
        return;
    }
    
    // retreves player name
    Player_22163465 selectedPlayer = null;
    while (selectedPlayer == null) {
        System.out.print("Enter player's name: ");
        scanner.nextLine().trim();
        
        if (selectedPlayer == null) {
            System.out.println("Player not found. Please enter a valid player name.");
        }
    }
    

    for (int i = 0; i < clubs.size(); i++) {
        Club_22163465 club = clubs.get(i);
        if (club.getClubID().equals(selectedPlayer.getClubID())) {
            club.getClubName();
            break;
        }
    }
    
    // finds players matches
    ArrayList<Match_22163465> playerMatches = new ArrayList<>();
for (int i = 0; i < matches.size(); i++) {
    Match_22163465 match = matches.get(i);
    if (match.getDefenderName().equalsIgnoreCase(selectedPlayer.getName()) ||
        match.getChallengerName().equalsIgnoreCase(selectedPlayer.getName())) {
        playerMatches.add(match);
    }
}
    
    // shorts the players by date
for (int i = 0; i < playerMatches.size() - 1; i++) {
    for (int j = 0; j < playerMatches.size() - i - 1; j++) {
        String date1 = playerMatches.get(j).getDate();
        String date2 = playerMatches.get(j + 1).getDate();
        if (date1.compareTo(date2) > 0) {
            // Swap matches
            Match_22163465 temp = playerMatches.get(j);
            playerMatches.set(j, playerMatches.get(j + 1));
            playerMatches.set(j + 1, temp);
        }
    }
}
    playerMatches.size();
    selectedPlayer.getRanking();
    selectedPlayer.getRanking();
    
  
    for (int i = 0; i < playerMatches.size(); i++) {
        Match_22163465 match = playerMatches.get(i);
        String opponent;
        int playerRanking;
        int opponentRanking;
        
        if (match.getDefenderName().equalsIgnoreCase(selectedPlayer.getName())) {
            opponent = match.getChallengerName();
            playerRanking = match.getDefenderRank();
            opponentRanking = match.getChallengerRank();
        } else {
            opponent = match.getDefenderName();
            playerRanking = match.getChallengerRank();
            opponentRanking = match.getDefenderRank();
        }
        
        System.out.printf("%-12s %-15s %-8d %-15s %-8d %-8s %-15s%n",
            match.getDate(),
            selectedPlayer.getName(),
            playerRanking,
            opponent,
            opponentRanking,
            match.getScore(),
            match.getWinnerName());
    }
}

// saves  data
private static void saveData() throws FileNotFoundException {
    System.out.println("\n--- Save Data ---");
    
    // players are saved in the player.cvs file
	java.io.PrintWriter playersWriter = new java.io.PrintWriter(PLAYERS_FILE);
	for (int i = 0; i < players.size(); i++) {
	    Player_22163465 player = players.get(i);
	    playersWriter.println(player.getRanking() + "," + 
	                    player.getName() + "," + 
	                    player.getMobile() + "," + 
	                    player.getEmail() + "," + 
	                    player.getClubID());
	}
	playersWriter.close();
	
	// maches are saved in the maches.cvs file
	java.io.PrintWriter matchesWriter = new java.io.PrintWriter(MATCHES_FILE);
	for (int i = 0; i < matches.size(); i++) {
	    Match_22163465 match = matches.get(i);
	    matchesWriter.println(match.getDate() + "," + 
	                    match.getDefenderRank() + "," + 
	                    match.getDefenderName() + "," + 
	                    match.getChallengerName() + "," + 
	                    match.getChallengerRank() + "," + 
	                    match.getScore() + "," + 
	                    match.getWinnerName());
	}
	matchesWriter.close();

	// clubs are saved into club.cvs
	java.io.PrintWriter clubsWriter = new java.io.PrintWriter(CLUBS_FILE);
	for (int i = 0; i < clubs.size(); i++) {
	    Club_22163465 club = clubs.get(i);
	    clubsWriter.println(club.getClubID() + "," +
	                        club.getClubName());
	}
	clubsWriter.close();
	
	System.out.println("Data saved successfully to " + PLAYERS_FILE + ", " + MATCHES_FILE + " and " + CLUBS_FILE);
}

// Helper method to count matches played by a player
private static int getMatchesPlayedCount(String playerName) {
    int count = 0;
    for (int i = 0; i < matches.size(); i++) {
        Match_22163465 match = matches.get(i);
        if (match.getDefenderName().equalsIgnoreCase(playerName) ||
            match.getChallengerName().equalsIgnoreCase(playerName)) {
            count++;
        }
    }
    return count;
}

// Helper method to get last match date as string
private static String getLastMatchDateString(String playerName) {
    LocalDate lastDate = getLastMatchDate(playerName);
    return lastDate != null ? lastDate.toString() : "";
}}
   