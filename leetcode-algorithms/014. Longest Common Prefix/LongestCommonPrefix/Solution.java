package LongestCommonPrefix;

/**
 * @author Jiacheng Huang
 * @date 2019/03/12 23:44
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        for (int j = 0; j < strs.length; j++) {
            String str = strs[j];
            if ("".equals(result) && j == 0) {
                result = str;
                continue;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < result.length() && i < str.length(); i++) {
                if (str.charAt(i) == result.charAt(i)) {
                    sb.append(str.charAt(i));
                } else {
                    break;
                }
            }
            if ("".equals(sb.toString()) && j > 0) {
                return "";
            }
            result = sb.toString();
        }
        return result;
    }
}
