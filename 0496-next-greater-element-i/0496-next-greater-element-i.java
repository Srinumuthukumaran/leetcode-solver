class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();        
        for(int i=0;i<nums1.length;i++){
            int br=0;
            for(int j=0;j<nums2.length;j++){
                if(br!=0){
                    break;
                }
                int k=j+1;
                if(nums1[i] == nums2[j]){
                    while(k<=nums2.length){
                        if(k==nums2.length){
                            st.push(-1);
                            br++;
                            break;
                        }
                        if(nums2[k]>nums2[j]){
                            st.push(nums2[k]);
                            br++;
                            break;
                        }
                        k++;
                    }
                }
            }
        }
        int[] res = new int[nums1.length];
        for(int i=res.length - 1;i>=0;i--){
            if(!st.isEmpty()){

                res[i] = st.pop();
            }
        }
        return res;
    }
}