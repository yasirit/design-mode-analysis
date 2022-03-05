package com.yasir.analysis.mode.design.factory;

/**
 * @description: 英雄抽象工厂
 * @author: yasir
 * @date: 2022/3/3 11:54 下午
 * @version: V1.0
 */
public interface HeroFactory {

    /**
     * 创建英雄
     * @return
     */
    AbstractHero create(String name);
}
