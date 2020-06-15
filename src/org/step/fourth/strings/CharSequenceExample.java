package org.step.fourth.strings;

public class CharSequenceExample {

    public static void main(String[] args) {
        String test = args[0];
        int index = 2;

        if (test.length() > index) {
            char c = test.charAt(2);
            System.out.println(c);
        }
        CharSequence charSequence = test.subSequence(1, 3);
        String s = charSequence.toString();
        System.out.println(s);

        test.getChars(1, 3, "es".toCharArray(), 1);

        boolean isEmpty = test.isEmpty();

        boolean equals = test.equals(s);

        boolean b = test.equalsIgnoreCase(s);

        int i = test.compareTo(s);
        int i1 = test.compareToIgnoreCase(s);

        boolean b1 = test.contentEquals(charSequence);

        String intern = test.intern();
    }
}
