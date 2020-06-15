package org.step.fourth.pattern.matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherExample {

    public static void main(String[] args) {
        Pattern compile = Pattern.compile("\\d+");

        boolean matches = Pattern.matches("\\d+", "12345");

        Matcher matcher = compile.matcher("12345");

        System.out.println(matches);
    }
}
