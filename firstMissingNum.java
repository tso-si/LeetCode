package Leetcode;

/**
 * Created by csj on 2016/1/20.
 */
public class firstMissingNum {
    private int Solution(int[] nums){
        int n=nums.length;
        /*  three setps:
        1.partition
        2.make A[i] negative to indicate the existence of i+1
        3.scan the first positive number in nums
         */
        int k=Partition(nums)+1;  //the first missing number must be within [1,k+1];
        int temp=0;
        int fist_miss=k;
        //step 2:
        for(int i=0;i<k;i++){  //k positive numbers
            temp=Math.abs(nums[i]);
            if(temp<=k) nums[temp-1]=(nums[temp-1]<0) ?nums[temp-1]:-nums[temp-1];
        }
        //step 3:
        for(int i=0;i<k;i++){
            if(nums[i]>0){
                fist_miss=i;
                break;
            }
        }
        return fist_miss;
    }
   int  Partition(int[] A){

       int n=A.length;
       int q=-1;
       for(int i=0;i<n;i++){
           if(A[i]>0){
               q++;
                swap(A,q,i);
           }
       }
       return q;
    }
    void swap(int[] A,int i,int j){
        if(i!=j){
            A[i]^=A[j];
            A[j]^=A[i];
            A[i]^=A[j];
        }
    }
}
