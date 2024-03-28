package org.example;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

class MainTest {

    @Test
    void testTheTest() {
        Spyable spy = spy(new Spyable());

        Main.test(spy);

        verify(spy).testMe(new StringBuilder().append("420"));
    }
}