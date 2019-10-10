package tasks3;

public class Test {
    public static void main(String[] args) {

        Point point1 = new Point(2,1);
        Point point2 = new Point(3,3);
        Point point3 = new Point(-2,-1);
        Section section1 = new Section(point1,point2);
        Section section2 = new Section(point2,point3);
        Section section3 = new Section(point3,point1);
        Calculations calculations1 = new Calculations(section1);
        Calculations calculations2 = new Calculations(section2);
        Calculations calculations3 = new Calculations(section3);
        System.out.println(calculations1.calculationSection());
        System.out.println(calculations2.calculationSection());
        System.out.println(calculations3.calculationSection());
        System.out.println(calculations1.trianglePoints(calculations1.calculationSection()
                                                        ,calculations2.calculationSection()
                                                        ,calculations3.calculationSection()));






    }




}
