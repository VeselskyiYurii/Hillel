package Lesson2;

public class PayForHour {
    public static void main(String[] args) {

        int hours = Integer.parseInt(args[0]);

        double salaryForYearWithTax = Double.parseDouble(args[1]);

        double tax = Double.parseDouble(args[2]);

        int hoursInYear = hours * 4 * 12;

        double salaryForYearWithoutTax = salaryForYearWithTax * 100 / 77;

        double salaryForHourWithoutTax = salaryForYearWithoutTax / hoursInYear;

        System.out.println("При " + hours + " робочих годин на тиждень з річною зарплатою в " + salaryForYearWithoutTax + " та податком " + tax + "% - година часу коштує " + salaryForHourWithoutTax);
    }
}
