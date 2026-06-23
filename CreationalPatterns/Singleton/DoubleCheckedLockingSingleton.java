package CreationalPatterns.Singleton;

public class DoubleCheckedLockingSingleton {
    // Volatile object declaration
    private static volatile DoubleCheckedLockingSingleton instance;

    // Private constructor
    private DoubleCheckedLockingSingleton() {}

    // Thread-safe method using double-checked locking
    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}
