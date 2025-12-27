// leetcode - 169
// tc - O(n), sc - O(1)
class Solution {
    public int majorityElement(int[] arr) {
        // initialize variables
        int n = arr.length;
        int ele = arr[0];
        int freq = 1;

        // finding majority element
        for(int i = 1; i < n; i++){
            if(arr[i] == ele)freq++;
            else if(freq == 1)ele = arr[i];
            else freq--;
        }
        return ele;
    }
}