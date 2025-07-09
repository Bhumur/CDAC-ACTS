package ads;

public class Main {

	public static void main(String[] args) {

		HashTable ht = new HashTable();

        ht.put(1, "Apple");
        ht.put(11, "Banana");
        ht.put(21, "Cherry");

        System.out.println("Hash Table contents:");
        ht.printHashTable();

        System.out.println("\nSearch for key 11: " + ht.get(11));
        System.out.println("Removing key 11: " + ht.remove(11));
        System.out.println("Search for key 11 after removal: " + ht.get(11));

        System.out.println("\nHash Table after deletion:");
        ht.printHashTable();
    }

	}

