package JavaStudy.Study.Study0619;

public class SingletonLazy {
    // 1. 需要保存该类唯一对象的引用
    private static SingletonLazy instance = null;

    public synchronized static SingletonLazy getInstance() {
        // getInstance 被调用的时候，代表有人需要
        // 该类的对象了
        // 所以应该实例出对象出来了 —— 按需加载

        /*
        if (instance == null) {
            // 代表对象还没有被初始化
            // 需要先初始化
            instance = new SingletonLazy();
            return instance;
        } else {
            // 代表 instance 已经指向了一个对象了
            // 所以我们不需要实例化对象了
            // 直接返回该对象的引用即可
            return instance;
        }
        */
        if (instance == null) {
            instance = new SingletonLazy();
        }

        return instance;
    }

    private SingletonLazy() {
    }
}
