package com.yasir.analysis.mode.design.factory;

/**
 * @description: 贾克斯英雄
 * @author: yasir
 * @date: 2022/3/3 10:41 下午
 * @version: V1.0
 */
public class HeroForJax extends AbstractHero {

    public HeroForJax(String name) {
        this.name = name;
    }

    @Override
    void show() {
        System.out.println("I am " + name + "；I use role of " + this.role.name + "；I use arms of " + this.arms.name);
    }

}
