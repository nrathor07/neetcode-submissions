class Solution {
     public boolean isPalindrome(String str) {
       // str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        //if (str == null || str.isBlank()) return false;
     int left = 0; int right =str.length()-1;
     while(left<right) {
         while (left<right && !alphNum(str.charAt(left))) {
             left++;
         }
         while(right>left && !alphNum(str.charAt(right))) {
             right--;
         }
         if (str.toLowerCase().charAt(left) != str.toLowerCase().charAt(right)) {
             return false;
         }
         left++;
         right--;
     }
        return true;
    }
     public boolean alphNum(char c) {
        return Character.isLetterOrDigit(c);
    }


}
