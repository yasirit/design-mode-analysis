package com.yasir.analysis.mode.design.factory;

/**
 * @description: 角色工厂-安妮
 * @author: yasir
 * @date: 2022/3/3 11:44 下午
 * @version: V1.0
 */
public class RoleForAnnieFactory implements RoleFactory {

    private RoleForAnnieFactory() {}

    private static final RoleForAnnieFactory INSTANCE = new RoleForAnnieFactory();

    public static RoleForAnnieFactory getInstance() {
        return INSTANCE;
    }

    @Override
    public AbstractRole create() {
        AbstractRole annie = new RoleForAnnie();
        return annie;
    }

}
