//package ss11_stack_queue.thuchanh.queue;
//
//public class MyLinkedListQueue {
//    public Node head;
//    public Node tail;
//
//    public MyLinkedListQueue() {
//    }
//
//    public MyLinkedListQueue(Node head, Node tail) {
//        this.head = null;
//        this.tail = null;
//    }
//    public void enqueue(int key){
//        Node temp = new Node(key);
//        if (this.tail == null){
//            this.head = this.tail = temp;
//            return;
//        }
//        this.tail.next = temp;
//        this.tail = temp;
//    }
//    public Node dequeue(int key){
//        if (this.head == null);
//        return null;
//        Node temp = this.head;
//        this.head = this.head.next;
//        if (this.head == null);
//        this.tail = null;
//        return temp;
//    }
//    public static void main(String[] args) {
//        MyLinkedListQueue queue = new MyLinkedListQueue();
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.dequeue(0);
//        queue.dequeue(0);
//        queue.enqueue(30);
//        queue.enqueue(40);
//        queue.enqueue(50);
//        System.out.println("Dequeued item is " + queue.dequeue().key);
//    }
//
//    private Node dequeue() {
//        return null;
//    }
//
//}
