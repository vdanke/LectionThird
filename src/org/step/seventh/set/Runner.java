package org.step.seventh.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        User first = new User(1, "first");
        User second = new User(2, "second");
        User third = new User(3, "first");
        User fourth = new User(2, "second");
        User a = new User(1, "first");
        User b = new User(2, "second");
        User c = new User(3, "first");
        User fourh = new User(2, "second");
        User firt = new User(1, "first");
        User seond = new User(2, "second");
        User tird = new User(3, "first");
        User ourth = new User(2, "second");
        List<User> users = new ArrayList<>(Arrays.asList(new User(1, "first"),
        new User(2, "second"),
        new User(3, "first"),
        new User(2, "second"),
        new User(1, "first"),
        new User(2, "second"),
        new User(3, "first"),
        new User(2, "second"),
        new User(1, "first"),
        new User(2, "second"),
        new User(3, "first"),
        new User(2, "second")));

        SetExample setExample = new SetExample();

        setExample.example();

        List<User> userList = setExample.test(users);

        for (User u : userList) {
            System.out.println(u);
        }
    }
}
