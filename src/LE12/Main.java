package LE12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int num = scanner.nextInt();

        MultiplyDigits md = new MultiplyDigits();
        md.processNumber(num);

        if (md.getDigit1() != 0) {
            System.out.println(md.getDigit1());
        }
        if (md.getDigit1() != 0 || md.getDigit2() != 0) {
            System.out.println(md.getDigit2());
        }
        System.out.println(md.getDigit3());

        System.out.println("The product of all digits in " + num + " is " + md.getProduct());

        scanner.close();
    }
}