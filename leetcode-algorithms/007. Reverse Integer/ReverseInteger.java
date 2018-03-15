class ReverseInteger {
    public static int reverse(int x) {
        int result = 0;
        boolean flag = false;
        String str = x + "";
        if (x >= 0) {
            flag = true;
        } else {
            flag = false;
        }
        str = str.replace("-", "");
        if (isOverFlow(str)) {
            return 0;
        }
        StringBuffer sb = new StringBuffer("");
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            sb.append(String.valueOf(c));
        }
        result = Integer.valueOf(sb.toString());
        if (!flag) {
            result = -result;
        }
        return result;
    }

    private static boolean isOverFlow(String str) {
        if (str.length() != 10) {
            return false;
        }
        int a = Integer.valueOf(String.valueOf(str.charAt(9))), b = Integer.valueOf(String.valueOf(str.charAt(8))), c = Integer.valueOf(String.valueOf(str.charAt(7))), d = Integer.valueOf(String.valueOf(str.charAt(6))), e = Integer.valueOf(String.valueOf(str.charAt(5))), f = Integer.valueOf(String.valueOf(str.charAt(4))), g = Integer.valueOf(String.valueOf(str.charAt(3))), h = Integer.valueOf(String.valueOf(str.charAt(2))), i = Integer.valueOf(String.valueOf(str.charAt(1))), j = Integer.valueOf(String.valueOf(str.charAt(0)));
        if (a > 2) {
            return true;
        } else if (a < 2) {
            return false;
        }
        if (b > 1) {
            return true;
        } else if (b < 1) {
            return false;
        }
        if (c > 4) {
            return true;
        } else if (c < 4) {
            return false;
        }
        if (d > 7) {
            return true;
        } else if (d < 7) {
            return false;
        }
        if (e > 4) {
            return true;
        } else if (e < 4) {
            return false;
        }
        if (f > 8) {
            return true;
        } else if (f < 8) {
            return false;
        }
        if (g > 3) {
            return true;
        } else if (g < 3) {
            return false;
        }
        if (h > 6) {
            return true;
        } else if (h < 6) {
            return false;
        }
        if (i > 4) {
            return true;
        } else if (i < 4) {
            return false;
        }
        if (j > 7) {
            return true;
        } else if (j < 7) {
            return false;
        }
        return false;
    }
}