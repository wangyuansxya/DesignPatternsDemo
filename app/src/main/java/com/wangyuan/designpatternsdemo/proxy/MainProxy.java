package com.wangyuan.designpatternsdemo.proxy;

import com.wangyuan.designpatternsdemo.builder.User;
import com.wangyuan.designpatternsdemo.proxy.DynamicP.DynamicPorxy;
import com.wangyuan.designpatternsdemo.proxy.staticP.IUserDao;
import com.wangyuan.designpatternsdemo.proxy.staticP.UserDao;
import com.wangyuan.designpatternsdemo.proxy.staticP.UserProxy;

/**
 * Created by wangyuan on 2017/9/4.
 * 代理模式
 * 这里使用到编程中的一个思想:不要随意去修改别人已经写好的代码或者方法,如果需改修改,可以通过代理的方式来扩展该方法
 *
 */

public class MainProxy {
    public static void main(String[] args) {
        //1，静态代理模式
        ///目标对象
        UserDao user = new UserDao();
        //代理对象,把目标对象传给代理对象,建立代理关系
        UserProxy proxy = new UserProxy(user);
        //执行的是代理的方法
        proxy.add(new User.Builder().build());


        //2,动态代理模式
        DynamicPorxy p = new DynamicPorxy(user);
        IUserDao userDao = (UserDao) p.getProxyInstance();
        userDao.add(new User.Builder().build());
    }
}
