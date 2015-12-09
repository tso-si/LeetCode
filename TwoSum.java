package Leetcode;
import java.util.*;
/**
 * Created by csj on 2015/12/4.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        if(nums.length<2)return null;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[0] = map.get((target-nums[i]))+1;
                result[1]= i+1;
            }else{
                map.put(nums[i],i);
            }
        }
        return result;
    }
}
