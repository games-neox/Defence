/**
 * Copyright (c) 2016 Games Neox. All rights reserved.
 *
 * This file is an original work developed by Games Neox
 */

package com.gamesneox.defence;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;



/**
 * @author Games Neox (games.neox@gmail.com)
 */
@SuppressWarnings("RedundantStringConstructorCall")
public class DefenceTest {

    private static final Class<? extends RuntimeException> DEFAULT_EXCEPTION_CLASS = IllegalStateException.class;
    private static final String DEFAULT_ERROR_MESSAGE = "default error message";
    private static final String DEFAULT_TEST_OBJECT = new String();

    /**
     * {@code null} {@code errorMessage} provided
     */
    @Test(expected = RuntimeException.class)
    public void testAssertNotNull0() {
        Defence.assertNotNull(DEFAULT_TEST_OBJECT, null);
    }

    /**
     * correct flow - exception thrown
     */
    @Test
    public void testAssertNotNull1() {
        try {
            Defence.assertNotNull(null, DEFAULT_ERROR_MESSAGE);
            fail();
        } catch (NullPointerException e) {
            assertEquals(DEFAULT_ERROR_MESSAGE, e.getMessage());
        } catch (Throwable throwable) {
            fail();
        }
    }

    /**
     * correct flow - exception not thrown
     */
    @Test
    public void testAssertNotNull2() {
        Defence.assertNotNull(DEFAULT_TEST_OBJECT, DEFAULT_ERROR_MESSAGE);
    }

    /**
     * {@code null} {@code exception} provided
     */
    @Test(expected = NullPointerException.class)
    public void testAssertCondition0() {
        Defence.assertCondition(true, null, DEFAULT_ERROR_MESSAGE);
    }

    /**
     * {@code null} {@code errorMessage} provided
     */
    @Test(expected = NullPointerException.class)
    public void testAssertCondition1() {
        Defence.assertCondition(true, DEFAULT_EXCEPTION_CLASS, null);
    }

    /**
     * correct flow - exception thrown
     */
    @Test
    public void testAssertCondition2() {
        try {
            Defence.assertCondition(false, IllegalStateException.class, DEFAULT_ERROR_MESSAGE);
            fail();
        } catch (IllegalStateException e) {
            assertEquals(DEFAULT_ERROR_MESSAGE, e.getMessage());
        } catch (Throwable throwable) {
            fail();
        }
    }

    /**
     * correct flow - exception not thrown
     */
    @Test
    public void testAssertCondition3() {
        Defence.assertCondition(true, DEFAULT_EXCEPTION_CLASS, DEFAULT_ERROR_MESSAGE);
    }
}
