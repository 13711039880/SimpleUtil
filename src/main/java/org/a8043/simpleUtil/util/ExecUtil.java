package org.a8043.simpleUtil.util;

import lombok.SneakyThrows;

import java.io.IOException;

/**
 * Exec工具
 */
public class ExecUtil {
    /**
     * 执行命令
     * @param command 命令
     * @return Process
     * @throws IOException 异常
     */
    public static Process exec(String command) throws IOException {
        return Runtime.getRuntime().exec(command);
    }
}
