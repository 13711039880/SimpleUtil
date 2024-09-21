package org.a8043.simpleUtil.util;

import org.jetbrains.annotations.NotNull;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间工具
 */
public class DateUtil {
    /**
     * 格式化时间
     * @param date 时间
     * @param format 格式
     * @return 格式化后的时间
     */
    public static @NotNull String formatDate(Date date, String format) {
        return new SimpleDateFormat(format).format(date);
    }

    /**
     * 格式化当前时间
     * @param format 格式
     * @return 格式化后的时间
     */
    public static @NotNull String formatDate(String format) {
        return formatDate(new Date(), format);
    }
}
