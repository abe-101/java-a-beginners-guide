// An exception for queue-full errors.
public class QueueFullException extends Exeptions {
    int size;

    QueueFullException(int s) { size = s; }

    public String toString() {
        return "\nQueue is full. Maximum size is " +
                size;
    }
}
