package CreationalPatterns.Singleton;

public class SynchronizedSingleton {
    // Object declaration
    private static SynchronizedSingleton instance;

    // Private constructor
    private SynchronizedSingleton() {}

    // Synchronized keyword used
    public static synchronized SynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
}
