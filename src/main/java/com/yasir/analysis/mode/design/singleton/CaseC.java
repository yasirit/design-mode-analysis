package com.yasir.analysis.mode.design.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * @description: 懒加载，使用静态内部类，使用时加载用时候在加载，jvm保证线程安全与唯一
 * @author: yasir
 * @date: 2022/3/2 00:46
 * @version: V1.0
 */
public class CaseC implements Serializable {

    /**
     * 构造器私有化
     */
    private CaseC() {}

    private static class CaseThreeHolder {
        public static final CaseC INSTANCE = new CaseC();
    }

    private static CaseC getInstance() {
        return CaseThreeHolder.INSTANCE;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(CaseC.getInstance());
        System.out.println(CaseC.reflectToObj());
    }

    /**
     * 反射生成新的实例
     */
    private static CaseC reflectToObj() throws Exception {
        Constructor<CaseC> constructor = CaseC.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        CaseC reflectObj = constructor.newInstance();
        return reflectObj;
    }

    /**
     * 反序列化生成实例
     * @return
     */
    private static CaseC SerialToObj() {
        return null;
//        ObjectOutputStream os = new ObjectOutputStream(CaseC.getInstance().);
    }

}
