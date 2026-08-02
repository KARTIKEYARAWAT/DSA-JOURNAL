class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>freq=new HashMap<>();
        for(int i:nums){
            freq.put(i, freq.getOrDefault(i,0)+1);

        }
        PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->freq.get(a)-freq.get(b));
        for(int j:freq.keySet()){
            q.add(j);
            if(q.size()>k){
                q.poll();
            }
        }int[]result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=q.poll();
        }
        return result;
        
    }
}