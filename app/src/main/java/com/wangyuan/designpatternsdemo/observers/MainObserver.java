package com.wangyuan.designpatternsdemo.observers;

/**
 * Created by wangyuan on 2017/9/4.
 * 观察者模式
 * 观察者模式的应用场景：
 1、 对一个对象状态的更新，需要其他对象同步更新，而且其他对象的数量动态可变。
 2、 对象仅需要将自己的更新通知给其他对象而不需要知道其他对象的细节。
 观察者模式的优点：

 1、 Subject和Observer之间是松偶合的，分别可以各自独立改变。
 2、 Subject在发送广播通知的时候，无须指定具体的Observer，Observer可以自己决定是否要订阅Subject的通知。
 3、 遵守大部分GRASP原则和常用设计原则，高内聚、低偶合。
 观察者模式的缺陷：

 1、 松偶合导致代码关系不明显，有时可能难以理解。(废话)
 2、 如果一个Subject被大量Observer订阅的话，在广播通知的时候可能会有效率问题。（毕竟只是简单的遍历）
 */

public class MainObserver {

    private static final MyObserver mo = new MyObserver() {
        @Override
        public void onUpdate(String tag) {
            System.out.print("收到通知的消息：" + tag);
        }
    };

    public static void main(String[] args) {
        MyObserveable moa = new MyObserveable();
        moa.addOberver(mo);
        moa.notifyObserver("测试观察者");
    }

}
