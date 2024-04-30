package sportDay;

import java.util.ArrayList;
import java.util.List;

class Team {
    // private variables to store employee information
    private String teamName;
    private List<Employee> employees;
    private List<TeamSportGame> teamSportGames; // List to store games in which the team is participating

    // Parameterized constructor to initialize team object
    public Team(String teamName) {
        this.teamName = teamName;
        this.employees = new ArrayList<>();
        this.teamSportGames = new ArrayList<>();
    }

    // setter and getter
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    // Method to add an employee to a team
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Method to remove an employee from a team
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    // Method to participate in a team sport game
    public void addTeamSportGame(TeamSportGame game) {
        teamSportGames.add(game);
    }

    // Method to get the team sport game in which the team participate
    public List<TeamSportGame> getTeamSportGames() {
        return teamSportGames;
    }

    // Method to calculate the total points for each team that consist of summing :
    //                  1- points for team in team sport game
    //                  2- points for everyone on this team in individual sport game
    public int calculateTotalPoints() {
        int totalPoints = 0;
        // Add points from team sport games
        for (TeamSportGame game : teamSportGames) {
            totalPoints += game.win();
        }
        // Add points from individual sport games of employees in the team
        for (Employee employee : employees) {
            for (IndividualSportGame game : employee.getIndividualSportGames()) {
                totalPoints += game.win();
            }
        }
        return totalPoints;
    }

    // method to get the name of employee in a team
    public List<String> getEmployeeNames() {
        List<String> employeeNames = new ArrayList<>();
        for (Employee employee : employees) {
            String employeeName = employee.getEmployeeName();
            employeeNames.add(employeeName);
        }
        return employeeNames;
    }

}