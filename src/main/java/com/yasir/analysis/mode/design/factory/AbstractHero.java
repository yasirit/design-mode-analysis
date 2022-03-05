package com.yasir.analysis.mode.design.factory;

/**
 * @description:
 * @author: yasir
 * @date: 2022/3/5 6:07 下午
 * @version: V1.0
 */
public abstract class AbstractHero {

    /**
     * 玩家名称
     */
    protected String name;

    /**
     * 角色
     */
    public AbstractRole role;

    /**
     *
     * 武器
     */
    public AbstractArms arms;

    /**
     * 展示
     */
    abstract void show();
}
