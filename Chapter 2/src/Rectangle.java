import java.util.Scanner;

public class Rectangle {
    int height;
    int width;
    public int getArea(){
        return height*width;
    }
    public int getPrimeter(){
        return 2*(height+width);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        int area, perimeter;
        r1.height = sc.nextInt();
        r1.width = sc.nextInt();
        area=r1.getArea();
        perimeter=r1.getPrimeter();
        System.out.println(area+" "+perimeter);
    }
}