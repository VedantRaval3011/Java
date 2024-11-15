package lcmOfList;

import java.util.Arrays;
import java.util.List;

public class LcmOfList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList( 2, 3, 4, 5);

        int LCM = lcm(nums);
        System.out.println("Lcm is " + LCM);
    }

    public static int lcm(List<Integer> list) {
        return list.stream().reduce(1, (a, b) -> (a * b) / gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if (a == b)
            return a;

        if (a > b) {
            return gcd(a - b, b);
        } else {
            return gcd(a, b - a);
        }
    }

}
