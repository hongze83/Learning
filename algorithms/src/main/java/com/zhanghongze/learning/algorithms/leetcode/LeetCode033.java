package com.zhanghongze.learning.algorithms.leetcode;

public class LeetCode033 {

    public int search(int[] nums, int target) {
        if(nums == null || nums.length==0){
            return -1;
        }

        int start = 0;
        int end = nums.length-1;

        while (start<end){
            int mid = (start+end)/2;

            if(nums[mid]> nums[end]){
                if(target > nums[mid] || target <= nums[end]){
                    start = mid + 1;
                }else{
                    end = mid;
                }
            }else {
                if(target > nums[mid] && target <= nums[end]){
                    start = mid +1;
                }else {
                    end = mid;
                }
            }
        }

        if(start == end && nums[start] == target){
            return start;
        }

        return -1;
    }
}
