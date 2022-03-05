package com.yasir.analysis.mode.design.factory;

/**
 * @description: 英雄工厂-贾克斯
 * @author: yasir
 * @date: 2022/3/4 12:19 上午
 * @version: V1.0
 */
public class HeroForJaxFactory implements HeroFactory {

    private HeroForJaxFactory () {}

    private static final HeroForJaxFactory INSTANCE = new HeroForJaxFactory();

    public static  HeroForJaxFactory getInstance(){
        return INSTANCE;
    }

    @Override
    public HeroForJax create(String name) {
        //创建英雄
        HeroForJax jax = new HeroForJax(name);
        //创建角色工厂
        //生产贾克斯角色
        RoleForJaxFactory roleForJaxFactory = RoleForJaxFactory.getInstance();
        AbstractRole role = roleForJaxFactory.create();
        jax.role = role;
        //创建武器工厂
        ArmsForGumFactory armsForGumFactory = ArmsForGumFactory.getInstance();
        AbstractArms arms = armsForGumFactory.create("ak47");
        jax.arms = arms;
        return jax;
    }


}
