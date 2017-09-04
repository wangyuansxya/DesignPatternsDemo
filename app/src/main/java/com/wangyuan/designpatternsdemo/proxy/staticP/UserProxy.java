package com.wangyuan.designpatternsdemo.proxy.staticP;

import com.wangyuan.designpatternsdemo.builder.User;

/**
 * Created by wangyuan on 2017/9/4.
 * 静态代理
 *
 * 可以做到在不修改目标对象的功能前提下,对目标功能扩展.
 * 因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类,类太多.
 * 同时,一旦接口增加方法,目标对象与代理对象都要维护.
 */

public class UserProxy implements IUserDao {

    private IUserDao mUser;

    public UserProxy(IUserDao user){
        mUser = user;
    }

    @Override
    public void add(User user) {
        mUser.add(user);
    }

    @Override
    public void delete(int id) {
        mUser.delete(id);
    }

    @Override
    public void update(int id) {
        mUser.update(id);
    }

    @Override
    public void quey(int id) {
        mUser.quey(id);
    }
}
