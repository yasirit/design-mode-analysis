package com.yasir.analysis.mode.design.factory;

/**
 * @description: w武器工厂-枪
 * @author: yasir
 * @date: 2022/3/3 11:44 下午
 * @version: V1.0
 */
public class ArmsForGumFactory implements ArmsFactory {

    private ArmsForGumFactory() {}

    private static final ArmsForGumFactory INSTANCE = new ArmsForGumFactory();

    @Override
    public AbstractArms create(String name) {
        AbstractArms gum = new ArmsForGum(name);
        return gum;
    }

    public static ArmsForGumFactory getInstance() {
        return INSTANCE;
    }
}
