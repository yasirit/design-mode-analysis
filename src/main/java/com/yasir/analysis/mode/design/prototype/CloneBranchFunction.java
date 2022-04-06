package com.yasir.analysis.mode.design.prototype;

import java.util.function.Function;

/**
 * @description: 克隆分支函数
 * @author: yasir
 * @date: 2022/4/4 17:10
 * @version: V1.0
 */
@FunctionalInterface
public interface CloneBranchFunction<T, R> {

    /**
     * 分支执行
     * @param easyHandler
     * @param deepHandler
     * @param serialHandler
     * @return
     */
    Object doIt(Function<T, R> easyHandler,
                Function<T, R> deepHandler,
                Function<T, R> serialHandler);
}
