package phase_4.week3;

import java.util.Scanner;

public class Queue_at_the_School {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        String s = sc.next();

        char[] arr = s.toCharArray();

        for(int i=1;i<=t;i++){
            int j =0;
            while(j < arr.length - 1) {
                if(arr[j] == 'B' && arr[j+1] == 'G'){
                    arr[j] = 'G';
                    arr[j+1] = 'B';
                    j += 2;
                }else{
                    j++;
                }
            }
        }
        System.out.println(new String(arr));
    }
}
