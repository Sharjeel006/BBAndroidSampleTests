package com.buddybuild.bbandroidsampletests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ArithmeticUnitTest {

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void subtraction_isCorrect() throws Exception {
        assertEquals(2, 4 - 2);
    }

    @Test
    public void multiplication_isCorrect() throws Exception {
        assertEquals(2, 1 * 2);
    }

    @Test
    public void division_isCorrect() throws Exception {
        assertEquals(2, 4 / 2);
    }

}
