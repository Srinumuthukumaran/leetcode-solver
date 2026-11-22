class Solution {
    public boolean checkString(String s) {
        int n = 0;
        for(int ch : s.toCharArray()){
            if(n==0 && ch=='b'){
                n=1;
            }
            else if(n==1 && ch == 'a'){
                return false;
            }
        }
        return true;
    }
}