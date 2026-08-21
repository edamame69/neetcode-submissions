class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        for(int num : nums) {
            count[num]++;
        }

        int i = 0;
        int idx = 0;
        while(i < nums.length) {
            for(int j = 0; j < count[idx]; j++) {
                nums[i] = idx;
                i++;
            }
            idx++;
        }
    }
}
