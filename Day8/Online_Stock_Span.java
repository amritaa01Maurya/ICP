import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Online_Stock_Span {
    static class StockSpanner {
        Stack<Integer> s;
        List<Integer> l ;
        int i;
    public StockSpanner() {
        s = new Stack<>();
        l = new ArrayList<>();
        i = 0;
    }
    
    
    public int next(int price) {
        while(!s.isEmpty() && l.get(s.peek()) <= price){
            s.pop();
        }
        int ans = 0;
        if(i==0 && s.isEmpty()){
            ans = 1;
        }
        else if(s.isEmpty() && i > 0){
            ans = i + 1;
        }else{
            ans = i - s.peek();
        }
        l.add(price);
        s.push(i);
        i++;
        return ans;
    }
}

    public static void main(String[] args) {
            StockSpanner obj = new StockSpanner();
            int[] prices = {100, 80, 60, 70, 60, 75, 85};

            for (int price : prices) {
                System.out.println("Next (" + price + ") -> " + obj.next(price));
            }
        }
/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
}
