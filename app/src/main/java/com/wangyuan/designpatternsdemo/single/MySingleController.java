package com.wangyuan.designpatternsdemo.single;

/**
 * Created by wangyuan on 2017/9/4.
 * 单例模式--
 * 使用场景
 *  1.需要频繁实例化然后销毁的对象。
 2.创建对象时耗时过多或者耗资源过多，但又经常用到的对象。
 3.有状态的工具类对象。
 4.频繁访问数据库或文件的对象。
 *
 */
public class MySingleController {
    //恶汉式
    /*private static MySingleController msc = new MySingleController();

    public static MySingleController getIntance() {
        return msc;
    }*/

    //懒汉式
    /*private static MySingleController msc = null;

    public static MySingleController getIntance() {
        if(msc == null)msc = new MySingleController();
        return msc;
    }*/

    //上述的俩种方法在单线程的模式下是没有问题的。
    //如果是多线程的模式下的话需要使用锁synchronized来避免多线程问题
    /*private static MySingleController msc = null;
    public static synchronized MySingleController getIntance() {
        if(msc == null)msc = new MySingleController();
        return msc;
    }*/

    //上述方法虽然可以避免多线的问题，但是由于对整个方法使用了synchronized，因此会造成性能问题
    //所以可以进一步进行优化
    private static MySingleController msc = null;
    public static MySingleController getIntance() {
        if(msc == null){
            synchronized (MySingleController.class) {
                //这样做也是为了避免多线程环境下new出多个单例
                if(msc == null)msc = new MySingleController();
            }
        }
        return msc;
    }

}
