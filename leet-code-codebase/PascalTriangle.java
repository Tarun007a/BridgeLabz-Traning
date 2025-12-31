// leetcode 118
class Solution {
    public List<List<Integer>> generate(int n) {
        List<Integer> prev = new ArrayList<>();
        prev.add(1);

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(prev);
        if(n == 1) return ans;

        for(int i = 2; i <= n; i++){
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j = 1; j < prev.size(); j++){
                curr.add(prev.get(j)+prev.get(j-1));
            }
            curr.add(1);
            prev = curr;
            ans.add(curr);
        }
        return ans;
    }
}