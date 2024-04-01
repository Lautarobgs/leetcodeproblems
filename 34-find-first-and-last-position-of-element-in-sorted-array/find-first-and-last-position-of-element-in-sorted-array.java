class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] positions = {-1, -1};
        int i  = 0;
        while(i<nums.length && nums[i] < target)
        {
            i++;
        }
        if(i<nums.length && nums[i] == target)
        {
            positions[0] = i;
            while(i < nums.length && nums[i] == target){
                i++;
            }
            positions[1] = i-1;
        }
        return positions;
    }
}