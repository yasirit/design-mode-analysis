package com.yasir.analysis.mode.design.factory;

/**
 * @description: 单例工厂
 * @author: yasir
 * @date: 2022/3/4 1:23 上午
 * @version: V1.0
 */
public interface SingletonFactory {

    /**
     * 返回单例
     * @param <T>
     * @return
     */
    <T> T getInstance();
}
