class Solution {

public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for (String str : strs) {
            encodedString.append(str.length()).append("#").append(str);
        }
        return encodedString.toString();

    }

    public List<String> decode(String str) {
        List<String > decodedList = new java.util.ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            // Find the length of the next string
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            // Move past the '#' character
            j++;
            // Extract the string of the specified length
            String decodedString = str.substring(j, j + length);
            decodedList.add(decodedString);
            // Move to the next encoded string
            i = j + length;
        }
        return decodedList;

    }
}
