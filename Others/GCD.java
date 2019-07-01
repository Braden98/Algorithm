package Algorithm.Others;

/**
 * @Description 欧几里得法求最大公约数
 * @Author ubique
 * @Date 2019/7/1 9:32 PM
 */

public class GCD {
    public static int gcd(int m, int n) {
        return n == 0 ? m : gcd(n, m % n);
    }
}
