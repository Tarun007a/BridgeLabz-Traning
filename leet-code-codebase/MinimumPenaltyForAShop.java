// leetcode - 2483
// tc - O(n), sc - O(1)
class Solution {

    public int bestClosingTime(String customers) {
        int n = customers.length();
        int penalty = 0;
        int result = 0;
        int min;

        // count y ahead to get penalty for full
        for (int i = 0; i < n; i++) {
            if (customers.charAt(i) == 'Y') penalty++;
        }
        
        // assinging to min
        min = penalty;
        for (int i = 0; i < n; i++) {
            char ch = customers.charAt(i);

            // is Y comes penalty decreases or if N comes penalty increases
            if (ch == 'Y') penalty--;
            else penalty++;

            // update min
            if (penalty < min) {
                result = i + 1;
                min = penalty;
            }
        }
        return result;
    }
}