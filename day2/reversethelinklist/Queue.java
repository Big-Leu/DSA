class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    // Constructor to initialize the queue
    public Queue(int size) {
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    // Method to add an element to the queue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
            return;
        }
        if (rear == maxSize - 1) {
            rear = -1; // Wrap around
        }
        queueArray[++rear] = value;
        nItems++;
    }

    // Method to remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue");
            return -1;
        }
        int temp = queueArray[front++];
        if (front == maxSize) {
            front = 0; // Wrap around
        }
        nItems--;
        return temp;
    }

    // Method to peek the front element of the queue
    public int peekFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek");
            return -1;
        }
        return queueArray[front];
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return (nItems == 0);
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return (nItems == maxSize);
    }

    // Method to print the elements of the queue
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int count = nItems;
        int i = front;
        while (count > 0) {
            System.out.print(queueArray[i] + " ");
            i = (i + 1) % maxSize;
            count--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.printQueue(); // Output: 10 20 30 40 50

        queue.dequeue();
        queue.printQueue(); // Output: 20 30 40 50

        System.out.println("Front element is: " + queue.peekFront()); // Output: Front element is: 20
    }
}