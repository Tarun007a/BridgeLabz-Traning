// leetcode 3074
// tc - O(mlogm), sc - O(1)
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int m = capacity.length;

        // sort the array
        Arrays.sort(capacity);
        int sum = 0;

        // finding total sum
        for(int i : apple ) sum += i;
        int result = 0;
        int curr = 0;

        // finding minimum number
        for(int i = m-1; i >= 0 && curr < sum; i--){
            curr += capacity[i];
            result++;
        }
        return result;
    }
}