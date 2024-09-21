package org.a8043.simpleUtil.runnable;

/**
 * 可以传入1个参数的Runnable
 */
public interface Parameter1Runnable<T> {
    void run(T t);
}
