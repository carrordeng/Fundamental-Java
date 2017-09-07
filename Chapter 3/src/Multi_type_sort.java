import java.util.Arrays;
import java.util.Scanner;

public class Multi_type_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] input = new String[N];
        String[] sorted = new String[N];
        int[] numricseq=new int[N];
        int[] charseq=new int[N];
        myArray<String> myarray = new myArray<String>();
        for (int i = 0; i < N; i++) {
            input[i] = sc.nextLine();
            if (isNumeric(input[i])) {
                myArray.increaseint();
                numricseq[myArray.getIntnumber()-1]=1;
            }
            if (isChar(input[i])){
                myArray.increasechar();
                charseq[myArray.getCharnumber()-1]=1;
            }
        }
        myarray.setValue(input);
        sorted = myarray.sort_return();
        for(int i=0;i<N;i++){
            if(numricseq[i]==1)
                System.out.println(sorted[i]);
        }
        for(int i=0;i<N;i++){
            if(charseq[i]==1)
                System.out.println(sorted[i]);
        }
    }

    public static boolean isNumeric(String str) {
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

class myArray<Type> {
    private static int intnumber = 0;
    private static int charnumber = 0;
    private Type[] value;

    public static void increaseint() {
        intnumber++;
    }

    public static void increasechar() {
        charnumber++;
    }

    public static int getIntnumber() {
        return intnumber;
    }

    public static int getCharnumber() {
        return charnumber;
    }

    public void setValue(Type value[]) {
        this.value = value;
    }

    public Type[] sort_return() {
        Type[] temp = this.value;
        Arrays.sort(temp);
        return temp;
    }

}