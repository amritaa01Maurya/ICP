package Day3;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
    public static List<Integer> spiralOrder(int[][] arr) {
        int r=arr.length;
        int c=arr[0].length;
        int minc=0, minr=0, maxc=c-1, maxr=r-1;
        int te=r*c;
        List<Integer> ans = new ArrayList<>();
        while(te>0){
            for(int i=minc;i<=maxc;i++){
                ans.add(arr[minr][i]);
                te--;
        }
        minr++;
        if(minr>maxr) break;
        for(int i=minr;i<=maxr;i++){
            ans.add(arr[i][maxc]);
            te--;
        }
        maxc--;
        if(minc>maxc) break;
        for(int i=maxc;i>=minc;i--){
            ans.add(arr[maxr][i]);
            te--;
        }
        maxr--;
        if(minr>maxr) break;
        for(int i=maxr;i>=minr;i--){
            ans.add(arr[i][minc]);
            te--;
        }
        minc++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> l = spiralOrder(matrix);
        for (Integer i : l) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
