// leetcode 119
class Solution {
    public List<Integer> getRow(int r) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        if(r == 0)return l;
        l.add(1);
        if(r == 1) return l;
        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < r - 1 ; i++){
            ans = new ArrayList<>();
            ans.add(1);
            for(int j = 0 ; j < l.size() - 1 ; j++){
                ans.add(l.get(j)+l.get(j+1));
            }
            ans.add(1);
            l = ans;
        }
        return ans;
    }
}