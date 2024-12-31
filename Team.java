import java.util.ArrayList;
import java.util.List;

/**
 * Represents a football team, including players, a coach, and team details.
 * Implements the {@code Management} interface for managing players.
 */
public class Team implements Management<Player>{
    private String teamName;
    private String formation;
    private List<Player> players;
    private Coach coach;
    /**
     * Constructs a Team with the specified name and formation.
     *
     * @param teamName  The name of the team.
     * @param formation The formation of the team.
     */
    public Team(String teamName, String formation) {
        this.teamName = teamName;
        this.formation = formation;
        this.players = new ArrayList<>();
    }
    /**
     * Returns the team's name.
     *
     * @return The team's name.
     */
    public String getTeamName() {
        return teamName;
    }
    /**
     * Sets the coach of the team.
     *
     * @param coach The coach to assign to the team.
     */

    public void setCoach(Coach coach) {
        this.coach = coach;

    }
    /**
     * Returns the team's formation.
     *
     * @return The team's formation.
     */

    public String getFormation() {
        return formation;
    }

    /**
     * Sets the formation of the team.
     *
     * @param formation The formation of the team.
     */
    public void setFormation(String formation) {
        this.formation = formation;
    }
    /**
     * Adds a player to the team.
     *
     * @param player The player to add.
     */
    public void add(Player player) {
        players.add(player);
        System.out.println("Player added to the team successfully.");
    }

    /**
     * Updates a player's information in the team.
     *
     * @param player The player with updated information.
     */
    @Override
    public void update(Player player) {
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getId() == player.getId()) {
                players.set(i, player);
                System.out.println("Player updated successfully.");
                return;
            }
        }
        System.out.println("Player not found.");
    }

    /**
     * Deletes a player from the team by ID.
     *
     * @param playerId The ID of the player to delete.
     */
    public void delete(int playerId) {
        boolean playerFound = false;
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getId() == playerId) {
                players.remove(i);
                playerFound = true;
                System.out.println("Player removed from the team.");
                break;
            }
        }
        if (!playerFound) {
            System.out.println("Player not found.");
        }
    }

    /**
     * Displays all players in the team.
     */
    @Override
    public void displayAll() {
        if (players.isEmpty()) {
            System.out.println("No players in the team.");
        } else {
            for (int i = 0; i < players.size(); i++) {
                Player player = players.get(i);
                System.out.println(player.getDetails());
            }
        }
    }
    /**
     * Returns detailed information about the team.
     *
     * @return A string containing the team's details.
     */


    public String displayDetails() {
        return "Team Name: " + teamName + ", Formation: " + formation +", number of players: " + players.size() +", Coach: "+ (coach != null ? coach.getName() : "None");
    }





}
