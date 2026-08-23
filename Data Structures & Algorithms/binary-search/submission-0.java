class Solution {
    public int search(int[] nums, int target) {
      int m=0;
        int l=0; int r= nums.length-1;
        while(l<=r){
            m= l+(r-l)/2; // Calculate mid index
            if(nums[m] == target) {
                return m; // Target found, return index
            } else if(nums[m] < target) {
                l = m + 1; // Move left pointer to the right of mid
            } else {
                r = m - 1; // Move right pointer to the left of mid
            }
        }
        return -1; // Target not found, return -1
        
    }
}
