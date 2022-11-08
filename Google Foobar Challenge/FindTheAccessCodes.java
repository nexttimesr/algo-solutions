public class FindTheAccessCodes {
    public static int solution(int[] l) {
        int count = 0;
        for (int i = 0; i < l.length; i++) {
            for (int j = i + 1; j < l.length; j++) {
                if (l[j] % l[i] != 0) {
                    continue;
                }
                for (int k = j + 1; k < l.length; k++) {
                    if (l[k] % l[j] == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
