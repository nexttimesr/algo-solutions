package LiskedList;

public class LRUCacheTest {
    public static void test() {
        LRUCache test1 = new LRUCache();
        System.out.println(test1.get(0));
        test1.put(1, 10);
        test1.put(2, 20);
        test1.put(3, 30);
        System.out.println(test1.get(1));
        System.out.println(test1.get(2));
        test1.put(4, 40);
        System.out.println(test1.get(3));
        System.out.println(test1.get(4));
        System.out.println();
    }
}
