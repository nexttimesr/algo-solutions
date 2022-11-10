package Arrays;

import java.util.*;
public class ArraySequence1ToN {
    public static List<int[]> generateSequence(int x) {
        List<int[]> ret = new ArrayList<>();
        for (int i = 1; i <= x; i++) {
            int[] cur = new int[i];
            for(int j = 0; j < i; j++) {
                cur[j] = j + 1;
            }
            ret.add(cur);
        }
        return ret;
    }
    public static void test() {
        List<int[]> test1 = generateSequence(5);
        List<int[]> test2 = generateSequence(0);
        List<int[]> test3 = generateSequence(1);
        List<int[]> test4 = generateSequence(10);
        printList(test1);
        printList(test2);
        printList(test3);
        printList(test4);
    }

    public static void printList(List<int[]> list) {
        for (int[] arr: list) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println();
    }
}
