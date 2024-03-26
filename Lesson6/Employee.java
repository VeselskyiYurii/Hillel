package Lesson6;

public class Employee {

    private  String secondName;
    private  String firstName;
    private    String position;
    private    Double salaryForHour;

    public Employee (String secondName, String firstName, String position, Double salaryForHour) {

        this.secondName = secondName;
        this.firstName = firstName;
        this.position = position;
        this.salaryForHour = salaryForHour;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setPosition(String newPosition) {
        this.position = newPosition;
    }

    public void setSalaryForHour(Double newSalaryForHour) {
        salaryForHour = newSalaryForHour;
    }

}
