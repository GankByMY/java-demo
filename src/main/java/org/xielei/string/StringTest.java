package org.xielei.string;

public class StringTest {

    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        String d = new String("abc");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(c == d);
        System.out.println(a.hashCode());
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());

    }
}
