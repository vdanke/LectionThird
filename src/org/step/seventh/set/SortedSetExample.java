package org.step.seventh.set;

import java.util.Arrays;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

    public void test() {
        Comparator<User> comparator = new Comparator<User>() {
            @Override
            public int compare(User first, User second) {
                return first.getId() - second.getId();
            }
        };
        SortedSet<User> sortedSet = new TreeSet<>(comparator);

        User third = new User(3, "first");
        User first = new User(1, "first");
        User second = new User(2, "second");
        User fourth = new User(2, "second");

        sortedSet.addAll(Arrays.asList(third, first, second, fourth));

        User first1 = sortedSet.first();

        System.out.println(first1.toString());

        User last = sortedSet.last();

        System.out.println(last.toString());

        SortedSet<User> sortedSet2 = sortedSet.headSet(second);
        SortedSet<User> sortedSet3 = sortedSet.tailSet(second);

        SortedSet<User> sortedSet1 = sortedSet.subSet(second, third);

        System.out.println(sortedSet1.toString());

        for (User u : sortedSet) {
            System.out.println(u.toString());
        }
    }

    public static void main(String[] args) {
        SortedSetExample sortedSetExample = new SortedSetExample();

        sortedSetExample.test();
    }
}
