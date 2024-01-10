import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //Hash maps implements the Map interface
        //they are similar to ArrayLists but with key-value pairs
        //they store objects that need to use Wrapper Class (-concept of taking primitive data type and converting into an object)
        //ex: (name,email), (username, userId), (country,capital)

        HashMap<String,String> countries = new HashMap<String, String>();

        //add a key and value
        countries.put("Kenya","Nairobi");
        countries.put("Egypt","Cairo");
        countries.put("India","New Delhi");
        countries.put("Russia","Moscow");

        //countries.replace("Kenya","Nakuru")
        // System.out.println(countries.containsValue("Nairobi"));

        for(String i : countries.keySet()){
            System.out.print(i + "\t" + "= ");
            System.out.println(countries.get(i));
        }




    }
}