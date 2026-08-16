class Solution {
    public int removeElement(int[] nums, int val) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                for(int j = nums.length - 1;  j > i; j--) {
                    if(nums[j] != val) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;  
                        break;
                    }
                }
            }
        }
        int k = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) k++;
        }
        return k;
    }
}