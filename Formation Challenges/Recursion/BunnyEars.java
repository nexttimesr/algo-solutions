package Recursion;

public class BunnyEars {
    public static int bunnyEars(int bunnies) {
        if (bunnies == 1) {
            return 2;
        }
        if (bunnies == 0) {
            return 0;
        }
        return bunnyEars(bunnies / 2) + bunnyEars(bunnies - bunnies / 2);
    }

    public static void test() {
        System.out.println(bunnyEars(6));
        System.out.println(bunnyEars(5));
        System.out.println(bunnyEars(0));
        System.out.println(bunnyEars(1));
        System.out.println();
    }
}
