package org.a8043.simpleUtil.util;

import org.a8043.simpleUtil.runnable.Parameter1Runnable;
import org.a8043.simpleUtil.runnable.Parameter2Runnable;
import org.jetbrains.annotations.NotNull;

/**
 * 计时器
 */
public class Timing {
    private final long startTime = System.currentTimeMillis();

    /**
     * 构造函数
     */
    public Timing() {
    }

    /**
     * 获取运行时间
     * @return 运行时间
     */
    public long getTime() {
        return System.currentTimeMillis() - startTime;
    }

    /**
     * 运行代码块并返回运行时间
     * @param runnable 代码块
     * @return 运行时间
     */
    public static long runTime(@NotNull Runnable runnable) {
        Timing timing = new Timing();
        runnable.run();
        return timing.getTime();
    }

    /**
     * 运行代码块并返回运行时间
     * @param runnable 代码块
     * @param t 参数
     * @return 运行时间
     */
    public static <T> long runTime(@NotNull Parameter1Runnable<T> runnable, T t) {
        Timing timing = new Timing();
        runnable.run(t);
        return timing.getTime();
    }

    /**
     * 运行代码块并返回运行时间
     * @param runnable 代码块
     * @param t 参数1
     * @param u 参数2
     * @return
     */
    public static <T, U> long runTime(@NotNull Parameter2Runnable<T, U> runnable, T t, U u) {
        Timing timing = new Timing();
        runnable.run(t, u);
        return timing.getTime();
    }
}
