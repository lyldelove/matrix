package com.lyldelove.matrix;

/**
 * @author lyldelove
 * @title ClassLoaderTest
 * @url
 * @tag
 * @date 2020/8/25 6:27
 */

public class ClassLoaderTest {
    public static void main(String[] args) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        System.out.println(loader);
        System.out.println(loader.getParent());
        System.out.println(loader.getParent().getParent());
    }
}
