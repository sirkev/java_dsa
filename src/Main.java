import java.util.*;

public class Main {
    public static void main(String[] args) {
        //HashTable = A data structure that store unique keys to values eg: <Integer: String>
        //            -each pair is called an Entry.
        //            -fast insertion, lookup and deletion
        //            -ideal for large datasets, not ideal for small data sets

        //Hashing = takes a key and computes and integer( the hashing formula will vary based on key and data type
        //            -in a hashtable we use the hash % capacity to calculate an index number

        //              key.hasCode() % capacity = index

        //Bucket = this is an indexed storage location for one or more entries
        //          - a bucket can store more than one entry in the case of a collision (by use of a linked list)

        //Collision = this is when a hash function generates the same index for more than one key
        //            - less collisions = more efficiency

        //Runtime complexity: Best case = O(1)
        //                    Worst case =O(n)


        Hashtable<String, String> table = new Hashtable<>(10);
        table.put("100","SpongeBOB");
        table.put("123","Patrick");
        table.put("321","Sandy");
        table.put("555","Squidward");
        table.put("777","Gary");

       // table.remove(555);


        for (String key : table.keySet()){
            System.out.println(key.hashCode() % 21 +"\t" + key + "\t" + table.get(key));
        }




    }
}