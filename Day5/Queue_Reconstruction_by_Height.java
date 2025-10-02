package Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Queue_Reconstruction_by_Height {
    public static int[][] reconstructQueue(int[][] people) {
        int n = people.length;
        Arrays.sort(people, new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b){
                if(a[0] != b[0]){
                    return Integer.compare(b[0], a[0]);
                }
                return Integer.compare(a[1], b[1]);

            }
        });
        List<int[]> ll = new ArrayList<>();
        for(int[] arr: people){
            int pos = arr[1];
            ll.add(pos, arr);
        }
        return ll.toArray(new int[n][]);
    }

    public static void main(String[] args) {
        int[][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        int[][] queue = reconstructQueue(people);

        for (int i = 0; i < queue.length; i++) {
            for (int j = 0; j < queue[0].length; j++) {
                System.out.print(queue[i][j] + " ");
            }
            System.out.println();
        }
    }
}
