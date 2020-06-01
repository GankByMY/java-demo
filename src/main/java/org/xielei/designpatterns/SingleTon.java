package org.xielei.designpatterns;

/**
 * 单例模式
 * @author xielei
 */
public class SingleTon {

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

    static class HungrySingleTon {

        private static final HungrySingleTon hungrySingleTon = null;

        private HungrySingleTon() {
            System.out.println("init HungrySingleTon");
        }

        public static HungrySingleTon getHungrySingleTon() {
            return hungrySingleTon;
        }
    }

}
