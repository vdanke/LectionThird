package org.step.fourth.bundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class BundleExample {

    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("locale", new Locale("kz", "KZ"));
        ResourceBundle custom = ResourceBundle.getBundle("something");

        boolean isContains = bundle.containsKey("hello");

        if (isContains) {
            System.out.println(bundle.getString("hello"));
            System.out.println(custom.getString("key"));
        }
    }
}
