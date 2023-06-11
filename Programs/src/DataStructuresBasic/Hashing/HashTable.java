package DataStructuresBasic.Hashing;

public class HashTable {
    private final int TABLE_SIZE = 128;
    private HashNode[] table;

    public HashTable() {
        table = new HashNode[TABLE_SIZE];
    }

    private int hashFunction(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + (int) key.charAt(i)) % TABLE_SIZE;
        }
        return hash;
    }

    public void insert(String key, int value) {
        int hash = hashFunction(key);
        if (table[hash] == null) {
            table[hash] = new HashNode(key, value);
        } else {
            HashNode entry = table[hash];
            while (entry.next != null) {
                entry = entry.next;
            }
            entry.next = new HashNode(key, value);
        }
    }

    public int search(String key) {
        int hash = hashFunction(key);
        if (table[hash] != null) {
            HashNode entry = table[hash];
            while (entry != null) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
                entry = entry.next;
            }
        }
        return -1;
    }
}