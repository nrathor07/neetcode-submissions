class Solution {
    public int[] twoSum(int[] nums, int target) {
      
        int[] arr = new int[2];
            HashMap<Integer, Integer> map = new HashMap<>();
            //int a[]= new int[arr.length()];
            int needed =0;
            for(int i=0;i<nums.length;i++)

            {
                needed = target-nums[i];
                if (map.containsKey(target - nums[i])) {
                  return new int[]{map.get(needed),i};
                }
                map.put(nums[i], i);
            }
    
    return arr;
    }
}
