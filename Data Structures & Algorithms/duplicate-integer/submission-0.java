class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        for(Integer value : mp.values()) {
            if(value > 1) return true;
        }
        return false; 
    }
}