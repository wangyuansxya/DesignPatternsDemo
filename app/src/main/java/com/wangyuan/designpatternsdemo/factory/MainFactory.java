package com.wangyuan.designpatternsdemo.factory;

import com.wangyuan.designpatternsdemo.factory.Abstract.MyBicycleAbsFactoty;
import com.wangyuan.designpatternsdemo.factory.Abstract.MyBusAbsFactory;
import com.wangyuan.designpatternsdemo.factory.data.Bicycle;
import com.wangyuan.designpatternsdemo.factory.data.Bus;
import com.wangyuan.designpatternsdemo.factory.method.MyBicycleFactory;
import com.wangyuan.designpatternsdemo.factory.method.MyBusFactory;
import com.wangyuan.designpatternsdemo.factory.simple.MySimpleFactory;

/**
 * Created by wangyuan on 2017/9/4.
 * 客户端类
 *
 * 使用场景：一类产品有多个具体的产品族
 * 可以根据具体的场景选择使用哪种工厂模式
 */
public class MainFactory {
    public static void main(String[] args) {
        //简单工厂客户端--不符合开闭原则
        MySimpleFactory factory = new MySimpleFactory();
        Bus c1 = (Bus) factory.createCar(MySimpleFactory.BUS);
        Bicycle c2 = (Bicycle)factory.createCar(MySimpleFactory.BICYCLE);

        //工厂方法客户端--符合开闭原则，但是累的数量会越来越多
        Bus b1 = (Bus) new MyBusFactory().createCar();
        Bicycle b2 = (Bicycle)new MyBicycleFactory().createCar();

        //抽象工厂模式
        //创建公交车零件
        MyBusAbsFactory bf = new MyBusAbsFactory();
        bf.createEngine();
        bf.createAircondition();
        //创建自行车零件
        MyBicycleAbsFactoty mby = new MyBicycleAbsFactoty();
        mby.createEngine();
        mby.createAircondition();

    }
}
