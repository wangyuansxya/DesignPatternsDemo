package com.wangyuan.designpatternsdemo.builder;

/**
 * Created by wangyuan on 2017/9/4.
 */

public class MainBuilder {

    public static void main(String[] args) {
        User user = new User.Builder().name("name").age(1).sex("男").build();
    }

}
