/*
 * Try This 5-1
 *
 * Demonstrate the buble sort.
 */

class BubbleString {
    public static void main(String[] args) {
        String[] str = {"Hello", "What's up?", "How you doing?", "Is this sorted?"};
        int a, b;
        String t;

        // display original array
        System.out.print("Original array is: ");
        for(int i=0; i < str.length; i++)
            System.out.print(" " + str[i]);
        System.out.println();

        //This is the bubble sort.
        for(a=1; a < str.length; a++)
            for(b=str.length-1; b >= a; b--) {
                if(str[b-1].compareTo(str[b]) > 0) { // if out of order
                    // exchange elements
                    t = str[b-1];
                    str[b-1] = str[b];
                    str[b] = t;
                }
            }
        // display sorted array
        System.out.print("Original array is: ");
        for(int i=0; i < str.length; i++)
            System.out.print(" " + str[i]);
        System.out.println();
    }
}
