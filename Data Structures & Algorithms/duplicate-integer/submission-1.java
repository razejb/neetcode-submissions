class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();

        for(int num : nums){
            unique.add(num);
        }

        if(nums.length != unique.size()){
            return true;
        } else {
            return false;
        }
            
    }
}