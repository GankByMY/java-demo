package org.xielei.designpatterns.creational.singleton;

/**
 * 单例模式
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
