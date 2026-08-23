class Solution {
    public int longestConsecutive(int[] nums) {
          HashSet<Integer> numSet = new HashSet();
        int longestStreak = 0;
        for (int num : nums) {
            numSet.add(num);
        }
        for (int n : numSet) {
            if (!numSet.contains(n - 1)) {
                int currentNum = 1;
                while (numSet.contains(n + currentNum)) {
                    currentNum++;
                }
                longestStreak = Math.max(longestStreak, currentNum);
            }
        }
        return longestStreak;
    }
}
