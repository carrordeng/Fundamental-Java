import java.util.Scanner;

public class Com_div_mul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M, N, a, b, c,div,mul;
        M = sc.nextInt();
        N = sc.nextInt();
        a = M;
        b = N;
        while (b != 0) {
            c = a % b;
            a = b;
            b = c;
        }
        div=a;
        mul=M*N/div;
        System.out.println(div+" "+mul);
    }
}
