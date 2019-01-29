package base_7;

public class Solution {

    public String convertToBase7(int num) {
        final int base = 7;
        final StringBuilder sb = new StringBuilder();
        if (num < 0) {
            sb.append("-");
            num *= -1;
        }
        if (num < base) {
            sb.append(num);
            return sb.toString();
        }

        int calc = base;
        while (num >= calc * base)
            calc *= base;

        while (calc >= base) {
            sb.append(num / calc);
            num %= calc;
            calc /= base;
        }

        sb.append(num % base);
        return sb.toString();
    }
}
