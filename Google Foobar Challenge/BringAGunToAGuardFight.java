import java.util.*;

public class BringAGunToAGuardFight {
    static int[] d;
    static int[] your;
    static int[] trainer;
    static int dsq;
    public static int solution(int[] dimensions, int[] your_position, int[] trainer_position, int distance) {
        //Your code here
        d = dimensions;
        your = your_position;
        trainer = trainer_position;
        dsq = distance * distance;
        int count = 0;
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        int xlim = (your[0] + distance + d[0] - 1) / d[0];
        int ylim = (your[1] + distance + d[1] - 1) / d[1];
        for (int i = -xlim; i <= xlim; i++) {
            for (int j = -ylim; j <= ylim; j++) {
                int x = Math.abs(i) * d[0];
                if (i < 0) {
                    x += your[0];
                    x -= i % 2 == 0 ? trainer[0] : d[0] - trainer[0];
                    x *= -1;
                }
                else {
                    x += d[0] - your[0];
                    x -= i % 2 == 0 ? d[0] - trainer[0] : trainer[0];
                }
                int y = Math.abs(j) * d[1];
                if (j < 0) {
                    y += your[1];
                    y -= j % 2 == 0 ? trainer[1] : d[1] - trainer[1];
                    y *= -1;
                }
                else {
                    y += d[1] - your[1];
                    y -= j % 2 == 0 ? d[1] - trainer[1] : trainer[1];
                }
                int gcd = Math.abs(gcd(x, y));
                x = x / gcd;
                y = y / gcd;
                if (canhit(x, y)) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(x);
                    list.add(y);
                    if (set.contains(list)) {
                        continue;
                    }
                    set.add(list);
                    count++;
                }
            }
        }
        return count;
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static boolean canhit(int x, int y) {
        int xpos = your[0];
        int ypos = your[1];
        int curx = x;
        int cury = y;
        int count = 0;
        while (count * count * (x * x + y * y) <= dsq) {
            while (xpos + curx > d[0] || xpos + curx < 0) {
                if (xpos + curx > d[0]) {
                    curx = curx - (d[0] - xpos);
                    curx = -1 * curx;
                    xpos = d[0];
                }
                else {
                    curx = curx - (0 - xpos);
                    curx = -1 * curx;
                    xpos = 0;
                }
            }
            // HITS CORNER
            xpos += curx;
            int diff = Math.abs(x) - Math.abs(curx);
            if (curx > 0) {
                curx += diff;
            }
            else {
                curx -= diff;
            }
            while (ypos + cury > d[1] || ypos + cury < 0) {
                if (ypos + cury > d[1]) {
                    cury = cury - (d[1] - ypos);
                    cury = -1 * cury;
                    ypos = d[1];
                }
                else {
                    cury = cury - (0 - ypos);
                    cury = -1 * cury;
                    ypos = 0;
                }
            }
            ypos += cury;
            count++;
            diff = Math.abs(y) - Math.abs(cury);
            if (cury > 0) {
                cury += diff;
            }
            else {
                cury -= diff;
            }

            if (count * count * (x * x + y * y) > dsq) {
                return false;
            }
            if (xpos == your[0] && ypos == your[1]) {
                return false;
            }
            if (xpos == trainer[0] && ypos == trainer[1]) {
                return true;
            }
        }
        return false;
    }

}
