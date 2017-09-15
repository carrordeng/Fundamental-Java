import java.util.Scanner;

public class Goldbach_conjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 0;
        boolean[] prime_flag = new boolean[input + 1];
        int[] prime_number = new int[input + 1];
        for (int i = 1; i <= input; i++) {
            prime_flag[i] = isPrime(i);
            if (prime_flag[i]) {
                sum++;
                prime_number[sum] = i;
//                System.out.println(i);
            }
        }
        for (int i = 1; i <= input / 2; i++) {
            if (prime_flag[i]) {
                if (prime_flag[input - i]) {
                    System.out.println(input + "=" + i + "+" + (input - i));
                }
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number == 1)
            return false;
        else if (number == 2)
            return true;
        else {
            if ((number % 2) == 0)
                return false;
            else {
                for (int j = 3; j <= (int) Math.sqrt((double) number); j = j + 2) {
                    if ((number % j) == 0)
                        return false;
                }
                return true;
            }
        }
    }
}