package com.yasir.analysis.mode.design.factory;

/**
 * @description: 测试用例
 * @author: yasir
 * @date: 2022/3/4 12:43 上午
 * @version: V1.0
 */
public class FactoryMain {
     public static void main(String[] args) {
         simpleFactoryTest();
         factoryMethodTest();
         abstractFactoryTest();
     }
    /**
     * 一个工厂，n个产品
     */
     private static void simpleFactoryTest() {
         RoleSimpleFactory factory = new RoleSimpleFactory();
         AbstractRole annie = factory.create("annie");
         AbstractRole jax = factory.create("jax");
         System.out.println(annie.hashCode());
         System.out.println(jax.hashCode());
     }

    /**
     * 一个抽象工厂，n个实例工厂，m个产品
     */
     private static void factoryMethodTest() {
         RoleFactory roleForAnnieFactory = RoleForAnnieFactory.getInstance();
         AbstractRole roleForAnnie1 = roleForAnnieFactory.create();
         AbstractRole roleForAnnie2 = roleForAnnieFactory.create();
         System.out.println(roleForAnnie1.hashCode());
         System.out.println(roleForAnnie2.hashCode());
     }

    /**
     * 一个抽象工厂簇，n个抽象工厂，m个实例工厂，n*m个产品
     */
    private static void abstractFactoryTest() {
        HeroForAnnieFactory heroForAnnieFactory = HeroForAnnieFactory.getInstance();
        AbstractHero annie = heroForAnnieFactory.create("一切随风儿");
        annie.show();
        HeroForJaxFactory heroForJaxFactory = HeroForJaxFactory.getInstance();
        AbstractHero jax = heroForJaxFactory.create("一切随枫儿");
        jax.show();
    }

}
