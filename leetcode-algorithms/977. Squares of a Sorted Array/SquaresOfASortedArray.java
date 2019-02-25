/**
 * @author Jiacheng Huang
 * @date 2019/02/25 23:30
 */
public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];
        int i = 0, j = A.length - 1;
        for (int p = A.length - 1; p >= 0; p--) {
            if (Math.abs(A[i]) < Math.abs(A[j])) {
                result[p] = A[j] * A[j];
                j--;
            } else {
                result[p] = A[i] * A[i];
                i++;
            }
        }
        return result;
    }
}
