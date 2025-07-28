package Collections;

import java.util.*;
import java.util.LinkedList;

public class ListExample {
    public static void main(String[] args) {
        List<String> fruits = new LinkedList();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

