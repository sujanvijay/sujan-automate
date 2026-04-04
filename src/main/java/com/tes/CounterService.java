package com.tes;

public class CounterService {
    private static int count = 0;

    public static int increment() {
        return ++count;
    }

    public static int getCount() {
        return count;
    }
}
