class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();

        int m = s.length();
        int n = p.length();

        int[] pcount = new int[26];
        for(char c : p.toCharArray()){
            pcount[c - 'a']++;
        }

        for(int i=0;i<=m - n;i++){
            int[] scount = new int[26];

            for(int j=i;j<i+n;j++){
                scount[s.charAt(j) - 'a']++;
            }
            if(Arrays.equals(pcount,scount)){
                res.add(i);
            }
        }
        return res;
    }
}