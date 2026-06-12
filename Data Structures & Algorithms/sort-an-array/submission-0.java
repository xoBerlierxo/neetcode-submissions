class Solution {

    public void mergesort(int[] nums, int left, int right){
        if(left<right){
            int mid = left + (right - left)/2;
            mergesort(nums, left, mid);
            mergesort(nums, mid+1, right);

            merge(nums, left,mid,right);
        }
    }

    public void merge(int[] nums, int left, int mid, int right){
        int n1 = mid-left+1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(nums, left, L, 0, n1);
        System.arraycopy(nums, mid+1, R, 0, n2);

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                nums[k] = L[i];
                i++;
            } else {
                nums[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            nums[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            nums[k] = R[j];
            j++;
            k++;
        }

    }


    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        mergesort(nums, 0, nums.length - 1);
        return nums;
    }
}