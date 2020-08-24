package com.lyldelove.matrix;

import java.lang.reflect.Constructor;

/**
 * @author lyldelove
 * @title Test
 * @url
 * @tag
 * @date 2020/8/21 5:57
 */
public class Test {
    public void test() throws NoSuchMethodException {
        Class<Main> mainClass = Main.class;
        System.out.println(mainClass.getName());
        System.out.println(mainClass.getCanonicalName());
        System.out.println(mainClass.getSimpleName());

        Constructor<Main> constructor = mainClass.getConstructor(int.class);
        System.out.println(constructor.getName());
    }

    public static void main(String[] args) throws NoSuchMethodException {
        new Test().test();
    }
}
