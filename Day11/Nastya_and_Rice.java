package Day11;
import java.util.Scanner;

public class Nastya_and_Rice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int minwt = n * (a - b);
            int maxwt = n * (a + b);
            int minReq = c - d;
            int maxReq = c + d;

            if (maxwt >= minReq && minwt <= maxReq) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        // 
    }
}
