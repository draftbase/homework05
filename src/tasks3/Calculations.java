package tasks3;

public class Calculations {
    Section section;
    Point point1;
    Point point2;
    Point point3;

    private double a;
    private double b;
    private double c;

    public Calculations(Section section) {
        this.section = section;
    }

    public Calculations(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    double calculationSection(){
        return section.length();
    }
    boolean trianglePoints(double a, double b, double c){
        return a<b+c && b<a+c && c<b+a &&
                c>b-a && a>c-b && b>c-a;
    }
}
