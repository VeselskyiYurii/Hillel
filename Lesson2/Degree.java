package Lesson2;

public class Degree {
    public static void main (String[] args) {

        double a = Double.parseDouble (args[0]);

        double b = Double.parseDouble (args[1]);

        double x = Math.pow(a, b);

        System.out.println(x);
    }
}
