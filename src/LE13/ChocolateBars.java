package LE13;

public class ChocolateBars {
    private double womanBars;
    private double manBars;

    public void calculateBars(double weight, double height, int age) {
        double womanBMR = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
        double manBMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);

        womanBars = womanBMR / 230.0;
        manBars = manBMR / 230.0;
    }

    public double getWomanBars() {
        return womanBars;
    }

    public double getManBars() {
        return manBars;
    }
}