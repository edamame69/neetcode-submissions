class Solution {
    public void sortColors(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
    }
    public void mergeSort(int[] arr, int l, int r) {
        if(l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public void merge(int[] arr, int l, int m, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = l;
        int j = m + 1;
        while(i <= m && j <= r) {
            if(arr[i] < arr[j]) {
                list.add(arr[i]);
                i++;
            }
            else {
                list.add(arr[j]);
                j++;
            }
        }
        while(i <= m) {
            list.add(arr[i]);
            i++;
        }
        while(j <= r) {
            list.add(arr[j]);
            j++;
        }
        for(i = l; i <= r; i++) {
            arr[i] = list.get(i - l);
        }
    }
}
