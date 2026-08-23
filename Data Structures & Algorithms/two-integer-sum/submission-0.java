class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list=new ArrayList<>();
            for(int i=0; i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(i!=j && nums[i]+nums[j] == target){
                        list.add(i);
                        list.add(j);
                    }
                }
            }
            int[] output= list.stream().mapToInt(Integer::intValue).toArray();
            return output; 
    }
}
