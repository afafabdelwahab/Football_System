import java.util.ArrayList;
import java.util.List;

/**
 * Represents a coach in a football team.
 * Extends the {@code Person} class and adds specific attributes like role and teams coached.
 */
public class Coach extends Person{
    private String role;
    private List<Team> teamsCoached;

    /**
     * Constructs a Coach with the specified details.
     *
     * @param id   The unique ID of the coach.
     * @param name The name of the coach.
     * @param age  The age of the coach.
     * @param role The role of the coach in the team.
     */

    public Coach(int id, String name, int age,String role) {
        super(id, name,age);
        this.role = role;
        this.teamsCoached = new ArrayList<>();
    }

    /**
     * Returns the coach's role.
     *
     * @return The coach's role.
     */

    public String getRole() {
        return role;
    }
    /**
     * Sets the coach's role.
     *
     * @param role The new role of the coach.
     */
    public void setRole(String role) {
        this.role = role;
    }
    /**
     * Adds a team to the list of teams coached by the coach.
     *
     * @param team The team to add.
     */
    public void addTeamCoached(Team team) {
        this.teamsCoached.add(team);
    }
    /**
     * Returns detailed information about the coach.
     *
     * @return A string containing the coach's details.
     */
    @Override
    public String getDetails() {
        return super.displayDetails()+ "Coach: " + getName() + ", Role: " + role;
    }

}
