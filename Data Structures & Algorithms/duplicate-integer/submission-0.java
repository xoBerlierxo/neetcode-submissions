class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean check = false;
        int selel;
        for(int i=0; i<nums.length; i++){
            selel = nums[i];
            for(int j =0; j<nums.length; j++){
                if(i == j) continue;
                else if(nums[i] == nums[j]){
                    check = true;
                }
            }
        }
        return check;
    }
}