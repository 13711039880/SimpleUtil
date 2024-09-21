package org.a8043.simpleUtil.runnable;

/**
 * 可以传入2个参数的Runnable
 */
public interface Parameter2Runnable<T, U> {
    void run(T t, U u);
}
