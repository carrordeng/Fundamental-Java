import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] fibonacci = new long[N+1];
        if (N == 0)
            fibonacci[0] = 1;
        else if (N == 1) {
            fibonacci[0] = 1;
            fibonacci[1] = 1;
        } else {
            fibonacci[0] = 1;
            fibonacci[1] = 1;
            for (int i = 2; i <= N; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }
        System.out.println(fibonacci[N]);
    }
}
