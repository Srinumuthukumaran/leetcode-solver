class Solution {
    public int subtractProductAndSum(int n) {
        int ans =0;
        int mul = 1;
        int add = 0;

        while(n!=0){
            int dig = n%10;
            mul*=dig;
            add+=dig;
            n/=10;
        }
        ans = mul - add;
        return ans;
    }
}