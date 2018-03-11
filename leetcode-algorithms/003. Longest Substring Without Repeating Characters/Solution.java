class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = 0, maxLength = 0, p = 1, index = 0, len = s.length();
        String str = "";
        while (p <= len) {
            String character = String.valueOf(s.charAt(p - 1));
            if (str.contains(character)) {
                if (length > maxLength) maxLength = length;
                length = 0;
                index++;
                str = "";
                p = index;
                if(maxLength>(len-index))break;
                continue;
            }
            str = str + character;
            length++;
            p++;
        }
        return length > maxLength?length:maxLength;
    }
}