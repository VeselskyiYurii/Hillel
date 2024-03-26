package Lesson6;

public class Actions {
    public static void main(String[] args) {

        Product tablet = new Product("Tablet", 45288775, 750.50, "Tablet ASUS", true);

        tablet.price = 760.99;

        Employee firstWorker = new Employee("Donatello", "Mike", "Boss of the boss", 150.99);

        Employee secondWorker = new Employee("Bobio", "Bob", "Little  Boss", 100.99);

        firstWorker.getSecondName();

        secondWorker.setPosition("Boss");


        Triangle firstTriangle = new Triangle(12, 12, 10);

        Integer firstTrianglePerimeter = firstTriangle.getFirstSide() + firstTriangle.getSecondSide() + firstTriangle.getThirdSide();

        Integer firstAreaOfATriangle = ((firstTriangle.getFirstSide() * firstTriangle.getThirdSide()) / 2);


        Credit creditForPIB = new Credit(200000, 12.8, 5, 20, 120000.25);

        creditForPIB.setLoanBalance(100856.39);

    }
}
