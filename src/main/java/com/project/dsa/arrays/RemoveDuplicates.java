package com.project.dsa.arrays;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (count == 0 || num != nums[count]) {
                nums[count++] = num;
            }
        }
        return count;
    }
}
