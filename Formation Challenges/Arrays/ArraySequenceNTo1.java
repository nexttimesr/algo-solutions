package Arrays;
import java.util.*;

public class ArraySequenceNTo1 {
    public static List<int[]> generateSequence(int x) {
        List<int[]> ret = new ArrayList<>();
        for (int i = x; i > 0; i--) {
            int[] cur = new int[i];
            for (int j = i; j > 0; j--) {
                cur[j - 1] = j;
            }
            ret.add(cur);
        }
        return ret;
    }
    public static void test() {
        printList(generateSequence(1));
        printList(generateSequence(0));
        printList(generateSequence(5));
        printList(generateSequence(6));
    }
    public static void printList(List<int[]> list) {
        for (int[] arr: list) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println();
    }
}
