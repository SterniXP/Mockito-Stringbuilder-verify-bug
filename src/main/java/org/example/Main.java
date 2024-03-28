package org.example;

public class Main {
    public static void main(String[] args) {
        /*unimportant*/
    }

    static void test(Spyable spyable) {
        spyable.testMe(new StringBuilder().append("420"));
    }
}