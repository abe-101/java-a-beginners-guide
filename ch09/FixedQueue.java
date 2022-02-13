// A fixed-sized queue class for characters.
public class FixedQueue implements ICharQ {
    private char[] q; // this array holds the queue
    private int putloc, getloc; // the put and get indices

    // Construct an empty queue given its size.
    public FixedQueue(int size) {
        q = new char[size]; // alocate memory for queue
        putloc = getloc = 0;
    }

    // Put characters into the queue.
    public void put(char ch) 
        throws QueueFullException {

        if(putloc==q.length) 
            throw new QueueFullException(q.length);

        q[putloc++] = ch;
    }

    // Get a character from the queue
    public char get() 
        throws QueueEmptyException {

        if(getloc == putloc) 
           throw new QueueEmptyException();

        return q[getloc++];
    }
}

