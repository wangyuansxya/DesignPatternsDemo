package com.wangyuan.designpatternsdemo.factory.method;

import com.wangyuan.designpatternsdemo.factory.data.Bicycle;
import com.wangyuan.designpatternsdemo.factory.data.Car;

/**
 * Created by wangyuan on 2017/9/4.
 */

public class MyBicycleFactory implements MyAbsMethodFactory {
    @Override
    public Car createCar() {
        return new Bicycle();
    }
}
