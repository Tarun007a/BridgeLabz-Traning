// leetcode - 1160
class Solution {
    public int countCharacters(String[] words, String chars) {
        int ans = 0;
        for(int i = 0; i < words.length; i++){
            int[] arr = new int[26];
            for(int k = 0; k < chars.length(); k++){
                arr[(int)chars.charAt(k)-97]++;
            }
            boolean flag = true;
            for(int j = 0; j < words[i].length(); j++){
                int idx = (int)words[i].charAt(j)-97;
                if(arr[idx] == 0){
                    flag = false;
                    break;
                }
                arr[idx]--;
            }
            if(flag)ans += words[i].length();
        }
        return ans;
    }
}