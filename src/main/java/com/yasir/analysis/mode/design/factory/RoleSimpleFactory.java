package com.yasir.analysis.mode.design.factory;

/**
 * @description: 简单工厂实现
 * @author: yasir
 * @date: 2022/3/3 10:47 下午
 * @version: V1.0
 */
public class RoleSimpleFactory {

    private RoleSimpleFactory() {}

    private static final RoleSimpleFactory INSTANCE = new RoleSimpleFactory();

    public static RoleSimpleFactory getInstance() {
        return INSTANCE;
    }

    public AbstractRole create(String name) {
        if("annie".equalsIgnoreCase(name)) {
            return new RoleForAnnie();
        } else if("jax".equalsIgnoreCase(name)) {
            return new RoleForJax();
        }
        throw new RuntimeException("create AbstractHero error");
    }

}
