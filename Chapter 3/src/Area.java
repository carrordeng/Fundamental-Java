import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] input = new String[N];
        for (int i = 0; i < N; i++) {
            input[i] = sc.nextLine();
        }
        for (int i = 0; i < N; i++) {
            String[] temp = input[i].split(" ");
            if (temp.length == 3) {
                int[] line = new int[3];
                for (int j = 0; j < 3; j++) {
                    line[j] = Integer.parseInt(temp[j]);
                }
                Triangle triangle = new Triangle();
                triangle.setLine(line);
                System.out.println(triangle.calArea());
            }
            if (temp.length == 2) {
                int[] line = new int[2];
                for (int j = 0; j < 2; j++) {
                    line[j] = Integer.parseInt(temp[j]);
                }
                Rectangle rectangle = new Rectangle();
                rectangle.setLine(line);
                System.out.println(rectangle.calArea());
            }
        }
    }
}

abstract class Graph {
    public abstract int calArea();
}

class Triangle extends Graph {
    private int[] line = new int[3];

    public void setLine(int[] line) {
        System.arraycopy(line,0,this.line,0,3);
    }

    @Override
    public int calArea() {
        double p = (line[0] + line[1] + line[2]) / 2.0;
        double ans = Math.sqrt(p * (p - line[0]) * (p - line[1]) * (p - line[2]));
        return (int) ans;
    }
}

class Rectangle extends Graph {
    private int[] line = new int[2];

    public void setLine(int[] line) {
        System.arraycopy(line,0,this.line,0,2);
    }

    @Override
    public int calArea() {
        return line[0] * line[1];
    }
}