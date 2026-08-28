class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[temperatures.length];

        for(int i=0;i<temperatures.length;i++){
            int cday = temperatures[i];
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()] ){
                int pday = st.pop();
                ans[pday] = i - pday;
            }
            st.push(i);
        }
        return ans;
    }
}