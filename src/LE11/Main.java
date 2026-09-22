package LE11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount (from 1 - 99 cents): ");
        int amount = scanner.nextInt();

        ChangeDenomination cd = new ChangeDenomination();
        cd.calculateChange(amount);

        System.out.println("Your change is");
        System.out.println(cd.getQuarters() + " quarter");
        System.out.println(cd.getDimes() + " dime");
        System.out.println(cd.getNickels() + " nickel");
        System.out.println(cd.getPennies() + " penny");

        scanner.close();
    }
}