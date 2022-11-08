public class GearingUpForDestruction {
    public static int[] solution(int[] pegs) {
        // Your code here
        int sum = pegs[pegs.length - 1] - pegs[0];
        for (int i = 1; i < pegs.length - 2; i+=2) {
            sum -= 2 * (pegs[i + 1] - pegs[i]);
        }
        int cur = 0;
        if (pegs.length % 2 == 1) {
            sum -= (pegs[pegs.length - 1] - pegs[pegs.length - 2]) * 2;
            if (sum < 1) {
                return new int[]{-1, -1};
            }

            //test
            cur = sum * 2;
            for (int i = 1; i < pegs.length - 1; i++) {
                if ((pegs[i] - pegs[i - 1]) - cur  <= 0) {
                    return new int[]{-1, -1};
                }
                cur = (pegs[i] - pegs[i - 1]) - cur;
            }
            if (cur + sum != pegs[pegs.length - 1] - pegs[pegs.length - 2]) {
                return new int[]{-1, -1};
            }
            //test
            return new int[]{sum * 2, 1};
        }
        if (sum < 3) {
            return new int[]{-1, -1};
        }
        else {
            //test
            cur = sum * 2; // cur/3
            for (int i = 1; i < pegs.length; i++) {
                if ((pegs[i] - pegs[i - 1]) * 3 - cur < 3) {
                    return new int[]{-1, -1};
                }
                cur = (pegs[i] - pegs[i - 1]) * 3 - cur;
            }
            if (cur + sum != 3 * (pegs[pegs.length - 1] - pegs[pegs.length - 2])) {
                return new int[]{-1, -1};
            }
            //test
            if ((sum * 2) % 3 == 0) {
                return new int[]{sum * 2 / 3, 1};
            }
            return new int[] {sum * 2, 3};
        }
    }
}
