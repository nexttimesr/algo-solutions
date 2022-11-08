import java.util.*;

public class ExpandingNebula {
    static int[][][] t = new int[][][]{{{0, 1}, {0, 0}}, {{1, 0}, {0, 0}}, {{0, 0}, {1, 0}}, {{0, 0}, {0, 1}}};
    static int[][][] f = new int[][][]{{{1, 1}, {1, 1}}, {{1, 0}, {1, 1}}, {{0, 1}, {1, 1}}, {{1, 1}, {0, 1}},
            {{1, 1}, {1, 0}}, {{0, 0}, {0, 0}}, {{1, 1}, {0, 0}}, {{0, 0}, {1, 1}}, {{1, 0}, {1, 0}}, {{0, 1}, {0, 1}},
            {{1, 0}, {0, 1}}, {{0, 1}, {1, 0}}};
    static int[][] trightf = new int[][]{{3, 6, 10}, {5, 9}, {5, 9}, {2, 7, 11}};
    static int[][] frightt = new int[][]{{}, {2}, {}, {}, {1}, {0, 3}, {1}, {2}, {0, 3}, {}, {2}, {1}};
    static int[][] trightt = new int[][]{{1}, {0, 3}, {0, 3}, {2}};
    static int[][] frightf = new int[][]{{0, 1, 4, 8}, {2, 7, 11}, {0, 1, 4, 8}, {0, 1, 4, 8}, {3, 6, 10}, {5, 9}, {3, 6, 10},
            {2, 7, 11}, {5, 9}, {0, 1, 4, 8}, {2, 7, 11}, {3, 6, 10}};

    static int[][] tleftf = new int[][]{{5, 8}, {4, 6, 11}, {1, 7, 10}, {5, 8}};
    static int[][] fleftt = new int[][]{{}, {}, {3}, {0}, {}, {1, 2}, {0}, {3}, {}, {1, 2}, {0}, {3}};
    static int[][] tleftt = new int[][]{{1, 2}, {0}, {3}, {1, 2}};
    static int[][] fleftf = new int[][]{{0, 2, 3, 9}, {0, 2, 3, 9}, {1, 7, 10}, {4, 6, 11}, {0, 2, 3, 9}, {5, 8}, {4, 6, 11},
            {1, 7, 10}, {0, 2, 3, 9}, {5, 8}, {4, 6, 11}, {1, 7, 10}};

    static int[][] tbotf = new int[][]{{5, 7}, {5, 7}, {1, 8, 10}, {2, 9, 11}};
    static int[][] fbott = new int[][]{{}, {}, {}, {0}, {1}, {2, 3}, {2, 3}, {}, {1}, {0}, {0}, {1}};
    static int[][] tbott = new int[][]{{2, 3}, {2, 3}, {1}, {0}};
    static int[][] fbotf = new int[][]{{0, 3, 4, 6}, {0, 3, 4, 6}, {0, 3, 4, 6}, {2, 9, 11}, {1, 8, 10}, {5, 7}, {5, 7},
            {0, 3, 4, 6}, {1, 8, 10}, {2, 9, 11}, {2, 9, 11}, {1, 8, 10}};

    static int[][] ttopf = new int[][]{{3, 9, 10}, {4, 8, 11}, {5, 6}, {5, 6}};
    static int[][] ftopt = new int[][]{{}, {2}, {3}, {}, {}, {0, 1}, {}, {0, 1}, {2}, {3}, {2}, {3}};
    static int[][] ttopt = new int[][]{{3}, {2}, {0, 1}, {0, 1}};
    static int[][] ftopf = new int[][]{{0, 1, 2, 7}, {4, 8, 11}, {3, 9, 10}, {0, 1, 2, 7}, {0, 1, 2, 7}, {5, 6}, {0, 1, 2, 7},
            {5, 6}, {4, 8, 11}, {3, 9, 10}, {4, 8, 11}, {3, 9, 10}};

    public static int solution(boolean[][] g) {
        // Your code here

        int ret = 0;
        int n = g[0][0] ? 4 : 12;
        HashSet<Integer>[][] sets = new HashSet[g.length][g[0].length];
        sets[0][0] = new HashSet<>();
        for (int z = 0; z < n; z++) {
            sets[0][0].add(z);
        }
        for (int i = 0; i < sets.length; i++) {
            for (int j = 0; j < sets[i].length; j++) {
                n = g[i][j] ? 4 : 12;
                sets[i][j] = new HashSet<>();
                for (int z = 0; z < n; z++) {
                    sets[i][j].add(z);
                }
            }
        }
        return calculate(sets, g);
    }

    public static int calculate(HashSet[][] sets, boolean[][] map) {
        //outer: columns middle: one column different combinations, inner: one combination
        ArrayList<ArrayList<Integer>> column1 = new ArrayList<>();
        int[] count1;
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> column2 = new ArrayList<>();
        int[] count2;
        ArrayList<Integer> l2 = new ArrayList<>();
        rec(map, column1, sets, 0, 0, -1, l1);
        count1 = new int[column1.size()];
        for (int i = 0; i < column1.size(); i++) {
            count1[i] = 1;
        }

        for (int j = 1; j < sets[0].length; j++) {
            column2 = new ArrayList<>();
            l2 = new ArrayList<>();
            rec(map, column2, sets, 0, j, -1, l2);
            count2 = new int[column2.size()];
            //calculate
            for (int x = 0; x < column1.size(); x++) {
                for (int y = 0; y < column2.size(); y++) {
                    if (compare(map, j, column1.get(x), column2.get(y))) {
                        count2[y] += count1[x];
                    }
                }
            }


            column1 = column2;
            l1 = l2;
            count1 = count2;
        }
        int sum = 0;
        for (int i: count1) {
            sum += i;
        }
        return sum;
    }

    public static void rec(boolean[][] map, ArrayList<ArrayList<Integer>> lists, HashSet<Integer>[][] sets, int i, int j, int cur, ArrayList<Integer> l) {
        if (i == map.length) {
            lists.add(l);
            return;
        }
        if (cur == -1) {
            for (int x: sets[i][j]) {
                ArrayList<Integer> newList = new ArrayList<>(l);
                newList.add(x);
                rec(map, lists, sets, i + 1, j, x, newList);
            }
        }
        else {
            int[][] bot;
            if (map[i][j] && map[i - 1][j]) {
                bot = tbott;
            }
            else if (map[i][j] && !map[i - 1][j]) {
                bot = fbott;
            }
            else if (!map[i][j] && map[i - 1][j]) {
                bot = tbotf;
            }
            else {
                bot = fbotf;
            }
            for (int next: bot[cur]) {
                if (sets[i][j].contains(next)) {
                    ArrayList<Integer> newList = new ArrayList<>(l);
                    newList.add(next);
                    rec(map, lists, sets, i + 1, j, next, newList);
                }
            }
        }
    }
//    public static int horizontalRec(boolean[][] map, ArrayList<ArrayList<Integer>>[] columns, int columnIndex, ArrayList<Integer> cur, HashSet<IJ>[] mem, int j) {
    public static int horizontalRec(boolean[][] map, ArrayList<ArrayList<Integer>>[] columns, int columnIndex, ArrayList<Integer> cur, int[][][] mem, int j) {
        if (columnIndex == columns.length) {
            return 1;
        }
        int sum = 0;
        ArrayList<ArrayList<Integer>> curlist = columns[columnIndex];
        if (columnIndex == 0) {
            for (int i = 0; i < curlist.size(); i++) {
                sum += horizontalRec(map, columns, columnIndex + 1, curlist.get(i), mem, i);
            }
        }
        else {
            for (int i = 0; i < curlist.size(); i++) {
                if (i == 0 || j == 0) {
                    if (compare(map, columnIndex, cur, curlist.get(i))) {
                        sum += horizontalRec(map, columns, columnIndex + 1, curlist.get(i), mem, i);
                    }
                }
//                else if (mem[columnIndex - 1].contains(new IJ(i, j))) {
                else if (mem[columnIndex - 1][i][j] == 1) {
                    sum += horizontalRec(map, columns, columnIndex + 1, curlist.get(i), mem, i);
                }
                else if (mem[columnIndex - 1][i][j] == 0) {
                    if (compare(map, columnIndex, cur, curlist.get(i))) {
                        mem[columnIndex - 1][i][j] = 1;
                        sum += horizontalRec(map, columns, columnIndex + 1, curlist.get(i), mem, i);
                    }
                    else {
                        mem[columnIndex - 1][i][j] = -1;
                    }
                }
//                else if (mem[columnIndex - 1].contains(new IJ(-i, -j))) {
//
//                }
//                else  {
//                    if (compare(map, columnIndex, cur, curlist.get(i))) {
//                        mem[columnIndex - 1].add(new IJ(i, j));
//                        sum += horizontalRec(map, columns, columnIndex + 1, curlist.get(i), mem, i);
//                    }
//                    else {
//                        mem[columnIndex - 1].add(new IJ(-i, -j));
//                    }
//                }
            }
        }
        return sum;
    }

    public static boolean compare(boolean[][] map, int indexRight, ArrayList<Integer> c1, ArrayList<Integer> c2) {
        for (int i = 0; i < c1.size(); i++) {
            int[][] bot;
            if (map[i][indexRight] && map[i][indexRight - 1]) {
                bot = trightt;
            }
            else if (map[i][indexRight] && !map[i][indexRight - 1]) {
                bot = frightt;
            }
            else if (!map[i][indexRight] && map[i][indexRight - 1]) {
                bot = trightf;
            }
            else {
                bot = frightf;
            }
            if (!contains(bot[c1.get(i)], c2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean contains(int[] arr, int i) {
        for (int a: arr) {
            if (a == i) {
                return true;
            }
        }
        return false;
    }
}
