package com.wangyuan.designpatternsdemo.factory.Abstract;

import com.wangyuan.designpatternsdemo.factory.Abstract.data.Aircondition;
import com.wangyuan.designpatternsdemo.factory.Abstract.data.Engine;

/**
 * Created by wangyuan on 2017/9/4.
 * 抽象工厂模式
 */

public interface MyAbsFactory {

    //创建发动机
    Engine createEngine();
    //创建空调
    Aircondition createAircondition();

}
