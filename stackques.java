import java.util.*;

class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];

    Stack() {
        top = -1;
    }

    void push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }

    void print() {
        for (int i = top; i > -1; i--) {
            System.out.print(" " + a[i]);
        }
    }
}

class stackques {
    public static void main(String args[]) {
        System.out.println("!!! Implementing Stack As Lst In First Out !!!");
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the Number Of Elements To Be Pushed into the Stack : ");
        int n = s1.nextInt();
        Stack s = new Stack();
        for (int k = 0; k < n; k++) {
            System.out.print("Enter the Number " + (k + 1) + " : ");
            int n1 = s1.nextInt();
            s.push(n1);
        }
        System.out.println("Top element is :" + s.peek());
        System.out.println(s.pop() + " Popped from stack");
        System.out.print("Elements present in stack :");
        s.print();
    }
}
