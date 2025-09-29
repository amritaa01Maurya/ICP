package Day3;

public class Search_a_2D_Matrix {
    // 2.	
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int l =0;
        int r = m*n -1;
        while(l <= r){
            int mid = (l + r)/2;
            if(matrix[mid/n][mid%n] == target){
                return true;
            }else if(matrix[mid/n][mid%n] > target){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int t = 30;
        System.out.println(searchMatrix(matrix, t));
    }
}
