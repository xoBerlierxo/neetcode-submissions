class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int req;
        for(int i=0; i<nums.length; i++){
            req = target - nums[i];
            for(int j= 0; j<nums.length; j++){
                if(i==j) continue;
                if (nums[j]==req){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
