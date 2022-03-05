package com.yasir.analysis.mode.design.factory;

/**
 * @description: 武器工厂-刀
 * @author: yasir
 * @date: 2022/3/3 11:44 下午
 * @version: V1.0
 */
public class ArmsForKnifeFactory implements ArmsFactory {

    private ArmsForKnifeFactory() {}

    private static final ArmsForKnifeFactory INSTANCE = new ArmsForKnifeFactory();

    @Override
    public AbstractArms create(String name) {
        AbstractArms knife = new ArmsForKnife(name);
        return knife;
    }

    public static ArmsForKnifeFactory getInstance() {
        return INSTANCE;
    }
}
