package com.wangyuan.designpatternsdemo.single;

/**
 * Created by wangyuan on 2017/9/4.
 * 在effective java中介绍的一种，使用枚举实现单例
 * 在Java中枚举天然实现了单例
 */
public enum MySingleControllerEnum {
    INTANCE;
    public static MySingleControllerEnum getIntance() {
        return INTANCE;
    }
}
