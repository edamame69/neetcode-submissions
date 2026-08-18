class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int[] result = new int[k];
        List<Integer>[] bucket = new List[nums.length + 1];
        for(int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            bucket[value].add(key);
        }

        int count = 0;
        for(int i = bucket.length - 1; i >= 0; i--) {
            for(int num : bucket[i]) {
                if(count < k) {
                    result[count] = num;
                    count++;
                }
            }
        }
        return result;

        




    }
}
