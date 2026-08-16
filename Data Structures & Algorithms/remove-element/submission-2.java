class Solution {
    public int removeElement(int[] nums, int val) {
        for(int i = 0, j = nums.length - 1; i < nums.length; i++) {
            if(nums[i] == val && i < j) {
                while(nums[j] == val && i < j) j--;
                int temp= nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int k = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) k++;
        }
        return k;
    }
}