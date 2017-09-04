package com.wangyuan.designpatternsdemo.factory.method;

import com.wangyuan.designpatternsdemo.factory.data.Bus;
import com.wangyuan.designpatternsdemo.factory.data.Car;

/**
 * Created by wangyuan on 2017/9/4.
 */

public class MyBusFactory implements MyAbsMethodFactory {
    @Override
    public Car createCar() {
        return new Bus();
    }
}
