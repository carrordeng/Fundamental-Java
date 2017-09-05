import java.util.Scanner;

public class Score {
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
                int[] score = new int[3];
                for (int j = 0; j < 3; j++) {
                    score[j] = Integer.parseInt(temp[j]);
                }
                Student student = new Student();
                student.storeinfo(score);
                System.out.println("Student" + " " + student.getAverage());
            }
            if (temp.length == 4) {
                int[] score = new int[4];
                for (int j = 0; j < 4; j++) {
                    score[j] = Integer.parseInt(temp[j]);
                }
                Teacher teacher = new Teacher();
                teacher.storeinfo(score);
                System.out.println("Teacher" + " " + teacher.getAverage());
            }
        }
    }
}

abstract class Person {
    public abstract int getAverage();

    public abstract void storeinfo(int score[]);
}

class Student extends Person {
    int[] score = new int[3];

    public void storeinfo(int score[]) {
        for (int i = 0; i < 3; i++) {
            this.score[i] = score[i];
        }
    }

    @Override
    public int getAverage() {
        return ((score[0] + score[1] + score[2]) / 3);
    }
}

class Teacher extends Person {
    int[] score = new int[4];

    public void storeinfo(int score[]) {
        for (int i = 0; i < 4; i++) {
            this.score[i] = score[i];
        }
    }

    public int getAverage() {
        return ((score[0] + score[1] + score[2] + score[3]) / 4);
    }
}