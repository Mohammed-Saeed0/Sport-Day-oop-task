package sportDay;

import java.util.ArrayList;
import java.util.List;

class Employee{
    // private variables to store employee information
    private int employeeId;
    private String employeeName;
    List<IndividualSportGame> individualSportGames; // List to store games in which the employee is participating

    // Parameterized constructor to initialize employee object
    public Employee(int employeeId, String employeeName){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        // Initailize arryList for the games that employee participating in
        this.individualSportGames = new ArrayList<>();
    }

    // setter and getter to access the private variable
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // Method for employee to participate in individual sport game
    public void addGame(IndividualSportGame game){
        individualSportGames.add(game);
    }

    // Method to get the individual sport game in which the individual participate
    public List<IndividualSportGame> getIndividualSportGames() {
        return individualSportGames;
    }
}
