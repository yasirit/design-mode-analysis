package com.yasir.analysis.mode.design.prototype;

/**
 * @description:
 * @author: yasir
 * @date: 2022/4/4 16:51
 * @version: V1.0
 */
public class DeepCopyTest {
   public static void main(String[] args) throws Exception {
      Teacher t1 = new Teacher("何晨阳", 18, 2);
      Student s1 = new Student("沈益鑫", 18, 1, t1);
      System.out.println(t1.hashCode());
      System.out.println(s1.hashCode());

      //浅拷贝
      Student s2 = s1.clone(CloneTypeEnum.EASY);
      Teacher t2 = s2.getTeacher();
      System.out.println(t2.hashCode());
      System.out.println(s2.hashCode());

      //深拷贝
      Student s3 = s1.clone(CloneTypeEnum.DEEP);
      Teacher t3 = s3.getTeacher();
      System.out.println(t3.hashCode());
      System.out.println(s3.hashCode());

      //序列化
      Student s4 = s1.clone(CloneTypeEnum.SERIAL);
      Teacher t4 = s4.getTeacher();
      System.out.println(t4.hashCode());
      System.out.println(s4.hashCode());
   }
}
