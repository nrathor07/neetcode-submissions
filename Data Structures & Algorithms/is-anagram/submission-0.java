class Solution {
    public boolean isAnagram(String s, String t) {
    boolean isAnagram = false;
       if(s.equals(t)){
    isAnagram= true;
        }
        else if(s.length() != t.length()){
            isAnagram = false;
        }
        else{
            char[] sArray = s.toCharArray();
            char[] tArray = t.toCharArray();
            Arrays.sort(sArray);
            Arrays.sort(tArray);
            isAnagram = Arrays.equals(sArray, tArray);
        }
       return isAnagram;
    }
}
