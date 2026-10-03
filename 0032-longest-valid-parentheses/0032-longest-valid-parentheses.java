class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int count = 0;
        st.push(-1);

        for(int i=0;i<s.length();i++){
            int ch = s.charAt(i);
            if(ch == '('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                    count = Math.max(count,i-st.peek());
                }
            }
        }
        return count;
    }
}