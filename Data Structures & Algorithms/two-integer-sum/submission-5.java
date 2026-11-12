class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i;
        int j;
        for(i=0; i < nums.length; i++){
            for(j=0; j < nums.length; j++){
                if(nums[i] + nums[j] == target && i != j){
                    return new int[]{i, j};
                }
            }    
        }
        return null;
    }
}