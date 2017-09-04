package com.wangyuan.designpatternsdemo.builder;

/**
 * Created by wangyuan on 2017/9/4.
 * 构建者模式
 * 当一个类的内部数据过于复杂的时候（通常是负责持有数据的类，比如Config、VO、PO、Entity...）
 * Builder模式可以将一个类的构建和表示进行分离。
 */

public class User {

    private String name;
    private String sex;
    private int age;

    private User(Builder builder) {
        name = builder.name;
        sex = builder.sex;
        age = builder.age;
    }


    public static class Builder {

        private String name;
        private String sex;
        private int age;

        public Builder() {
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder sex(String val) {
            sex = val;
            return this;
        }

        public Builder age(int val) {
            age = val;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

}
