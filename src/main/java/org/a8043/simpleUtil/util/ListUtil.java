package org.a8043.simpleUtil.util;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * 列表工具
 */
public class ListUtil {
    /**
     * 在列表中随机获取一个元素
     * @param list 列表
     * @return 随机到的元素
     */
    public static <T> T randomElement(@NotNull List<T> list) {
        return list.get((int) (Math.random() * list.size()));
    }
}
