class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

class myQueue {
    Node front;
    Node rear;
    int count;

    public myQueue() {
        front = null;
        rear = null;
        count = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int x) {
        Node newNode = new Node(x);

        if (front == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        count++;
    }

    public void dequeue() {
        if (front == null) {
            return;
        }

        front = front.next;
        count--;

        if (front == null) {
            rear = null;
        }
    }

    public int getFront() {
        if (front == null) {
            return -1;
        }

        return front.data;
    }

    public int size() {
        return count;
    }
}