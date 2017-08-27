import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] input = new String[N];
        for (int i = 0; i < N; i++) {
            input[i] = sc.next();
        }
        Arrays.sort(input);
        for(String str : input) {
            System.out.println(str);
        }
    }
}
