package LE11;

public class ChangeDenomination {
    private int quarters;
    private int dimes;
    private int nickels;
    private int pennies;

    public void calculateChange(int amount) {
        quarters = amount / 25;
        amount = amount % 25;

        dimes = amount / 10;
        amount = amount % 10;

        nickels = amount / 5;
        amount = amount % 5;

        pennies = amount;
    }

    public int getQuarters() {
        return quarters;
    }

    public int getDimes() {
        return dimes;
    }

    public int getNickels() {
        return nickels;
    }

    public int getPennies() {
        return pennies;
    }
}