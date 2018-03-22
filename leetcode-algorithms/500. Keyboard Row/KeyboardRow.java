import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyboardRow {
    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        String[] k = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        for (String word : words) {
            if (word.length() == 1) {
                list.add(word);
                continue;
            }
            boolean fited = true;
            String a = String.valueOf(word.charAt(0)).toLowerCase();
            int flag = k[0].contains(a) ? 0 : (k[1].contains(a) ? 1 : 2);
            for (int j = 1; j < word.length(); j++) {
                a = String.valueOf(word.charAt(j)).toLowerCase();
                switch (flag) {
                    case 0:
                        if (!k[0].contains(a)) {
                            fited = false;
                            break;
                        }
                        break;
                    case 1:
                        if (!k[1].contains(a)) {
                            fited = false;
                            break;
                        }
                        break;
                    case 2:
                        if (!k[2].contains(a)) {
                            fited = false;
                            break;
                        }
                        break;
                    default:
                        break;
                }
                if (!fited) break;
                if (j == word.length() - 1) {
                    list.add(word);
                }
            }
        }
        String[] array = new String[list.size()];
        String[] s = list.toArray(array);
        return s;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new KeyboardRow().findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})));
    }
}
