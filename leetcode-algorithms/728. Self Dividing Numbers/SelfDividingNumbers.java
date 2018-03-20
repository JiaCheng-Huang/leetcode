import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        while (left <= right) {
            int p, i = left;
            while (true) {
                p = i % 10;
                if (p == 0 || left % p != 0) {
                    break;
                }
                i /= 10;
                if (i == 0) {
                    result.add(left);
                    break;
                }
            }
            left++;
        }
        return result;
    }
}
