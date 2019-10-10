package tasks3;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public boolean cartesianSystemQuarter1(){
        return x > 0 && y > 0;
    }
    public boolean cartesianSystemQuarter2(){
        return x < 0 && y > 0;
    }
    public boolean cartesianSystemQuarter3(){
        return x < 0 && y < 0;
    }
    public boolean cartesianSystemQuarter4(){
        return x > 0 && y < 0;
    }
    public boolean cartesianSystemAxisX(){
        return x == 0;
    }
    public boolean cartesianSystemAxisY(){
        return y == 0;
    }
    public boolean cartesianSystemAxisXY(){
        return x == 0 && y == 0;
    }
}
