public class MyStack<T> {
    private MyArraylist<T> list;

    public MyStack() {
        list = new MyArraylist<>();
    }

    public void push(T item) {
        list.addLast(item);
    }

    public T pop() {
        T top = list.getLast();
        list.removeLast();
        return top;
    }

    public T peek() {
        return list.getLast();
    }

    public boolean isEmpty() {
        return list.getFirst() == null;
    }



    public void clear() {
        list.clear();
    }

    public void print() {
        list.print();
    }
}
