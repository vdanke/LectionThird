package org.step.seventh;

import org.step.seventh.set.User;

import java.util.*;

public class CollectionExample<T extends User> {

    public void collectionExample() {
        List<String> stringList = new ArrayList<>();
        Set<String> stringSet = new HashSet<>();
        Map<Integer, String> map = new HashMap<>();

        List<String> strings = Collections.synchronizedList(stringList);
        Set<String> stringSet1 = Collections.synchronizedSet(stringSet);
        Map<Integer, String> map1 = Collections.synchronizedMap(map);
        Set<String> singleton = Collections.singleton("Singleton");
    }

    public void collectionsClassExample(List<T> list, List<T> copy) {
        Deque<Object> deque = new ArrayDeque<>();

        Collections.sort(list);

        int i = Collections.binarySearch(list, new User());

        Collections.reverse(list);

        Collections.shuffle(list);

        Collections.fill(Collections.singletonList(new Object()), new User());

        Collections.copy(list, copy);

        Collections.min(list);

        Collections.max(list);

        List<T> ts = Collections.synchronizedList(list);

        Set<String> list1 = Collections.singleton("List");

        List<Object> objectList = Collections.unmodifiableList(list);

        Queue<Object> objects = Collections.asLifoQueue(deque);
    }
}
