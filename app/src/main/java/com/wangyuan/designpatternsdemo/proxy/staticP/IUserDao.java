package com.wangyuan.designpatternsdemo.proxy.staticP;

import com.wangyuan.designpatternsdemo.builder.User;

/**
 * Created by wangyuan on 2017/9/4.
 */

public interface IUserDao {

    void add(User user);
    void delete(int id);
    void update(int id);
    void quey(int id);

}
