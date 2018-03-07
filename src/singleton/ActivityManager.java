package singleton;


/**
 * 静态内部类的单例模式
 */
public class ActivityManager {

    private ActivityManager() {

    }


    public static ActivityManager getInstance() {
        return InnerSingleton.instance;
    }

    private static class InnerSingleton {
        private final static ActivityManager instance = new ActivityManager();
    }
}
