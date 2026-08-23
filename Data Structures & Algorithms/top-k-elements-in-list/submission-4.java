class Solution {
    public int[] topKFrequent(int[] nums, int k) {
               int[] j= new int[k];
        HashMap<String, Integer> map=new HashMap<>();
         if(nums.length == 1 || k < 1) {
            return nums; // Return empty array if input is invalid
        }
        Arrays.sort(nums);
        for (int num : nums) {
            String kt = String.valueOf(num);
            if(!map.containsKey(kt)){
                map.put(kt, 1);
            }
            // Increment the count for the key
            else {
                map.put(kt, map.get(kt) + 1);
            }
            map.entrySet().stream().forEach((entry) -> {;
          //      System.out.println(entry.getKey() + " : " + entry.getValue());
            });
           // map.put(key, map.getOrDefault(key, 0) + 1);
        }
         return map.entrySet().stream()
                .sorted((a,b)-> b.getValue().compareTo(a.getValue())) // Sort by frequency in descending order
                .limit(k) // Limit to top k elements
                .map(entry -> Integer.parseInt(entry.getKey())) // Convert keys back to integers
                .mapToInt(Integer::intValue) // Convert Stream<Integer> to int[]
                .toArray(); // Collect to array
    }
}
