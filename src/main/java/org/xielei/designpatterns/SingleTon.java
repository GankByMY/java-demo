package org.xielei.designpatterns;

/**
 * 单例模式
 *
 * 通常，普通类的构造函数是公有的，外部类可以通过“new 构造函数()”来生成多个实例。
 * 但是，如果将类的构造函数设为私有的，外部类就无法调用该构造函数，也就无法生成多个实例。
 * 这时该类自身必须定义一个静态私有实例，并向外提供一个静态的公有函数用于创建或获取该静态私有实例
 *
 * 前面分析了单例模式的结构与特点，以下是它通常适用的场景的特点:
 * 1. 在应用场景中，某类只要求生成一个对象的时候，如一个班中的班长、每个人的身份证号等。
 * 2. 当对象需要被共享的场合。由于单例模式只允许创建一个对象，共享该对象可以节省内存，并加快对象访问速度。如 Web 中的配置对象、数据库的连接池等。
 * 3. 当某类需要频繁实例化，而创建的对象又频繁被销毁的时候，如多线程的线程池、网络连接池等。
 *
 * @author xielei
 */
public class SingleTon {

    /**
     * 懒加载模式
     *
     * 该模式的特点是类加载时没有生成单例，只有当第一次调用 getlnstance 方法时才去创建这个单例
     */
    static class LazySingleTon {

        private static volatile LazySingleTon lazySingleTon = null;

        private LazySingleTon() {
            System.out.println("init LazySingleTon");
        }

        public synchronized static LazySingleTon getLazySingleTon() {

            if (lazySingleTon == null) {
                lazySingleTon = new LazySingleTon();
            }
            return lazySingleTon;
        }
    }

    /**
     * 饿汉式加载
     *
     * 该模式的特点是类一旦加载就创建一个单例，保证在调用 getInstance 方法之前单例已经存在了
     */
    static class HungrySingleTon {

        private static final HungrySingleTon HUNGRY_SINGLE_TON = new HungrySingleTon();

        private HungrySingleTon() {
            System.out.println("init HungrySingleTon");
        }

        public static HungrySingleTon getHungrySingleTon() {
            return HUNGRY_SINGLE_TON;
        }
    }

}
