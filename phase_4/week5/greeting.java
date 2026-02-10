package phase_4.week5;

import java.util.Arrays;
import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[][] arr = new int[n][2];
            for (int i = 0; i < arr.length; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
            }

            // sort the arr on the basis of increasing end time
            Arrays.sort(arr, (a,b) -> a[1] - b[1]);

            // two people can greet only if their time overlap with other
            // overlapping => (a1,b1) , (a2, b2) => b1 < b2
            //     a1 ---------------b1
            //  a2-----------------------b2
            //  a2 < a1

            int greet = 0;
            for (int i = 1; i < arr.length; i++) {
                int a2 = arr[i][0];
                for (int j = 0; j < i; j++) {
                    int a1 = arr[j][0];
                    if(a1 >= a2){
                        greet++;
                    }
                }
            } 
            
            System.out.println(greet);
        }
    }
}
