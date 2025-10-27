package Day11;
import java.util.*;

public class Transformation_from_A_to_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        TreeSet<Integer> l = new TreeSet<>();
        l.add(b);

        while (b > a) {
            if (b % 2 == 0) {
                b /= 2;
            } else if (b % 10 == 1) {
                b /= 10;
            } else {
                break;
            }
            l.add(b);
        }

        if (b == a) {
            System.out.println("YES");
            System.out.println(l.size());
            for (int num : l) {
                System.out.print(num + " ");
            }
            System.out.println();
        } else {
            System.out.println("NO");
        }
    }
}
