package LiskedList;
import java.util.*;

public class LRUCache {
    public ListNode head;
    public ListNode tail;
    public int capacity;
    public int count;
    public Map<Integer, ListNode> map;

    public LRUCache() {
        this.capacity = 3;
        this.map = new HashMap<>();
        this.head = null;
    }

    public int get(int key) {
        if (this.map.containsKey(key)) {
            ListNode cur = map.get(key);
            if (cur != this.head) {
                if (this.tail == cur) {
                    this.tail = cur.prev;
                }
                cur.prev.next = cur.next;
                cur.next = this.head;
                this.head.prev = cur;
                cur.prev = null;
                this.head = cur;

            }
        }
        return this.map.containsKey(key) ? this.map.get(key).value : -1;
    }

    public void put(int key, int value) {
        ListNode cur = new ListNode(value);
        cur.key = key;
        this.map.put(key, cur);
        if (count == capacity) {
            this.map.remove(this.tail.key);
            this.tail = this.tail.prev;
            this.tail.next = null;
            cur.next = head;
            this.head.prev = cur;
            this.head = cur;
        }
        else {
            this.count++;
            if (this.head == null) {
                this.head = cur;
                this.tail = cur;
            }
            else {
                cur.next = this.head;
                this.head.prev = cur;
                this.head = cur;
            }
        }
    }
}
