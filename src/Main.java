import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       // ArrayList<String> arrayList = new ArrayList<>();
        DynamicArray dynamicArray = new DynamicArray(1);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
      dynamicArray.insert(0,"1");
      dynamicArray.insert(2,"2");
      dynamicArray.insert(4,"3");
      dynamicArray.delete("1");
      dynamicArray.delete("2");
      dynamicArray.delete("3");
      dynamicArray.delete("A");
      dynamicArray.delete("B");

        System.out.println(dynamicArray);
        System.out.println("search element index:"+ dynamicArray.searchIndexOf("B"));
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);
        System.out.println("empty: " + dynamicArray.isEmpty());



    }
}