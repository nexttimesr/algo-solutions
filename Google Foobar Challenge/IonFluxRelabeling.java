public class IonFluxRelabeling {
    public static int[] solution1(int h, int[] q) {
        // Your code here
        if (h == 1) {
            return new int[]{-1};
        }
        int[] ret = new int[q.length];
        int max = (int)Math.pow(2, h) - 1;
        // for (int i = 0; i < q.length; i++) {
        //     ret[i] = rec(max, 0, q[i], -1);
        // }
        for (int i = 0; i < q.length; i++) {
            if (q[i] == max) {
                ret[i] = -1;
            }
            else {
                ret[i] = rec1(h, 0, q[i], max);
            }
        }
        return ret;
    }
    public static int[] solution2(int h, int[] q) {
        // Your code here
        int[] ret = new int[q.length];
        int max = (int)Math.pow(2, h) - 1;
         for (int i = 0; i < q.length; i++) {
             ret[i] = rec2(max, 0, q[i], -1);
         }
        return ret;
    }
     public static int rec2(int max, int offset, int num, int prev) {
         if (num == max + offset) {
             return prev;
         }
         int next = (max - 1) / 2;
         if (num <= offset + next) {
             return rec2(next, offset, num, max + offset);
         }
         else {
             return rec2(next, next + offset, num, max + offset);
         }
     }
    public static int rec1(int h, int morecount, int num, int prev) {
        int count = 0;
        for (int i = 1; i <= h; i++) {
            count = count * 2 + 1;
            if (count + morecount == num) {
                return Math.min(morecount + count * 2 + 1, prev);
            }
            if (num < count + morecount) {
                return rec1(i - 1, (count - 1) / 2 + morecount, num, count + morecount);
            }
        }
        return -1;
    }

}
