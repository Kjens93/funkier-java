package io.github.kjens93.funkier;

/**
 * Created by kjensen on 11/26/16.
 */
@FunctionalInterface
public interface ThrowingRunnable<E extends Throwable> {
    void run() throws E;
}
