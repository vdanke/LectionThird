package org.step.first;

import org.step.first.model.Comment;
import org.step.first.model.User;

import java.math.BigDecimal;
import java.math.BigInteger;

import static java.lang.Math.*;

public class BigNumbers {

    public static void main(String[] args) {
        BigInteger bigInteger = BigInteger.valueOf(1_000_000_000_000L);
        BigDecimal bigDecimal = new BigDecimal(1.1);

        Integer i = 77;
        Integer in = new Integer(77);

        Long l = 77L;
        int i1 = l.intValue();

        double pow = pow(2, 2);

        String str = "abc";

        switch (str) {
            case "abc":
                System.out.println(str);
                break;
            default:
                System.out.println("Not case fitted");
                break;
        }

        User user = new User();
        Comment comment = new Comment();

        boolean b = user instanceof Object;

        boolean form = isForm(comment);

        System.out.println(form);
    }

    private static boolean isForm(Object obj) {
        return obj.getClass().isAssignableFrom(Comment.class);
    }

    static {

    }
}
