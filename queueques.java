import java.util.*;

class Queue {
    private static int front, rear, capacity;
    private static int queue[];

    Queue(int c) {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }

    static void queueEnqueue(int data) {
        if (capacity == rear) {
            System.out.printf("\nQueue is full\n");
        } else {
            queue[rear] = data;
            rear++;
            System.out.println(data + " pushed into Queue");
        }
    }

    static void queueDequeue() {
        if (front == rear) {
            System.out.printf("\nQueue is empty\n");
        } else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            if (rear < capacity) {
                queue[rear] = 0;
                rear--;
            }
        }
    }

    static void queueDisplay() {
        int i;
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
        }
        for (i = front; i < rear; i++) {
            System.out.printf(" %d <-- ", queue[i]);
        }
    }

    static void queueFront() {
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
        }
        System.out.printf("\nFront Element is: %d", queue[front]);

    }
}

public class queueques {
    public static void main(String[] args) {
        System.out.println("!!! Implementing Queue As First In First Out !!!");
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the Number Of Elements To Be Pushed into the Queue : ");
        int n = s1.nextInt();
        Queue q = new Queue(n);
        for (int k = 0; k < n; k++) {
            System.out.print("Enter the Number " + (k + 1) + " : ");
            int n1 = s1.nextInt();
            q.queueEnqueue(n1);
        }
        q.queueDisplay();
        System.out.print("\nEnter the Number Of Elements To Be Removed from the Queue : ");
        int n1 = s1.nextInt();
        for (int l = 0; l < n1; l++) {
            q.queueDequeue();
            System.out.println("Element " + (l + 1) + " Removed From Queue !!");
        }
        System.out.printf("After " + n1 + " node deletion\n");
        q.queueDisplay();
        q.queueFront();
    }
}
