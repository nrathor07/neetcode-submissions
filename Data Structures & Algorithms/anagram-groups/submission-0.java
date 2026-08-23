class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         List<List<String>> result = new java.util.ArrayList<>();
            java.util.Map<String, List<String>> map = new java.util.HashMap<>();
            for(int i = 0; i < strs.length; i++) {
                char[] chars = strs[i].toCharArray();
                java.util.Arrays.sort(chars);
                String sortedStr = new String(chars);
                if (!map.containsKey(sortedStr)) {
                    map.put(sortedStr, new java.util.ArrayList<>());
                }
                map.get(sortedStr).add(strs[i]);
            }
            for(int i=0;i< map.size();i++) {
                result.add(map.get(map.keySet().toArray()[i]));
            }
return result;
    }
}
