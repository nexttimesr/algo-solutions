public class PrepareTheBunniesEscape {
    public static class Cell {
        boolean remove;
        int count;

        public Cell(boolean remove, int count) {
            this.remove = remove;
            this.count = count;
        }
    }
    static Cell[][] cells;
    public static int solution(int[][] map) {
        // Your code here
        cells = new Cell[map.length][];
        for (int i = 0; i < map.length; i++) {
            cells[i] = new Cell[map[i].length];
        }
        return rec(map, 0, 0, 1, true);
    }
    public static int rec(int[][] map, int i, int j, int count, boolean remove) {
        if (i < 0 || j < 0 || i >= map.length || j >= map[i].length || map[i][j] == -1 || (!remove && map[i][j] == 1)) {
            return -1;
        }
        if (i == map.length - 1 && j == map[i].length - 1) {
            return count;
        }
        if (cells[i][j] != null && cells[i][j].count <= count && (cells[i][j].remove == remove || cells[i][j].remove == true)) {
            return -1;
        }
        cells[i][j] = new Cell(remove, count);
        boolean r = remove;
        int original = map[i][j];
        if (original == 1) {
            r = false;
        }
        map[i][j] = -1;
        int[] next = new int[]{rec(map, i - 1, j, count + 1, r), rec(map, i + 1, j, count + 1, r), rec(map, i, j - 1, count + 1, r), rec(map, i, j + 1, count + 1, r)};
        map[i][j] = original;
        int low = -1;
        for (int x = 0; x < 4; x++) {
            if (next[x] != -1) {
                if (low == -1) {
                    low = next[x];
                }
                else {
                    low = Math.min(low, next[x]);
                }
            }
        }
        return low == -1 ? -1 : low;
    }
}
