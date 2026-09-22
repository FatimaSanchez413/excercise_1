package LE13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = scanner.nextDouble();

        System.out.print("Enter age in years: ");
        int age = scanner.nextInt();

        ChocolateBars cb = new ChocolateBars();
        cb.calculateBars(weight, height, age);

        System.out.printf("Chocolate bars needed for a woman: %.2f\n", cb.getWomanBars());
        System.out.printf("Chocolate bars needed for a man: %.2f\n", cb.getManBars());

        scanner.close();
    }
}