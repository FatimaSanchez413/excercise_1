package LE12;

public class MultiplyDigits {
    private int digit1;
    private int digit2;
    private int digit3;
    private int product;

    public void processNumber(int number) {
        digit1 = number / 100;
        digit2 = (number / 10) % 10;
        digit3 = number % 10;

        if (digit1 != 0) {
            product = digit1 * digit2 * digit3;
        } else if (digit2 != 0) {
            product = digit2 * digit3;
        } else {
            product = digit3;
        }
    }

    public int getDigit1() {
        return digit1;
    }

    public int getDigit2() {
        return digit2;
    }

    public int getDigit3() {
        return digit3;
    }

    public int getProduct() {
        return product;
    }
}