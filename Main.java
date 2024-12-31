//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Create a League
        League league = new League("English League");

        // Create Teams
        Team team1 = new Team("Manchester", "4-3-3");
        Team team2 = new Team("Liverpool", "3-5-2");

        // Create Players
        Player player1 = new Player(1, "Bruno Fernandes", 25, "Midfielder");
        Player player2 = new Player(2, "Marcus Rashford", 23, "Forward");
        Player player3 = new Player(3, "Mohamed Salah ", 22, "Forward");

        // Add players to team1
        team1.add(player1);
        team1.add(player2);

        // Add players to team2
        team2.add(player3);

        // Display team1 details
        System.out.println("--- Team 1 Players ---");
        team1.displayAll();

        // Set a Coach for Team 1
        Coach coach1 = new Coach(100, "Coach Mike", 45, "Head Coach");
        team1.setCoach(coach1);

        // Add Teams to League
        league.add(team1);
        league.add(team2);

        // Display all teams in the league
        System.out.println("--- Teams in League ---");
        league.displayAll();

        // Update a Player
        player1.setName("Bruno");
        player1.incrementGoals();
        team1.update(player1);


        // Display updated player info
        System.out.println("--- Updated Player Info ---");
        team1.displayAll();

        // Delete a Player
        team1.delete(2);
        System.out.println("--- After Deleting Player ---");
        team1.displayAll();

        // Schedule Matches
        league.scheduleMatches();

        // Display Matches
        System.out.println("--- Matches Scheduled ---");
        league.displayAllMatches();

        // Update Match Result
        Match match = new Match(1, "Manchester", "Liverpool", "Stadium A", "2024-12-30");
        match.setResult("2-1");
        league.addMatch(match);

        System.out.println("--- Match Results Updated ---");
        league.displayAllMatches();

    }

}
