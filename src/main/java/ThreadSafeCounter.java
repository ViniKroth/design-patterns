public class ThreadSafeCounter {

    private static Integer counter;

    private ThreadSafeCounter() {
    }

    public synchronized static Integer nextInteger() {
        if (counter == null) {
            counter = 1;
            return counter;
        } else {
            counter++;
            return counter;
        }
    }

}
