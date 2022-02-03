// An improved queue class for characters.
class Stack {
    // these members are now private
    private char[] stck; // this array holds the queue
    private int tos; // the put and get indies

    Stack(int size) {
        stck = new char[size]; // allocate memory for queue
        tos = 0;
    }
    
    // construct a stack from a stack.
    Stack(Stack ob) {
        tos = ob.tos;
        stck = new char[ob.stck.length];
    
        // copy elements
        for(int i=0; i < tos; i++)
            stck[i] = ob.stck[i];
    
    }

    // construct a stack with initial values.
    Stack(char [] a) {
        stck = new char[a.length];

        for(int i=0; i < a.length; i++)
            push(a[i]);
    }

    // push character into the stack
    void push(char ch) {
        if(tos==stck.length) {
            System.out.println(" - Stack is full.");
            return;
        }

        stck[tos] = ch;
        tos++;
    }

    // pop a character from the stack
    char pop() {
        if(tos == 0) {
            System.out.println(" - Stack is empty.");
            return (char) 0;
        }

        tos--;
        return stck[tos];
    }
}

// Demonstrate the Stack class.
class StackDemo {
    public static void main(String[] args) {
        Stack bigS = new Stack(100);
        Stack smallS = new Stack(4);
        char ch;
        int i;

        System.out.println("Using bigS to store the alphabet.");
        // put some numbers into bigS
        for(i=0; i < 26; i++)
            bigS.push((char) ('A' + i));

        // retrieve and display elements from bigS
        System.out.print("Contents of bigS; ");
        for(i=0; i < 26; i++) {
            ch = bigS.pop();
            if(ch != (char) 0) System.out.print(ch);
        }

        System.out.println("\n");


        System.out.println("Using smallS to generate errors.");
        // Now, use smallS to generate some errors
        for(i=0; i < 5; i++) {
            System.out.print("Attempting to store " + (char) ('Z' - i));

            smallS.push((char) ('Z' - i));

            System.out.println();
        }
        System.out.println();

        // more errors on smallS
        System.out.print("Contents of smallS: ");
        for(i=0; i < 5; i++) {
            ch = smallS.pop();

            if(ch != (char) 0) System.out.print(ch);
        }
    }
}
