// Try this 6-3: A simple version of quicksort
class Quicksort {

    // Set up a call to the actual quicksort method.
    static void qsort(char[] items) {
        qs(items, 0, items.length-1);
