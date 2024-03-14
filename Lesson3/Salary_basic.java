package Lesson3;

public class Salary_basic {
    public static void main(String[] args) {

        int monthNumber = Integer.parseInt (args[0]);

        double payForHours = Double.parseDouble (args[1]);

        double tax = Double.parseDouble (args[2]);

        int workingHoursADay = 8;

        int workingDaysAWeek = 5;

        int weeksInMonth = 4;

        int workingHoursInMonth = workingHoursADay * workingDaysAWeek * weeksInMonth;

        double salaryForMonthWithoutTax = workingHoursInMonth * payForHours;

        double salaryForMonthWithTax = salaryForMonthWithoutTax + salaryForMonthWithoutTax * tax / 100;


        System.out.println("Salary without tax for " + monthNumber +" month = " + salaryForMonthWithoutTax);
        System.out.println("Salary with tax for " + monthNumber +" month = " +salaryForMonthWithTax);

    }
}