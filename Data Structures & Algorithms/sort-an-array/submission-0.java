class Solution {
    public int[] sortArray(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            int replace = nums[i];
            int idx = i;
            for(int j = i; j < nums.length; j++) {
                if(nums[j] < replace) {
                    replace = nums[j];
                    idx = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp;
        }
        return nums;
    }
}