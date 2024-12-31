/**
 * Represents a player in a football team.
 * Extends the {@code Person} class and adds specific attributes like position, goals, assists, and fouls.
 */
public class Player extends Person{
    private String position;
    private int goals;
    private int assists;
    private int fouls;

    /**
     * Constructs a Player with the specified details.
     *
     * @param id       The unique ID of the player.
     * @param name     The name of the player.
     * @param age      The age of the player.
     * @param position The position of the player on the field.
     */

    public Player(int id, String name, int age, String position) {
        super(id, name, age);
        this.position = position;
        this.goals = 0;
        this.assists = 0;
        this.fouls = 0;
    }

    /**
     * Returns the player's position.
     *
     * @return The player's position.
     */

    public String getPosition() {
        return position;
    }

    /**
     * Sets the player's position.
     *
     * @param position The new position of the player.
     */

    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Returns the number of goals scored by the player.
     *
     * @return The number of goals.
     */

    public int getGoals() {
        return goals;
    }

    /**
     * Increments the player's goal count by 1.
     */

    public void incrementGoals() {
        this.goals++;
    }
    /**
     * Returns the number of assists made by the player.
     *
     * @return The number of assists.
     */

    public int getAssists() {
        return assists;
    }

    /**
     * Increments the player's assist count by 1.
     */

    public void incrementAssists() {
        this.assists++;
    }

    /**
     * Returns the number of fouls committed by the player.
     *
     * @return The number of fouls.
     */

    public int getFouls() {
        return fouls;
    }
    /**
     * Increments the player's foul count by 1.
     */

    public void incrementFouls() {
        this.fouls++;
    }

    /**
     * Returns detailed information about the player.
     *
     * @return A string containing the player's details.
     */

    @Override
    public String getDetails() {
        return super.displayDetails()+ ", Position: " + position + "Goals: " + goals +
        ", Assists: " + assists + ", Fouls: " + fouls ;
    }



}
