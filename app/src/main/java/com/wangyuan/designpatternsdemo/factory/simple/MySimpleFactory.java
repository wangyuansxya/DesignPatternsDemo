package com.wangyuan.designpatternsdemo.factory.simple;

import com.wangyuan.designpatternsdemo.factory.data.Bicycle;
import com.wangyuan.designpatternsdemo.factory.data.Bus;
import com.wangyuan.designpatternsdemo.factory.data.Car;

/**
 * Created by wangyuan on 2017/9/4.
 * 简单工厂模式
 * 又称静态工厂方法模式
 * 工厂类角色：这是本模式的核心，含有一定的商业逻辑和判断逻辑，用来创建产品
 */
public class MySimpleFactory {

    public static final int BUS = 1;
    public static final int BICYCLE = 2;

    //
    public Car createCar(int t) {
        Car c = null;
        switch (t) {
            case BUS:
                c = new Bus();
                break;
            case BICYCLE:
                c = new Bicycle();
                break;
            default:
                break;
        }
        return c;
    }
}
