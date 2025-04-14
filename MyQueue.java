public class MyQueue<T> {
    private MyArraylist<T> queue;

    public MyQueue() {
        queue = new MyArraylist<>();
    }


    public void enqueue(T item) {
        queue.addLast(item);
    }

    public T dequeue() {
        T top = queue.getFirst();
        queue.removeFirst();
        return top;
    }

    public T peek() {

        return queue.getFirst();
    }

    public void print() {
        queue.print();
    }


    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        queue.dequeue();
        queue.print();


    }
}
