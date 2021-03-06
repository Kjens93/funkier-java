package io.github.kjens93.funkier;

/**
 * Created by kjensen on 11/26/16.
 */
@FunctionalInterface
public interface ThrowingBiConsumer<T, V> {
    void accept(T obj1, V obj2) throws Exception;
}
