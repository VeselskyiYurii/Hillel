package Lesson2;

public class First_salary {
    public static void main(String[] args) {

        double workHoursWeek = Double.parseDouble(args[0]);

        double payForHours = Double.parseDouble(args[1]);

        double tax = Double.parseDouble(args[2]);

        double salaryForMonthWithoutTax = workHoursWeek * 4 * payForHours;

        double salaryForMonthWithTax = salaryForMonthWithoutTax + salaryForMonthWithoutTax * tax / 100;

        double salaryForYearWithoutTax = salaryForMonthWithoutTax * 12;

        double salaryForYearWithTax = salaryForMonthWithTax * 12;

        System.out.println("Зарплатня на місяць без податків: " + salaryForMonthWithoutTax);
        System.out.println("Зарплатня на місяць з податками: " + salaryForMonthWithTax);
        System.out.println("Зарплатня на рік без податками: " + salaryForYearWithoutTax);
        System.out.println("Зарплатня на рік з податками: " + salaryForYearWithTax);



    }
}
