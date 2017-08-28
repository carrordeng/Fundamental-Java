import java.util.Scanner;

public class Intersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String length1=sc.nextLine();
        String inputString1 = sc.nextLine();
        String length2=sc.nextLine();
        String inputString2 = sc.nextLine();
        String stringArray1[] = inputString1.split(" ");
        String stringArray2[] = inputString2.split(" ");
        int aggregate1[] = new int[stringArray1.length];
        int aggregate2[] = new int[stringArray2.length];
        for (int i = 0; i < stringArray1.length; i++) {
            aggregate1[i] = Integer.parseInt(stringArray1[i]);
        }
        System.out.println();
        for (int i = 0; i < stringArray2.length; i++) {
            aggregate2[i] = Integer.parseInt(stringArray2[i]);
        }
        long max, min, N;
        if (aggregate1.length >= aggregate2.length) {
            max = aggregate1.length;
            min = aggregate2.length;
            N = 0;
            for (int i = 0; i <= min - 1; i++) {
                for (int j = 0; j <= max - 1; j++) {
                    if (aggregate2[i] == aggregate1[j])
                        N++;
                }
            }
        } else {
            max = aggregate2.length;
            min = aggregate1.length;
            N = 0;
            for (int i = 0; i <= min - 1; i++) {
                for (int j = 0; j <= max - 1; j++) {
                    if (aggregate1[i] == aggregate2[j])
                        N++;
                }
            }
        }
        if (N == 0)
            System.out.println("None");
        else
            System.out.println(N);
    }
}