package collection_api;
import java.util.*;

import com.sun.source.doctree.SeeTree;

import java.util.Set;

public class set {
    public static void main(String[] args) {
        //sets are used to store only unique elements
        //we cannot store duplicate elements in set
        //set is an interface so we cannot create object of set
        //we use hashset class to create object of set
        Set<Integer> num =new HashSet<>();
        num.add(12);
        num.add(13);
        num.add(14);
        num.add(12);//duplicate element will not be added
        System.out.println(num);
        //to print the element in the sorted order we use treeset class
        Set<Integer> num1 =new TreeSet<>();
        num1.add(23);
        num1.add(24);
        num1.add(183);
        num1.add(23);//duplicate element will not be added
        num1.add(56);
        System.out.println(num1);


    }
}
