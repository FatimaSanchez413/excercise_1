package LE14;

public class DistanceBetweenPoints {
    private double distance;

    public void calculateDistance(double x1, double y1, double x2, double y2) {
        double xDiff = x2 - x1;
        double yDiff = y2 - y1;
        double sumOfSquares = Math.pow(xDiff, 2) + Math.pow(yDiff, 2);
        distance = Math.pow(sumOfSquares, 0.5);
    }

    public double getDistance() {
        return distance;
    }
}