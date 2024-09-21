package org.a8043.simpleUtil.util;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * 控制台颜色工具
 */
public enum ConsoleColor {
    RESET("\u001B[0m"),
    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    PURPLE("\u001B[35m"),
    CYAN("\u001B[36m"),
    WHITE("\u001B[37m");

    private final String string;

    /**
     * 构造函数
     * @param string 颜色字符串
     */
    @Contract(pure = true)
    ConsoleColor(String string) {
        this.string = string;
    }

    /**
     * 获取颜色字符串
     * @param string 字符串
     * @param color 颜色
     * @return 带颜色的字符串
     */
    @Contract(pure = true)
    public static @NotNull String coloring(String string, @NotNull ConsoleColor color) {
        return color.string + string + RESET.string;
    }
}
