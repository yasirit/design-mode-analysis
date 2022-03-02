package com.yasir.analysis.mode.design.singleton;

/**
 * @description:枚举单例 eddect
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
