/**
 * Copyright (c) 2015-2016 Games Neox. All rights reserved.
 *
 * This file is an original work developed by Games Neox
 */

package com.gamesneox.defence;

import java.lang.reflect.InvocationTargetException;



/**
 * This API can be called from any thread.
 *
 * @author Games Neox (games.neox@gmail.com)
 */
public final class Defence {

    /**
     * @param errorMessage {@code String} to be passed to the raised {@code Exception} if the test condition fails
     *
     * @throws NullPointerException if {@code testObject} is {@code null}
     * @throws RuntimeException if {@code errorMessage} is {@code null}
     */
    @SuppressWarnings("DuplicateThrows")
    public static <T> void assertNotNull(T testObject, String errorMessage)
            throws NullPointerException, RuntimeException {
        if (null == errorMessage) {
            throw new RuntimeException("errorMessage!");
        }

        if (null == testObject) {
            throw new NullPointerException(errorMessage);
        }
    }

    /**
     * @param errorMessage {@code String} to be passed to the raised {@code RuntimeException} if the test condition fails
     *
     * @throws E if {@code testCondition} is {@code false}
     * @throws NullPointerException if {@code exception} or {@code errorMessage} is {@code null}
     * @throws RuntimeException if any problem occurs while constructing an instance of the {@code exception} class
     */
    @SuppressWarnings({ "DuplicateThrows", "TryWithIdenticalCatches" })
    public static <E extends RuntimeException> void assertCondition(boolean testCondition, Class<E> exception,
            String errorMessage) throws E, NullPointerException, RuntimeException {
        assertNotNull(exception, "exception!");
        assertNotNull(errorMessage, "errorMessage!");

        if (!testCondition) {
            try {
                throw exception.getDeclaredConstructor(String.class).newInstance(errorMessage);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
