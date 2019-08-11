import java.util.Arrays;
import java.util.Scanner;
 
public class dota2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] cold = new int[3];
        while (in.hasNextInt()) {// 注意while处理多个case
            int blood = in.nextInt();
            int creeps = in.nextInt();
            int attack1 = in.nextInt();
            int attack3 = in.nextInt();
            int attack2 = in.nextInt();
            int cold1 = in.nextInt();
            int cold2 = in.nextInt();
            int cold3 = in.nextInt();
 
            Arrays.fill(cold, 0);
            attack1 *= creeps;
 
            while (blood > 0) {
                 //System.out.printf("%d %d %d %d\n", blood, cold[0], cold[1], cold[2]);
                if (cold[0] == 0) {
                    blood -= attack1;
                    if (blood <= 0) {
                        System.out.println("NO");
                        break;
                    }
                    cold[0] = cold1;
                }
                if (cold[1] == 0) {
                    blood -= attack2;
                    if (blood <= 0) {
                        System.out.println("YES");
                        break;
                    }
                    cold[1] = cold2;
                }
                if (cold[2] == 0) {
                    blood -= attack3;
                    if (blood <= 0) {
                        System.out.println("YES");
                        break;
                    }
                    cold[2] = cold3;
                }
                int min = Arrays.stream(cold).min().getAsInt();
                for (int i=0;i<3;i++) {
                    cold[i] -= min;
                }
            }
        }
        in.close();
 
        return;
    }

}
