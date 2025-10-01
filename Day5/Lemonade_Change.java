package Day5;

public class Lemonade_Change {
    public static boolean lemonadeChange(int[] bills) {
        int n = bills.length;
        int totChange = 0;
        int b_5 = 0;
        int b_10 = 0;
        for(int i=0;i<n;i++){
            if(bills[i] == 20){
                if(b_10 > 0 && b_5 > 0){
                    b_10--;
                    b_5--;
                }else if(b_5 >= 3){
                    b_5 -= 3;
                }else{
                    return false;
                }
            }
            else if(bills[i] == 10){
                b_10++;
                if(b_5 > 0){
                    b_5--;
                }else{
                    return false;
                }
            }else{
                b_5++;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] bills = {5,5,5,10,20};
        System.out.println(lemonadeChange(bills));
    }
}
