import java.util.Scanner;

public class MyPoint {
    private double x, y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(double initx, double inity) {
        x = initx;
        y = inity;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;
        x = sc.nextDouble();
        y = sc.nextDouble();
        MyPoint Point1 = new MyPoint(x, y);
        x = sc.nextDouble();
        y = sc.nextDouble();
        MyPoint Point2 = new MyPoint(x, y);
        System.out.println(Point1.getD(Point2));
    }

    public double getD(MyPoint Point2) {
        return Math.sqrt(Math.pow((this.x - Point2.x), 2) + Math.pow((this.y - Point2.y), 2));
    }
}
