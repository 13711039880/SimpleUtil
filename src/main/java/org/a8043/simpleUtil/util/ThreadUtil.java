package org.a8043.simpleUtil.util;

import lombok.SneakyThrows;
import org.jetbrains.annotations.NotNull;

/**
 * 线程工具
 */
public class ThreadUtil {
    /**
     * 新线程
     * @param runnable 代码块
     * @return 线程
     */
    public static @NotNull Thread syncRun(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.start();
        return thread;
    }

    /**
     * 新线程
     * @param runnable 代码块
     * @param name 线程名
     * @return 线程
     */
    public static @NotNull Thread syncRun(Runnable runnable, String name) {
        Thread thread = new Thread(runnable);
        thread.setName(name);
        thread.start();
        return thread;
    }

    @SneakyThrows
    public static void sleep(long time) {
        Thread.sleep(time);
    }
}
