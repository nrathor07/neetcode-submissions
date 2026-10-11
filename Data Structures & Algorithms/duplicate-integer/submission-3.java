class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,String> map = new HashMap<>();
        for(int n: nums){
            if(map.containsKey(n)){
                return true;
            }
            map.put(n,"EXIST");
        }
      return false;  
    }
}