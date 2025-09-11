package collection_api;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        //map is used to store data in key value pair
        //we cannot store duplicate keys in map but we can store duplicate values
        //map is an interface so we cannot create object of map
        Map<String,Integer> name = new HashMap<>();
        name.put("abhishek",23);
        name.put("rahul",24);
        System.out.println(name);
    }
}
