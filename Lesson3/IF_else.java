package Lesson3;

import java.util.Scanner;

public class IF_else {

//    public static void main(String[] args) {
//
//        int costForOneUnit = Integer.parseInt(args[0]);
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("How much product you want to buy?");
//        int quantityOfProduct = scanner.nextInt();
//
//        double priceWithoutDiscounts = costForOneUnit * quantityOfProduct;

//        if (quantityOfProduct <= 10) {
//            System.out.println("Price for products " + priceWithoutDiscounts);
//
//        } else if ((quantityOfProduct > 10) && (quantityOfProduct <= 20)) {
//            double priceWith5percentDiscounts = priceWithoutDiscounts * 95 / 100;
//            System.out.println("Price for products with 5 percent discounts: " + priceWith5percentDiscounts);
//
//        } else if ((quantityOfProduct > 20) && (quantityOfProduct <= 30)) {
//            double priceWith10percentDiscounts = priceWithoutDiscounts * 90 / 100;
//            System.out.println("Price for products with 10 percent discounts: " + priceWith10percentDiscounts);
//
//        } else if ((quantityOfProduct >= 31) && (quantityOfProduct <= 40)) {
//            double priceWith12percentDiscounts = priceWithoutDiscounts * 88 / 100;
//            System.out.println("Price for products with 12 percent discounts: " + priceWith12percentDiscounts);
//
//        } else if ((quantityOfProduct >= 41) && (quantityOfProduct <= 50)) {
//            double priceWith12and4percentDiscounts = priceWithoutDiscounts * 87.6 / 100;
//            System.out.println("Price for products with 12.4 percent discounts: " + priceWith12and4percentDiscounts);
//
//        } else if ((quantityOfProduct >= 51) && (quantityOfProduct <= 60)) {
//            double priceWith12and8percentDiscounts = priceWithoutDiscounts * 87.2 / 100;
//            System.out.println("Price for products with 12.8 percent discounts: " + priceWith12and8percentDiscounts);
//
//        } else if ((quantityOfProduct >= 61) && (quantityOfProduct <= 70)) {
//            double priceWith13and2percentDiscounts = priceWithoutDiscounts * 86.8 / 100;
//            System.out.println("Price for products with 13.2 percent discounts: " + priceWith13and2percentDiscounts);
//
//        } else if ((quantityOfProduct >= 71) && (quantityOfProduct <= 80)) {
//            double priceWith13and6percentDiscounts = priceWithoutDiscounts * 86.4 / 100;
//            System.out.println("Price for products with 13.6 percent discounts: " + priceWith13and6percentDiscounts);
//
//        } else if (quantityOfProduct > 80) {
//            double priceWith13percentDiscounts = priceWithoutDiscounts * 87 / 100;
//            System.out.println("Price for products with 13 percent discounts: " + priceWith13percentDiscounts);
//        }

    public static void main(String[] args) {

        int costForOneUnit = Integer.parseInt(args[0]);

        Scanner scanner = new Scanner(System.in);

        System.out.println("How much product you want to buy?");
        int quantityOfProduct = scanner.nextInt();

        double priceWithoutDiscounts = costForOneUnit * quantityOfProduct;

        double[] discounts = {0, 5, 10, 12, 12.4, 12.8, 13.2, 13.6, 13};

        double discount = 0;
        for (int i = 0; i < discounts.length; i++) {
            if (quantityOfProduct > i * 10 && quantityOfProduct <= (i + 1) * 10) {
                discount = discounts[i];
                break;
            }
        }

        double discountedPrice = priceWithoutDiscounts * (100 - discount) / 100;

        if (discount > 0) {
            System.out.println("Price for products with " + discount + "% discount: " + discountedPrice);
        } else {
            System.out.println("Price for products without discount: " + priceWithoutDiscounts);
        }
    }

}