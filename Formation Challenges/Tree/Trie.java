package Tree;
import java.util.*;

public class Trie {
    public class TrieNode {
        Map<Character, TrieNode> children;
        Set<Character> childrenSet;
        char val;
        boolean end = false;

        public TrieNode(char val) {
            this.val = val;
            this.children = new HashMap<>();
            this.childrenSet = new HashSet<>();
            this.end = false;
        }
    }
    TrieNode root;
    public Trie() {
        this.root = new TrieNode('0');
    }

    public void insert(String str) {
        TrieNode cur = root;
        for (int i = 0; i < str.length(); i++) {
            char curChar = str.charAt(i);
            if (!cur.childrenSet.contains(curChar)) {
                cur.childrenSet.add(curChar);
                cur.children.put(curChar, new TrieNode(curChar));
            }
            cur = cur.children.get(curChar);
        }
        cur.end = true;
    }

    public boolean search(String str) {
        TrieNode cur = this.root;
        for (int i = 0; i < str.length(); i++) {
            char curChar = str.charAt(i);
            if (!cur.childrenSet.contains(curChar)) {
                return false;
            }
            cur = cur.children.get(curChar);
        }
        return cur.end;
    }

    public boolean startsWith(String str) {
        TrieNode cur = this.root;
        for (int i = 0; i < str.length(); i++) {
            char curChar = str.charAt(i);
            if (!cur.childrenSet.contains(curChar)) {
                return false;
            }
            cur = cur.children.get(curChar);
        }
        return true;
    }
}

