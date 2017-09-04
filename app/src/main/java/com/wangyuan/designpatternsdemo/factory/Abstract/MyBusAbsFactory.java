package com.wangyuan.designpatternsdemo.factory.Abstract;

import com.wangyuan.designpatternsdemo.factory.Abstract.data.Aircondition;
import com.wangyuan.designpatternsdemo.factory.Abstract.data.AirconditionB;
import com.wangyuan.designpatternsdemo.factory.Abstract.data.Engine;
import com.wangyuan.designpatternsdemo.factory.Abstract.data.EngineA;

/**
 * Created by wangyuan on 2017/9/4.
 * 具体的工厂对象，可以组装不同的零件
 */

public class MyBusAbsFactory implements MyAbsFactory {
    @Override
    public Engine createEngine() {
        return new EngineA();
    }

    @Override
    public Aircondition createAircondition() {
        return new AirconditionB();
    }
}
