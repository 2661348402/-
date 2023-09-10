package summer_day09;
/*
 * 泛型类：把泛型定义在类上
 * 泛型方法：把泛型定义在方法上(这个时候与泛型类无关！)
 * 泛型接口：把泛型定义在接口上:
 * 第一种情况：已经知道该是什么类型的了(用得比较少)
 * public class InterImpl implements Inter<String> 
 * 第二种情况：还不知道是什么类型的(这种情况最常见，推荐使用，说白了，就是用泛型类实现泛型接口)
 * public class InterImpl<T> implements Inter<T>
 * 泛型高级(通配符)
 ?:任意类型，如果没有明确，那么就是Object以及任意的Java类了
 ? extends E:向下限定，E及其子类
 ? super E:向上限定，E及其父类

 *
 */

public class 泛型 {

}
