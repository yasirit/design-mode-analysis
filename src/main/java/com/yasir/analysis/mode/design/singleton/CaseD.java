package com.yasir.analysis.mode.design.singleton;

/**
 * @description:枚举单例 枚举类表明一组常量，每一个成员都默认被private、final、stastic修饰，所以，类加载阶段就生成了唯一实例；
 * @author: yasir
 * @date: 2022/3/2 1:09 上午
 * @version: V1.0
 */
public enum CaseD {
    INSTANCE;

    public void doIt(String a, String b) {
        System.out.println(a.concat(b));
    }

    public static void main(String[] args) {
        System.out.println(CaseD.INSTANCE.hashCode());
        CaseD.INSTANCE.doIt("1", "2");
    }
}
