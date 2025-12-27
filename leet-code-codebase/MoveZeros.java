// leetcode - 283
// tc - O(n), sc - O(1)
class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        int i = 0;

        // fill non zero elements ahead
        for(int j = 0 ; j < n ; j++){
            if(arr[j] != 0){
                arr[i] = arr[j];
                i++;
            }
        }
		
        // filling zeros at the end
        while(i < n){
            arr[i] = 0;
            i++;
        }
    }
}