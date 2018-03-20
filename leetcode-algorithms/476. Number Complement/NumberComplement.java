public class NumberComplement {
    public int findComplement(int num) {
        return num ^ (Integer.highestOneBit(num) << 1) - 1;
    }
}
