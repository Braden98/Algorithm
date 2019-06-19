package Algorithm.Bit;

/**
 * @Description 查询某数二进制表示中1的个数，最基本的一个个查、查找最右边1的个数以及某些奇技淫巧常熟时间的
 * @Author ubique
 * @Date 2019/6/19 10:14 PM
 */

public class Count1 {
    public static int count1(int n) {
        int res = 0;
        while (n != 0) {
            res += n & 1;
            n >>>= 1;
        }
        return res;
    }

    public static int count2(int n) {
        int res = 0;
        while (n != 0) {
            n &= (n - 1);
            res++;
        }
        return res;
    }

    public static int count3(int n) {
        int res = 0;
        while (n != 0) {
            n -= n & (~n + 1);
            res++;
        }
        return res;
    }

    public static int count4(int n) {
        n = (n & 0x55555555) + ((n >>> 1) & 0x55555555);
        n = (n & 0x33333333) + ((n >>> 2) & 0x33333333);
        n = (n & 0x0f0f0f0f) + ((n >>> 4) & 0x0f0f0f0f);
        n = (n & 0x00ff00ff) + ((n >>> 8) & 0x00ff00ff);
        n = (n & 0x0000ffff) + ((n >>> 16) & 0x0000ffff);
        return n;
    }

}
