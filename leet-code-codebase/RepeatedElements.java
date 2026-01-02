// leetcode - 961
class Solution {
    public int repeatedNTimes(int[] nums) {
        int first = nums[0];
        int ele = 0;
        int freq = 0;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == first) return first;
            if(freq == 0){
                ele = nums[i];
            }
            if(nums[i] == ele) freq++;
            else freq--;
        }
        return ele;
    }
}