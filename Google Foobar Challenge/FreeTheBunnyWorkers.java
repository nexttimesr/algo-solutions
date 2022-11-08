public class FreeTheBunnyWorkers {
    public static int[][] solution(int num_buns, int num_required) {
        // Your code here
        num_required = num_buns - num_required + 1;
        int totalNums = runChoose(num_buns, num_required);
        int n = totalNums * num_required / num_buns;
        int[][] ret = new int[num_buns][n];
        int[] indices = new int[num_buns];
        int[] combination = new int[num_required];
        for (int i = 0; i < num_required; i++) {
            combination[i] = i;
        }
        int count = 0;
        for (int i = 0; i < totalNums; i++) {
            for (int j = 0; j < combination.length; j++) {
                ret[combination[j]][indices[combination[j]]] = count;
                indices[combination[j]]++;
            }
            count++;
            int t = num_required - 1;
            while (t != 0 && combination[t] == num_buns - num_required + t) {
                t--;
            }
            combination[t]++;
            for (int x = t + 1; x < num_required; x++) {
                combination[x] = combination[x - 1] + 1;
            }
        }
        return ret;
    }

    public static int runChoose(int n, int k) {
        int[][] mem = new int[n + 1][k + 1];
        for (int i = 1; i < n + 1; i++) {
            mem[i][0] = 1;
            if (i <= k) {
                mem[i][i] = 1;
            }
        }
        return choose(n, k, mem);
    }
    public static int choose(int n, int k, int[][] mem){
        if (n < k)
            return 0;
        if (mem[n][k] != 0) {
            return mem[n][k];
        }
        return choose(n - 1, k - 1, mem) + choose(n - 1, k, mem);
    }
}
