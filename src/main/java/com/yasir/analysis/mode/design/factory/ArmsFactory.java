package com.yasir.analysis.mode.design.factory;

/**
 * @description: 武器抽象工厂
 * @author: yasir
 * @date: 2022/3/3 11:54 下午
 * @version: V1.0
 */
public interface ArmsFactory {

    /**
     * 创建
     * @return
     */
    AbstractArms create(String name);
}
