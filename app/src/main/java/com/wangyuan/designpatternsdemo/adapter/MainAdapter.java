package com.wangyuan.designpatternsdemo.adapter;

/**
 * Created by wangyuan on 2017/9/4.
 * 适配器的存在，就是为了将已存在的东西（接口）转换成适合我们的需要、能被我们所利用
 * 适配器更多的是作为一个中间层来实现这种转换作用
 *
 * 适配器模式的用意是要改变源的接口，以便于目标接口相容。
 * 缺省适配的用意稍有不同，它是为了方便建立一个不平庸的适配器类而提供的一种平庸实现。
 * 在任何时候，如果不准备实现一个接口的所有方法时，就可以使用“缺省适配模式”制造一个抽象类，给出所有方法的平庸的具体实现。
 * 这样，从这个抽象类再继承下去的子类就不必实现所有的方法了。
 *
 * 在Android中ListView + Adapter的模式使用的就是缺省适配器模式
 *
 * 它的主要作用是在新接口和老接口之间进行适配
 *
 * 适配器必须实现原有的旧的接口
 2 适配器对象中持有对新接口的引用，当调用旧接口时，将这个调用委托给实现新接口的对象来处理，也就是在适配器对象中组合一个新接口。
 */

public class MainAdapter {

    public static void main(String[] args) {

    }

}
