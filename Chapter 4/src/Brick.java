import java.util.Scanner;
public class Brick {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println(solution(N));
    }
    public static int solution(int N){
        if(N==1)
            return 1;
        else if(N==2)
            return 2;
        else
            return solution(N-1)+solution(N-2);
    }
}