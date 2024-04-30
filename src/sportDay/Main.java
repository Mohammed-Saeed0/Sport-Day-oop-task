package sportDay;

public class Main {
    public static void main(String[] args) {
        // Create employees that participate in the sport day
        Employee employee1 = new Employee(1, "Ahmed");
        Employee employee2 = new Employee(2, "Ayman");
        Employee employee3 = new Employee(3, "Mohamed");
        Employee employee4 = new Employee(4, "Mano");

        // Create teams that consist of employee
        Team team1 = new Team("Team A");
        // Add employee to team1
        team1.addEmployee(employee1);
        team1.addEmployee(employee2);

        Team team2 = new Team("Team B");
        // Add employee to team1
        team2.addEmployee(employee3);
        team2.addEmployee(employee4);

        // Create team sport games
        TeamSportGame footballGame = new TeamSportGame("Football");
        TeamSportGame basketballGame = new TeamSportGame("Basketball");

        // Teams participate in team sport games
        team1.addTeamSportGame(footballGame);
        team1.addTeamSportGame(basketballGame);
        team2.addTeamSportGame(footballGame);
        team2.addTeamSportGame(basketballGame);


        // Create individual sport games
        IndividualSportGame tennisGame = new IndividualSportGame("Tennis");
        IndividualSportGame swimmingGame = new IndividualSportGame("Swimming");

        // Individual participate in individual sport games
        employee1.addGame(tennisGame);
        employee1.addGame(swimmingGame);
        employee2.addGame(swimmingGame);
        employee3.addGame(tennisGame);
        employee3.addGame(swimmingGame);
        employee4.addGame(tennisGame);
        employee4.addGame(swimmingGame);

        // Calculate total points for each team
        System.out.println("Total Points for " + team1.getTeamName() + " : " + team1.calculateTotalPoints());
        System.out.println("Total Points for " + team2.getTeamName() + " : " + team2.calculateTotalPoints());
    }
}