import java.util.ArrayDeque;
import java.util.Deque;

public class Simplify_Path {
    public static String simplifyPath(String path) {
        int n = path.length();
        Deque<String> dq = new ArrayDeque<>();      
        for(int i=0;i<n;i++){
            if(path.charAt(i) == '/'){
                continue;
            }
            StringBuilder sb = new StringBuilder();
            while(i < n && path.charAt(i) != '/'){
                sb.append(path.charAt(i));
                i++;
            }
            if(sb.toString().equals(".")){
                continue;
            }else if(sb.toString().equals("..")){
                if(!dq.isEmpty()){
                    dq.removeLast();
                }
            }else{
                dq.addLast(sb.toString());
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!dq.isEmpty()){
            sb.append("/").append(dq.removeFirst());
        }
        return sb.length()==0? "/":sb.toString();
    }

    public static void main(String[] args) {
        String s = "/home/user/Documents/../Pictures";
        System.out.println(simplifyPath(s));
    }

}
