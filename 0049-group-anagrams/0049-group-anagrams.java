class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>>freq=new HashMap<>();
       for(String str:strs){
        char[]arr=str.toCharArray();
        Arrays.sort(arr);
        String key=new String(arr);
        if(!freq.containsKey(key)){
            freq.put(key,new ArrayList<>());
        }
        freq.get(key).add(str);
       } return new ArrayList<>(freq.values());
    }
}