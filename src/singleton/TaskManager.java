package singleton;


/**
 * 任务管理器 整个application 只有这一个
 */
public class TaskManager {
    private volatile static TaskManager taskManager;

    public void init() {
        System.out.println("初始化窗口");
    }

    public void displayProcess() {
        System.out.println("显示进程");
    }

    public void displayService() {
        System.out.println("显示服务");
    }

    private TaskManager() {

    }

    /**
     * 懒汉式
     *
     * @return 任务管理器
     */
    public static TaskManager getInstance() {
        if (taskManager == null) {
            synchronized (TaskManager.class) {
                /*
                 * 如果 两个线程都调用了getInstance方法,线程A先执行,线程B等待,线程A执行好后 实例创建了,但线程B并不知道
                 * ,所以还会造成实例不唯一,所以还要进行一层判断
                 */
                if (taskManager == null) {
                    taskManager = new TaskManager();
                }
            }
        }
        return taskManager;
    }
}
