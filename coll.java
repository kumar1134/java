package collection_api;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class coll {
    public static void main(String[] args) {
        //the collection is a interface that ois only used to store and manipulate the group of objects
        Collection num =new ArrayList();
        num.add(12);
        num.add(13);
        num.add(14);
        //we don't have any index in collection and we don't have any get method
        //we directly print the collection without for loop
        System.out.println(num);
        //to remove the element from collection
//        num.remove(13);
//        System.out.println(num);
//        //to check the size of collection
//        System.out.println(num.size());
//        //to check if the collection is empty or not
//        System.out.println(num.isEmpty());
        //we use the list interface to get the index and get method
        //mentioning the data type in list is called generics because when we only deal with integer we can mention the data type
        List<Integer> num1 =new ArrayList<>();
        num1.add(23);
        num1.add(24);
        System.out.println(num1.get(0));
        //we ste the index and add element at that index but within the elements present in the list
        num1.set(1,25);
        System.out.println(num1);
    }
}
