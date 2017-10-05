package com.learning.day05;

/**
 * Created by kavin on 04/10/17.
 */
public interface TriFunc<T, U, V, R> {
    R apply(T t, U u, V v);
}
