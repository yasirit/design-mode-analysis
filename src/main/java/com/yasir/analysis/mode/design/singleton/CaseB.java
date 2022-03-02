package com.yasir.analysis.mode.design.singleton;

/**
 * @description: 懒加载，使用时在实例化，搭配双重检查锁
 * @author: yasir
 * @date: 2022/3/2 12:46 上午
 * @version: V1.0
 */
public class CaseB {

    /**
     * 防止指令重排
     */
    private static volatile CaseB INSTANCE;

    /**
     * 构造器私有化
     */
    private CaseB() {}

    private static CaseB getInstance() {
        if(INSTANCE == null) {
            synchronized (CaseB.class) {
                if(INSTANCE == null) {
                    INSTANCE = new CaseB();
                }
            }
        }
        return INSTANCE;
    }

}
