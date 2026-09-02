class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        for(String ch : tokens){
            if(ch.equals("+")){
                int b = Integer.parseInt(st.pop());
                int a = Integer.parseInt(st.pop());
                st.push(Integer.toString(a+b));
            }
            else if(ch.equals("-")){
                int b = Integer.parseInt(st.pop());
                int a = Integer.parseInt(st.pop());
                st.push(Integer.toString(a-b));
            }
            else if(ch.equals("*")){
                int b = Integer.parseInt(st.pop());
                int a = Integer.parseInt(st.pop());
                st.push(Integer.toString(a*b));
            }
            else if(ch.equals("/")){
                int b = Integer.parseInt(st.pop());
                int a = Integer.parseInt(st.pop());
                st.push(Integer.toString(a/b));
            }
            else{
                st.push(ch);
            }
        }
        return Integer.parseInt(st.peek());
    }
}