class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int min = 0;
        int max = nums.length - 1;
        int mid = 0;

        while(min <= max) {
            mid = (min + max) / 2;

            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) max = mid - 1;
            else min = mid + 1;
        }

        if(nums[mid] > target) return mid;
        else return mid + 1;
    }
}