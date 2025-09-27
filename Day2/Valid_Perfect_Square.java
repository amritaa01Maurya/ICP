package Day2;

public class Valid_Perfect_Square {
    public static boolean isPerfectSquare(int num) {
        long l = 1;
        long r = num;
        while(l<=r){
            long mid = l + (r - l)/2;
            if(mid * mid == (long) num){
                return true;
            }else if ( mid * mid < num){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPerfectSquare(n));
    }
}
