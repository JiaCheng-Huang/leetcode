public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        String result = "";
        String[] strs = s.split(" ");
        for (int i = 0; i < strs.length; i++) {
            result += new StringBuilder(strs[i]).reverse().toString();
            if (i < strs.length - 1) {
                result += " ";
            }
        }
        return result;
    }
}
