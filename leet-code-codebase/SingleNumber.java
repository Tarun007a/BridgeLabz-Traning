// leetcode - 136
// tc - O(n), sc - O(1)
class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
		// finding xor of all elements to get single number
        for(int i = 0; i < nums.length; i++){
            ans = ans^nums[i];
        }
        return ans;
    }
}