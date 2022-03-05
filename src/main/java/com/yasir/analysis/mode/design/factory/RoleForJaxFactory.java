package com.yasir.analysis.mode.design.factory;

/**
 * @description: 角色工厂-贾克斯
 * @author: yasir
 * @date: 2022/3/3 11:44 下午
 * @version: V1.0
 */
public class RoleForJaxFactory implements RoleFactory {

    private RoleForJaxFactory() {}

    private static final RoleForJaxFactory INSTANCE = new RoleForJaxFactory();

    public static RoleForJaxFactory getInstance() {
        return INSTANCE;
    }

    @Override
    public AbstractRole create() {
        AbstractRole jax = new RoleForJax();
        return jax;
    }

}
