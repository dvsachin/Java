package DataStructuresBasic.Hashing;

public class HashingFunctions {
    public static void main(String[] args) {
        HashTable ht = new HashTable();
        ht.insert("hello", 1);
        ht.insert("world", 2);
        System.out.println(ht.search("hello"));
        System.out.println(ht.search("world"));
    }
}
