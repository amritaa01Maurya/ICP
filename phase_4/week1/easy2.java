package phase_4.week1;

public class easy2 {
    // Find the Index of the First Occurrence in a String
    public static int firstIdx(String s, String t){
        return s.indexOf(t);
        /*
        int k = t.length();
        int n = s.length();
        for(int i=0;i<=n-k;i++){
            if(s.substring(i, i+k).equals(t)){
                return i;
            }
        }
        return -1;
        */
    }
    public static void main(String[] args) {
        String haystack = "butsad";
        String needle = "sad";

        System.out.println(firstIdx(haystack, needle));
    }
}
