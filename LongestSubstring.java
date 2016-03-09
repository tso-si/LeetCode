package Leetcode;


import java.util.*;

/**
 * Created by csj on 2015/12/4.
 */
public class LongestSubstring {

    //the length of longest subsif(s.length()==0&&s!=null)return 0;

    public int lengthOfLongestSubstring(String s){
        int max=0;
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0,j=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                j=Math.max(j,map.get(s.charAt(i))+1);

            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
}
