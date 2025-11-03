package Day11;

import java.util.Scanner;

public class Binary_String_Minimizing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0){
            int n= sc.nextInt();
            long k= sc.nextLong();
            String s = sc.next();
            char[] arr = s.toCharArray();
            int j = 0;
            for(int i=0;i<n;i++){
                if(arr[i] == '0'){
                    if((i - j) <= k){
                        char temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        k -= i - j;
                        j++;
                    }else{
                        int pos = i-(int)k;
                        char temp = arr[i];
                        arr[i] = arr[pos];
                        arr[pos] = temp;
                        k = 0;
                        break;
                    }
                }
            }
            System.out.println(new String(arr));
            // 
        }
    }
}
