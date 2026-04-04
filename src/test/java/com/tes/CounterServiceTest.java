package com.tes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CounterServiceTest {

    @Test
    void testIncrement() {
        int value = CounterService.increment();
        assertTrue(value > 0);
    }

    @Test
    void testGetCount() {
        CounterService.increment();
        assertTrue(CounterService.getCount() >= 1);
    }
}
