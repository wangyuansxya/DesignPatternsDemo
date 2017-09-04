package com.wangyuan.designpatternsdemo.observers;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by wangyuan on 2017/9/4.
 *
 * 观察者对象
 *
 * 通常观察者模式会和单例一起使用，作为一个系统的观察者，来为各个页面发送通知。相当于一个事件的处理器---事件总线
 */

public class MyObserveable {

    private final ArrayList<MyObserver> arr;

    public MyObserveable(){
        arr = new ArrayList<>();
    }

    public void addOberver(MyObserver ob) {
        arr.add(ob);
    }

    public void removeOberver(MyObserver ob) {
        arr.remove(ob);
    }

    public void notifyObserver() {
        notifyObserver(null);
    }

    public void notifyObserver(String tag) {
        if(arr == null || arr.size() == 0)return;
        while (true) {
            Iterator<MyObserver> it = arr.iterator();
            if(it.hasNext()) {
                MyObserver ob = it.next();
                ob.onUpdate(tag);
            }
        }
    }


}
