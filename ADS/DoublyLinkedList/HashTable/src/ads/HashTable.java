package ads;

public class HashTable {

	private final int SIZE = 10;
    private LinkedList[] table;

    public HashTable() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++)
            table[i] = new LinkedList();
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, String value) {
        int index = hash(key);
        table[index].insert(key, value);
    }

    public String get(int key) {
        int index = hash(key);
        return table[index].search(key);
    }

    public boolean remove(int key) {
        int index = hash(key);
        return table[index].delete(key);
    }

    public void printHashTable() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Bucket " + i + ": ");
            table[i].printList();
        }
    }
}

