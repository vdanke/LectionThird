package org.step.seventh.set;

import java.util.*;

public class SetExample {

    public void example() {
        User first = new User(1, "first");
        User second = new User(2, "second");
        User third = new User(3, "first");
        User fourth = new User(2, "second");

        Set<User> singleton = Collections.singleton(null);
        Set<User> userSet = new HashSet<>();

        userSet.add(first);
        userSet.add(second);
        userSet.add(third);
        userSet.add(fourth);
        userSet.add(null);

        System.out.println(userSet.size());

        System.out.println(userSet.toString());

        userSet.removeAll(singleton);

        for (User u : userSet) {
            System.out.println(u.toString());
        }
    }

    public List<User> test(List<User> incomingList) {
        Set<User> users = new HashSet<>(incomingList);
        return new ArrayList<>(users);
    }
}
