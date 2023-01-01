import java.util.Scanner;
public class Prob4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a,b;

        for(int i = 1;i<=t;i++){
            a = sc.nextInt();b = sc.nextInt();
            for(int j=1;j<=i;j++){
                System.out.println(a+b);
            }
        }
    }
}
