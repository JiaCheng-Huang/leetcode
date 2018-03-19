public class JudgeRouteCircle {
    public boolean judgeCircle(String moves) {
        int[] arrs = new int[]{0, 0};
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'L':
                    arrs[0]--;
                    break;
                case 'U':
                    arrs[1]++;
                    break;
                case 'R':
                    arrs[0]++;
                    break;
                case 'D':
                    arrs[1]--;
                    break;
                default:
            }
        }
        return arrs[0] == 0 && arrs[1] == 0;
    }
}
