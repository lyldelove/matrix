package com.lyldelove.matrix;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.File;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue( true );
    }

    private void test() throws NullPointerException {
        int i = 1 + 2;
        File file = new File("");
        file.delete();
    }

    private void test2() {
        test();
    }

    public static void main(String[] args) {

        new AppTest().test();


    }
}
