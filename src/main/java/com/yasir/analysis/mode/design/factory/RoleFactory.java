package com.yasir.analysis.mode.design.factory;

/**
 * @description: 抽象工厂-角色
 * @author: yasir
 * @date: 2022/3/3 11:54 下午
 * @version: V1.0
 */
public interface RoleFactory {

    /**
     * 创建
     * @return
     */
    AbstractRole create();
}
