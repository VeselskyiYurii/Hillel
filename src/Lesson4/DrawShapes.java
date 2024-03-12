package Lesson4;

import java.util.Scanner;

public class DrawShapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Choose a shape to draw: ");
            System.out.println("1. Rectangle");
            System.out.println("2. Right Triangle");
            System.out.println("3. Inverted Right Triangle");
            System.out.println("4. Isosceles Triangle");
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    int rectangleHeight = 4;
                    int rectangleWidth = 9;
                    drawRectangle(rectangleHeight, rectangleWidth);
                }
                case 2 -> {
                    int rightTriangleHeight = 5;
                    drawRightTriangle(rightTriangleHeight);
                }
                case 3 -> {
                    int invertedTriangleHeight = 5;
                    drawInvertedRightTriangle(invertedTriangleHeight);
                }
                case 4 -> {
                    int isoscelesTriangleHeight = 5;
                    drawIsoscelesTriangle(isoscelesTriangleHeight);
                }
                default -> System.out.println("Invalid choice." +
                        " Please enter a number between 1 and 4.");
            }

            System.out.print("Do you want to draw another shape? (yes/no): ");
        } while (scanner.next().equalsIgnoreCase("yes"));

        System.out.println("Program ended.");
    }

    private static void drawRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void drawRightTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void drawInvertedRightTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = height - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void drawIsoscelesTriangle(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
