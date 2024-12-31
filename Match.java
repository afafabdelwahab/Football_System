/**
 * Represents a match between two teams in a football league.
 */
public class Match {
    private int matchId;
    private String homeTeam;
    private String awayTeam;
    private String date;
    private String location;
    private String result;

    /**
     * Constructs a Match object.
     *
     * @param matchId   the unique identifier for the match.
     * @param homeTeam  the name of the home team.
     * @param awayTeam  the name of the away team.
     * @param location  the location where the match is played.
     * @param date      the date of the match.
     */
    public Match(int matchId, String homeTeam, String awayTeam, String location,String date) {
        this.matchId = matchId;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.date = date;
        this.location=location;
        this.result = "Pending";
    }
    /**
     * Gets the unique match ID.
     *
     * @return the match ID.
     */
    public int getMatchId() {
        return matchId;
    }

    /**
     * Gets the result of the match.
     *
     * @return the match result.
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the result of the match.
     *
     * @param result the result of the match (e.g., "1-0").
     */

    public void setResult(String result) {
        this.result = result;
    }

    /**
     * Returns detailed information about the match.
     *
     * @return A string containing the match's details.
     */

    public String displayDetails() {
        return "Match ID: " + matchId + ", Home: " + homeTeam + ", Away: " + awayTeam + ", Date: " + date + ", Result: " + result +", Location: " + location;
    }
}
