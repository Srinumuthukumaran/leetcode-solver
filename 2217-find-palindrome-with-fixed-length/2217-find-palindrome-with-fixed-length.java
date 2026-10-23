class Solution {
    public long[] kthPalindrome(int[] queries, int intLength) {
        long[] result = new long[queries.length]; 
        int i=0;

        for(int num : queries){
            long half = (intLength+1)/2; // (3+1)/2 --> 4/2 --> 2
            long start = (long)Math.pow(10,half-1); // 10^2-1 --> 10^1 --> 10
            long end = (long)Math.pow(10,half)-1; // (10^2)-1 --> 100-1 --> 99

            if(num <= (end-start+1)){ // 99-10+1 --> 90
                String firsthalf = ((start) + (num-1))+""; 
                // "10","11","12","13","14","15","99"
                String secondhalf = (new StringBuffer(firsthalf)).reverse().toString();
                // "01","11","21","31","41","51","99"
                result[i++] = Long.parseLong(firsthalf+secondhalf.substring(intLength%2));
                //"101","111","121","131","141","151","999"
            }
            else{
                result[i++] = -1;
            }
        }
        return result;
    }
}