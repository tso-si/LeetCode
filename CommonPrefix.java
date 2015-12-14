package Leetcode;

/**
 * Created by csj on 2015/12/14.
 */
public class CommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int len=strs.length;
        if(len==0)return  "";
        if(len==1||strs[0]=="")return strs[0];
        int common=0;
        boolean cond=false;
        for(int i=0;i<strs[0].length();i++) {
            char temp = strs[0].charAt(i);
            for (int j = 1; j < len; j++) {
                if (i < strs[j].length()) {
                    if (temp == strs[j].charAt(i)) {
                        common++;
                        continue;
                    } else {
                        cond = true;
                        break;
                    }
                }else {
                    cond = true;
                    break;
                }

            }
            if (cond) break;
        }
        return strs[0].substring(0,common-1);
    }

    public static void main(String[] args){
        String[] test= new String[]{"",""};
        System.out.print(new CommonPrefix().longestCommonPrefix(test));
    }
}
