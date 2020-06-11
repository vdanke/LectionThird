package org.step.second.interfaces;

import org.step.second.interfaces.events.Alert;
import org.step.second.interfaces.events.Info;

import java.util.SortedSet;
import java.util.TreeSet;

public class Runner {

    public static void main(String[] args) {
        Announcer<Info> announcer = new InfoAnnouncer();

        boolean b = announcer instanceof Announcer;

        Info info = new Info();

        SortedSet<Info> infoSet = new TreeSet<>(info);

        SortedSet<Alert> alertSortedSet = new TreeSet<>();
    }
}
