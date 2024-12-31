import java.util.ArrayList;
import java.util.List;
/**
 * Represents a league containing teams and their matches.
 */
public class League implements Management<Team> {
    private String leagueName;
    private List<Team> teams;
    private List<Match> matches;


    /**
     * Constructs a League object.
     *
     * @param leagueName the name of the league.
     */
    public League(String leagueName) {
        this.leagueName = leagueName;
        this.teams = new ArrayList<>();
        this.matches = new ArrayList<>();
    }

    /**
     * Adds a team to the league.
     *
     * @param team the team to be added.
     */
    @Override
    public void add(Team team) {
        teams.add(team);
        System.out.println("Team added to league " + leagueName + ": " + team.getTeamName());
    }

    /**
     * Updates the details of an existing team in the league.
     *
     * @param team the team to be updated.
     */
    @Override
    public void update(Team team) {
        for (int i = 0; i < teams.size(); i++) {
            if (teams.get(i).getTeamName().equals(team.getTeamName())) {
                teams.set(i, team);
                System.out.println("Team updated in league " + leagueName + ": " + team.getTeamName());
                return;
            }
        }
        System.out.println("Team not found in league " + leagueName);
    }

    /**
     * Deletes a team from the league.
     *
     * @param teamId the ID of the team to be deleted.
     */
    @Override
    public void delete(int teamId) {
        if (teams.removeIf(team -> team.getTeamName().hashCode() == teamId)) {
            System.out.println("Team removed from league " + leagueName);
        } else {
            System.out.println("Team not found in league " + leagueName);
        }
    }
    /**
     * Displays all the teams in the league.
     */
    @Override
    public void displayAll() {
        System.out.println("League name : " + leagueName);
        if (teams.isEmpty()) {
            System.out.println("No teams in the league.");
        } else {
            for (Team team : teams) {
                System.out.println(team.displayDetails());
            }


        }
    }

    /**
     * Adds a match to the league.
     *
     * @param match the match to be added.
     */
    public void addMatch(Match match) {
        matches.add(match);
        System.out.println("Match added to league " + leagueName + ": " + match);
    }


    /**
     * Displays all matches in the league.
     */
    public void displayAllMatches() {
        System.out.println("Matches in League: " + leagueName);
        if (matches.isEmpty()) {
            System.out.println("No matches scheduled.");
        } else {
            for (Match match : matches) {
                System.out.println(match.displayDetails());
            }
        }
    }
    /**
     * Schedules matches between all teams in the league.
     */
    public void scheduleMatches() {
        for (int i = 0; i < teams.size(); i++) {
            for (int j = i + 1; j < teams.size(); j++) {
                Match match = new Match(
                        matches.size() + 1,
                        teams.get(i).getTeamName(),
                        teams.get(j).getTeamName(),
                        "stadium",
                        "5-2-2023"
                );
                addMatch(match);
            }
        }
        System.out.println("Matches scheduled for league " + leagueName);
    }


}

