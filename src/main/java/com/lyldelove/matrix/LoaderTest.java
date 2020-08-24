package com.lyldelove.matrix;

/**
 * @author lyldelove
 * @title LoaderTest
 * @url
 * @tag
 * @date 2020/8/25 6:30
 */

public class LoaderTest {
    public LoaderTest() {
    }

    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader loader = Test.class.getClassLoader();
        System.out.println(loader);
        //使用ClassLoader.loadClass()来加载类，不会执行初始化块
        loader.loadClass("Test2");
        //使用Class.forName()来加载类，默认会执行初始化块
//                Class.forName("Test2");
        //使用Class.forName()来加载类，并指定ClassLoader，初始化时不执行静态块
//                Class.forName("Test2", false, loader);
    }
}

class Test2 {
    static {
        System.out.println("静态初始化块执行了！");
    }
}