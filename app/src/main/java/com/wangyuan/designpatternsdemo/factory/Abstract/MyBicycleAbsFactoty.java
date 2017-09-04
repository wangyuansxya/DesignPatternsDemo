package com.wangyuan.designpatternsdemo.factory.Abstract;

import com.wangyuan.designpatternsdemo.factory.Abstract.data.Aircondition;
import com.wangyuan.designpatternsdemo.factory.Abstract.data.AirconditionA;
import com.wangyuan.designpatternsdemo.factory.Abstract.data.Engine;
import com.wangyuan.designpatternsdemo.factory.Abstract.data.EngineB;

/**
 * Created by wangyuan on 2017/9/4.
 * 具体的工厂对象
 */

public class MyBicycleAbsFactoty implements MyAbsFactory {
    @Override
    public Engine createEngine() {
        return new EngineB();
    }

    @Override
    public Aircondition createAircondition() {
        return new AirconditionA();
    }
}
