package org.a8043.simpleUtil.util;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 国际化工具
 */
public class I18n {
    @Setter
    @Getter
    private File languageFolder;
    @Setter
    @Getter
    private String language;
    @Getter
    private JSONObject languageJson;

    /**
     * 构造函数
     * @param languageFolder 语言文件夹
     */
    @Contract(pure = true)
    public I18n(File languageFolder) {
        this.languageFolder = languageFolder;
    }

    /**
     * 构造函数
     * @param languageFolder 语言文件夹
     * @param language 语言
     * @throws IOException 异常
     */
    public I18n(@NotNull File languageFolder, String language) throws IOException {
        this.languageFolder = languageFolder;
        this.language = language;

        try (FileInputStream fileInputStream = new FileInputStream(languageFolder.getAbsoluteFile() + "/" + language + ".lang")) {
            languageJson = new JSONObject(new String(fileInputStream.readAllBytes()));
        }
    }

    /**
     * 构造函数
     * @param languageFolder 语言文件夹
     */
    public I18n(String languageFolder) {
        this.languageFolder = new File(languageFolder);
    }

    /**
     * 构造函数
     * @param languageFolder 语言文件夹
     * @param language 语言
     * @throws IOException 异常
     */
    public I18n(String languageFolder, String language) throws IOException {
        this.languageFolder = new File(languageFolder);
        this.language = language;

        try (FileInputStream fileInputStream = new FileInputStream(this.languageFolder.getAbsoluteFile() + "/" + language + ".lang")) {
            languageJson = new JSONObject(new String(fileInputStream.readAllBytes()));
        }
    }

    /**
     * 获取内容
     * @param path 路径
     * @return 内容
     */
    public String get(String path) {
        return String.valueOf(languageJson.get(path));
    }

    /**
     * 更新语言内容
     * @throws IOException 异常
     */
    public void updateLanguageContent() throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(this.languageFolder.getAbsoluteFile() + "/" + language + ".lang")) {
            languageJson = new JSONObject(new String(fileInputStream.readAllBytes()));
        }
    }
}
