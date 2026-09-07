class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int ch : nums){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> map.get(a) - map.get(b)
        );

        for(int num : map.keySet()){
            pq.add(num);

            if(pq.size() > k){
                pq.poll();
            }
        }
        int[] res = new int[k];
        for(int i=k-1;i>=0;i--){
            res[i] = pq.poll(); 
        }
        return res;
    }
}