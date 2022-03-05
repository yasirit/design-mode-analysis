package com.yasir.analysis.mode.design.factory;

/**
 * @description: 英雄工厂-安妮
 * @author: yasir
 * @date: 2022/3/4 12:19 上午
 * @version: V1.0
 */
public class HeroForAnnieFactory implements HeroFactory {

    private HeroForAnnieFactory () {}

    private static final HeroForAnnieFactory INSTANCE = new HeroForAnnieFactory();

    public static  HeroForAnnieFactory getInstance(){
        return INSTANCE;
    }

    @Override
    public AbstractHero create(String name) {
        //创建英雄
        HeroForAnnie annie = new HeroForAnnie(name);
        //创建角色工厂
        //生产安妮角色
        RoleForAnnieFactory roleForAnnieFactory = RoleForAnnieFactory.getInstance();
        AbstractRole role = roleForAnnieFactory.create();
        annie.role = role;
        //创建武器工厂
        ArmsForKnifeFactory armsForKnifeFactory = ArmsForKnifeFactory.getInstance();
        AbstractArms arms = armsForKnifeFactory.create("尼泊尔");
        annie.arms = arms;
        return annie;
    }

}
