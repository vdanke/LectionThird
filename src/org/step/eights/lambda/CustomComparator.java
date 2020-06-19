package org.step.eights.lambda;

import java.util.Comparator;

public class CustomComparator implements Comparator<String> {

    @Override
    public int compare(String first, String second) {
        return first.length() - second.length();
    }
}
