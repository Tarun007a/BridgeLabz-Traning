// leetcode - 14
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        int k = 0;
        while(true){
            if(strs[0].length() <= k)return strs[0];
            char ch = strs[0].charAt(k);
            for(int i = 1; i < n; i++){
                String s = strs[i];
                if(s.length() <= k || s.charAt(k) != ch)return strs[0].substring(0,k);
            }
            k++;
        }
    }
}