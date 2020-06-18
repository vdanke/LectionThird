package org.step.seventh;

import java.util.*;

public class CollectionExample {

    public void collectionExample() {
        List<String> stringList = new ArrayList<>();
        Set<String> stringSet = new HashSet<>();
        Map<Integer, String> map = new HashMap<>();

        List<String> strings = Collections.synchronizedList(stringList);
        Set<String> stringSet1 = Collections.synchronizedSet(stringSet);
        Map<Integer, String> map1 = Collections.synchronizedMap(map);
        Set<String> singleton = Collections.singleton("Singleton");
    }
}
