package Day5;

import java.util.Arrays;

public class Boats_to_Save_People {
    public static int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        Arrays.sort(people);
        int minBoat = 0;
        int i = 0;
        int j = n - 1;
        while(i <= j){
            if(people[i] + people[j] <= limit){
                i++;
                j--;
            }else{
                j--;
            }
            minBoat++;
        }
        return minBoat;
    }
    public static void main(String[] args) {
        int[] people = {1,2};
        int limit = 3;
        System.out.println(numRescueBoats(people, limit));
    }
}