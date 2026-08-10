class MyHashMap {

    class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node[] buckets;
    private int size = 1000;

    public MyHashMap() {
        buckets = new Node[size];
    }

    private int hash(int key) {
        return key % size;
    }

    public void put(int key, int value) {

        int index = hash(key);

        Node current = buckets[index];

        // Empty bucket
        if (current == null) {
            buckets[index] = new Node(key, value);
            return;
        }

        // Search existing keys
        while (true) {

            if (current.key == key) {
                current.value = value;
                return;
            }

            if (current.next == null) {
                break;
            }

            current = current.next;
        }

        // Key doesn't exist
        current.next = new Node(key, value);
    }

    public int get(int key) {

        int index = hash(key);

        Node current = buckets[index];

        while (current != null) {

            if (current.key == key) {
                return current.value;
            }

            current = current.next;
        }

        return -1;
    }

    public void remove(int key) {

        int index = hash(key);

        Node current = buckets[index];
        Node previous = null;

        while (current != null) {

            if (current.key == key) {

                if (previous == null) {
                    buckets[index] = current.next;
                } else {
                    previous.next = current.next;
                }

                return;
            }

            previous = current;
            current = current.next;
        }
    }
}