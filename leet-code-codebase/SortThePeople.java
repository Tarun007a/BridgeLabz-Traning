// leetcode - 2418
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        String[] result = new String[n];
        HashMap<Integer, String> mp = new HashMap<>();
        for(int i = 0; i < n; i++){
            mp.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        for(int i = n-1; i >= 0; i--){
            result[(n-1)-i] = mp.get(heights[i]);
        }
        return result;
    }
}