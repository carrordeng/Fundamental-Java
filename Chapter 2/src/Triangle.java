import java.util.Scanner;

public class Triangle {
    private double line1, line2, line3;

    public Triangle() {
        line1 = 0;
        line2 = 0;
        line3 = 0;
    }

    public Triangle(double line1, double line2, double line3) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
    }

    public static void main(String[] args) {
        double maxline, line1, line2, line3;
        Scanner sc = new Scanner(System.in);
        line1 = sc.nextDouble();
        line2 = sc.nextDouble();
        line3 = sc.nextDouble();
        maxline = line1;
        if (line2 > maxline)
            maxline = line2;
        if (line3 > maxline)
            maxline = line3;
        if ((line1 + line2) > line3 && (line1 + line3) > line2 && (line2 + line3) > line1) {
            Triangle T1 = new Triangle(line1, line2, line3);
            System.out.println(T1.getArea());
        } else if (maxline > 0) {
            Triangle T1 = new Triangle(maxline, maxline, maxline);
            System.out.println(T1.getArea());
        } else {
            Triangle T1 = new Triangle();
            System.out.println(T1.getArea());
        }
    }

    public double getArea() {
        double p = (line1 + line2 + line3) / 2;
        return Math.sqrt(p * (p - line1) * (p - line2) * (p - line3));
    }
}