package qpack;

// A character queue interface.
interface ICharQ {
    // Put a character into the queue.
    void put(char ch);

    // Get a character from the queue.
    char get();

    // Reset Queue
    void reset();
}
