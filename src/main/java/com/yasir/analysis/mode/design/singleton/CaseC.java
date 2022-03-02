package com.yasir.analysis.mode.design.singleton;

import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.Objects;

/**
 * @description: 懒加载，使用静态内部类，使用时加载用时候在加载，jvm保证线程安全与唯一
 * @author: yasir
 * @date: 2022/3/2 00:46
 * @version: V1.0
 */
public class CaseC implements Serializable {

    /**
     * 构造器私有化
     */
    private CaseC() {}

    private static class CaseThreeHolder {
        public static final CaseC INSTANCE = new CaseC();
    }

    private static CaseC getInstance() {
        return CaseThreeHolder.INSTANCE;
    }

    public static void main(String[] args) {
        System.out.println(CaseC.getInstance().hashCode());
        CaseC c = CaseC.reflectToObj();
        System.out.println(Objects.isNull(c) ? null : c.hashCode());
        System.out.println(CaseC.unSerialToObj().hashCode());
    }

    /**
     * 反射生成新的实例
     */
    private static CaseC reflectToObj() {
        Constructor<CaseC> constructor = null;
        CaseC reflectObj = null;
        try {
            constructor = CaseC.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            reflectObj = constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return reflectObj;
    }

    /**
     * 反序列化生成实例
     * @return
     */
    private static CaseC unSerialToObj() {
        byte[] arr = SerializationUtils.serialize(CaseC.getInstance());
        return SerializationUtils.deserialize(arr);
    }

}
