class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap hashMap = new HashMap();
        boolean check=false;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            if (!hashMap.containsKey(nums[i])) {

                hashMap.put(nums[i], count+1);
                check= false;
            }
            else{
                check = true;
                break;
            } 
    }
    return check;
    }
}