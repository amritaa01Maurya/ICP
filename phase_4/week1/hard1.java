package phase_4.week1;

public class hard1 {
    // Median of Two Sorted Arrays
    public static int[] sort(int[] a1, int[] a2){
        int n = a1.length;
        int m = a2.length;
        int[] temp = new int[n+m];
        int i =0;
        int j =0;
        int idx = 0;
        while(i < n && j < m){
            if(a1[i] < a2[j]){
                temp[idx++] = a1[i];
                i++;
            }else{
                temp[idx++] = a2[j];
                j++;
            }
        }
        while(i < n){
            temp[idx++] = a1[i++];
        }
        while(j < m){
            temp[idx++] = a1[j++];
        }

        return temp;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,4,7,9};
        int[] arr2 = {2,3,5,6};

        int[] ans = sort(arr1, arr2);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

        double median = ans.length % 2 == 0 ? (double)(ans[(ans.length - 1) / 2 ] + ans[ans.length/2]): (double)ans[ans.length/2];
        System.out.println();
        System.out.println(median);
    }
}
