package Lesson4;

public class Salary {
    public static void main(String[] args) {

        String[] monthNames = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};

        double payForHours = Double.parseDouble(args[0]);
        double tax = Double.parseDouble(args[1]);

        int workingHoursADay = 8;
        int workingDaysAWeek = 5;
        int weeksInMonth = 4;

        double totalSalaryForYearWithoutTax = 0;
        double totalSalaryForYearWithTax = 0;

        for (int monthNumber = 1; monthNumber <= 12; monthNumber++) {
            int workingHoursInMonth = workingHoursADay * workingDaysAWeek * weeksInMonth;
            double salaryForMonthWithoutTax = workingHoursInMonth * payForHours;
            double salaryForMonthWithTax = salaryForMonthWithoutTax + salaryForMonthWithoutTax * tax / 100;

            System.out.println(monthNames[monthNumber - 1] + " " + salaryForMonthWithoutTax + " " + salaryForMonthWithTax);

            totalSalaryForYearWithoutTax += salaryForMonthWithoutTax;
            totalSalaryForYearWithTax += salaryForMonthWithTax;
        }

        System.out.println("Total: " + totalSalaryForYearWithoutTax + " " + totalSalaryForYearWithTax);
    }
}



