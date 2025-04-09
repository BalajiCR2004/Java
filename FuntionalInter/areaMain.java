
public class areaMain {
    final static Double PI=(22.0/7.0);
    public static void main(String[] args) {
        Area circle = radius -> PI * radius * radius;
        Area square = side -> side * side;

        System.out.println(circle.area(2.5));
        System.out.println(square.area(5.0));
        System.out.println("excess area "+(square.area(5.0)-circle.area(2.5)));

    }
}
