package Leetcode;

/**
 * Created by csj on 2016/1/17.
 */
public class searchInsert {
    private  static int Solution(int[] nums,int target){
        if(nums.length<1||target<=nums[0])return 0;
        if(target>nums[nums.length-1])return nums.length;

        int low=0,high=nums.length-1;
        while(low<high){
            int middle=(low+high)/2;
            if(target==nums[middle])return middle;
            else if(target<nums[middle])high=middle-1;
            else low=middle+1;


        }


    return low;
    }
    public static void main(String[] args){
        int[] a = new int[]{1,3,5};

        System.out.print(Solution(a, 2));
    }
}
