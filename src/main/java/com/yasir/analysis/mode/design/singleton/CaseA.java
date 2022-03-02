package com.yasir.analysis.mode.design.singleton;

/**
 * @description: 饿汉式，类加载阶段生成静态实例，jvm保证线程安全与唯一
 * @author: yasir
 * @date: 2022/3/2 00:46
 * @version: V1.0
 */
public class CaseA {

    //静态代码块
    /*private final static CaseOne INSTANCE;

    static {
        INSTANCE = new CaseOne();
    }*/

    private final static CaseA INSTANCE = new CaseA();

    /**
     * 构造器私有化
     */
    private CaseA() {}

    private static CaseA getInstance() {
        return INSTANCE;
    }

}
