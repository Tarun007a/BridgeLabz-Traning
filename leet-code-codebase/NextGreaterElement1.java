// leetcode - 496
class Solution {
    
    public int[] nge(int[] a){
        int n = a.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        st.push(a[n-1]);
        ans[n-1] = -1;
        for(int i = n - 2 ; i >= 0 ; i--){
            while(st.size() > 0 && st.peek() < a[i]){
                st.pop();
            }
            if(st.size() > 0) ans[i] = st.peek();
            else ans[i] = -1;
            st.push(a[i]);
        }
        return ans;
    }
    
    public int[] nextGreaterElement(int[] n1, int[] n2) {
        int n = n1.length;
        int m = n2.length;
        int[] arr = nge(n2);
        int[] ans = new int[n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(n2[j] == n1[i]){
                    ans[i] = arr[j];
                    continue;
                }
            }
        }
        return ans;
    }
}