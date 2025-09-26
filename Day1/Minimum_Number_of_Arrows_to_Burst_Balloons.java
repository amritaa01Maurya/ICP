package Day1;

import java.util.Arrays;
import java.util.Comparator;

public class Minimum_Number_of_Arrows_to_Burst_Balloons{
    public static int findMinArrowShots(int[][] points) {
        int n =points.length;
        Arrays.sort(points, new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b){
                return Integer.compare(a[1], b[1]);
            }
        });
        int prevEnd = points[0][1];
        int minArrow = 0;
        for(int i=1;i<n;i++){
            int currStart = points[i][0];
            if(currStart <= prevEnd){
                continue;
            }else{
                prevEnd = points[i][1];
                minArrow++;
            }
        }
        return minArrow + 1;
    }
    public static void main(String[] args) {
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(findMinArrowShots(points));
    }
}