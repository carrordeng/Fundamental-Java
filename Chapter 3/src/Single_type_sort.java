import java.util.Arrays;
import java.util.Scanner;

public class Single_type_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] input = new String[N];
        String[] sorted = new String[N];
        int[] numricseq = new int[N];
        int[] charseq = new int[N];
        myArray myarray=new myArray();
        for (int i = 0; i < N; i++) {
            input[i] = sc.nextLine();
            if (isNumeric(input[i]))
                numricseq[i] = 1;

            if (isChar(input[i]))
                charseq[i] = 1;

        }
        myarray.setValue(input);
        sorted = myarray.sort_return(N);
        for (int i = 0; i < N; i++) {
            if (numricseq[i] == 1)
                System.out.println(sorted[i]);
        }
        for (int i = 0; i < N; i++) {
            if (charseq[i] == 1)
                System.out.println(sorted[i]);
        }
    }

    private static boolean isNumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int j = (int) c;
            if (!((j >= 65 && j <= 90) || (j >= 97 && j <= 122)))
                return false;
        }
        return true;
    }
}

class myArray {
    private String[] value;

    public void setValue(String value[]) {
        this.value = value;
    }

    public String[] sort_return(int N) {
        String[] sorted=new String[N];
        for (int i = 0; i < N; i++) {
            char[] chars = this.value[i].toCharArray();
            Arrays.sort(chars);
            sorted[i] = new String(chars);
        }
        return sorted;
    }
}