import java.util.Arrays;

public class Test {
    public static void expandingNebulaTest() {
        boolean[][] test1 = {{true, true, false, true, false, true, false, true, true, false}, {true, true, false, false, false, false, true, true, true, false}, {true, true, false, false, false, false, false, false, false, true}, {false, true, false, false, false, false, true, true, false, false}};
        boolean[][] test2 = new boolean[][]{{true, false, true}, {false, true, false}, {true, false, true}};
        System.out.println(ExpandingNebula.solution(test1));
        System.out.println(ExpandingNebula.solution(test2));
        System.out.println();
    }

    public static void freeTheBunnyWorkersTest() {
        print2dArray(FreeTheBunnyWorkers.solution(4, 4));
        print2dArray(FreeTheBunnyWorkers.solution(2, 1));
        print2dArray(FreeTheBunnyWorkers.solution(5, 3));
    }

    public static void findTheAccessCodesTest() {
        int[] test1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] test2 = new int[]{1, 1, 1};
        System.out.println(FindTheAccessCodes.solution(test1));
        System.out.println(FindTheAccessCodes.solution(test2));
        System.out.println();
    }

    public static void prepareTheBunniesEscapeTest() {
        int[][] test1 = new int[][]{{0, 1, 1, 0}, {0, 0, 0, 1}, {1, 1, 0, 0}, {1, 1, 1, 0}};
        int[][] test2 = new int[][]{{0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 0}, {0, 0, 0, 0, 0, 0}, {0, 1, 1, 1, 1, 1}, {0, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0}};
        System.out.println(PrepareTheBunniesEscape.solution(test1));
        System.out.println(PrepareTheBunniesEscape.solution(test2));
        System.out.println();
    }
    public static void fuelInjectionPerfectionTest() {
        String test1 = "15";
        String test2 = "4";
        System.out.println(FuelInjectionPerfection.solution(test1));
        System.out.println(FuelInjectionPerfection.solution(test2));
        System.out.println();
    }
    public static void bringAGunToAGuardFightTest() {
        int[] dimensions1 = new int[]{3, 2};
        int[] your_position1 = new int[]{1, 1};
        int[] guard_position1 = new int[]{2, 1};
        int distance1 = 4;

        int[] dimensions2 = new int[]{300, 275};
        int[] your_position2 = new int[]{150, 150};
        int[] guard_position2 = new int[]{185, 100};
        int distance2 = 500;
        System.out.println(BringAGunToAGuardFight.solution(dimensions1, your_position1, guard_position1, distance1));
        System.out.println(BringAGunToAGuardFight.solution(dimensions2, your_position2, guard_position2, distance2));
        System.out.println();
    }
    public static void ionFluxRelabelingTest() {
        int i1 = 3;
        int[] test1 = new int[]{7, 3, 5, 1};
        int i2 = 5;
        int[] test2 = new int[]{19, 14, 28};
        System.out.println(Arrays.toString(IonFluxRelabeling.solution1(i1, test1)));
        System.out.println(Arrays.toString(IonFluxRelabeling.solution2(i1, test1)));
        System.out.println(Arrays.toString(IonFluxRelabeling.solution1(i2, test2)));
        System.out.println(Arrays.toString(IonFluxRelabeling.solution2(i2, test2)));
        System.out.println();
    }

    public static void gearingUpForDestructionTest() {
        int[] test1 = new int[]{4, 30, 50};
        int[] test2 = new int[]{4, 17, 50};
        System.out.println(Arrays.toString(GearingUpForDestruction.solution(test1)));
        System.out.println(Arrays.toString(GearingUpForDestruction.solution(test2)));
        System.out.println();
    }
    public static void print2dArray(int[][] arr) {
        for (int[] a: arr) {
            for (int i: a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        expandingNebulaTest(); // 11567, 4
        freeTheBunnyWorkersTest();
        findTheAccessCodesTest(); // 3, 1
        prepareTheBunniesEscapeTest(); // 7, 11
        fuelInjectionPerfectionTest(); // 5, 2
        bringAGunToAGuardFightTest(); // 7, 9
        ionFluxRelabelingTest(); // [-1, 7, 6, 3], [21, 15, 19]
        gearingUpForDestructionTest(); // [12, 1], [-1, -1]
    }
}
