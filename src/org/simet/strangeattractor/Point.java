package org.simet.strangeattractor;

public class Point {

    private double x;
    private double y;

    public Point(double x2, double y2) {
        this.x = x2;
        this.y = y2;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}
