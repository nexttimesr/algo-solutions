package Tree;

public class TrieTest {
    public static void test() {
        Trie trie = new Trie();
        trie.insert("apple");

        System.out.println(trie.search("apple"));

        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("app"));

        trie.insert("app");
        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("a"));
        System.out.println(trie.startsWith("ple"));
        System.out.println();
    }
}
