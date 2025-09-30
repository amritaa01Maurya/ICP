package Day4;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Anagrams_in_a_String {
    public static boolean isAnagram(int[] arr){
        for(int i=0;i<26;i++){
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> indices = new ArrayList<>();
        int len = p.length();
        int m = s.length();
        int[] freq = new int[26];
        for(int i=0;i<len;i++){
            freq[p.charAt(i)-'a']++;
        }
        int l =0;
        for(int r=0;r<m;r++){
            freq[s.charAt(r)-'a']--;
            while(r-l+1 > len){
                freq[s.charAt(l)-'a']++;
                l++;
            }
            if(isAnagram(freq)){
                indices.add(l);
            }  
        }
        return indices;
    }
    public static void main(String[] args) {
        String p = "abc";
        String s = "cbaebabacd";
        List<Integer> indices = findAnagrams(s, p);
        for (int i = 0; i < indices.size(); i++) {
            System.out.print(indices.get(i) + " ");
        }
    }
}
