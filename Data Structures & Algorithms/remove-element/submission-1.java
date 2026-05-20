class Solution {
    public int removeElement(int[] nums, int val) {
        int rdptr = 0;
        int wrtptr = 0;
        int k=0;
        while(rdptr < nums.length){
            if(nums[rdptr] != val){
                nums[wrtptr] = nums[rdptr];
                rdptr++;
                wrtptr++; 
            }
            else{
                k++;
                rdptr++;
            }
        }
        return wrtptr;
    }
}