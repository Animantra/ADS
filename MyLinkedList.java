public class MyLinkedList<T extends Comparable<T>> {
        private MyNode<T> head;
        private MyNode<T> tail;
        private int size;

        public MyLinkedList(){
            head=null;
            tail = null;
            size=0;
        }
        private int compareTo(T a, T b) {
            return a.compareTo(b);
        }


        public void remove(int index){
            MyNode<T> current=head;
            for(int i=0;i<index;i++){
                current=current.next;
            }

            if(current.prev==null){
                head=current.next;

            }else {
                current.prev.next=current.next;
            }

            if(current.next==null){
                tail=current.prev;

            }else{
                current.next.prev=current.prev;
            }
        }
        public void removeFirst() {
            MyNode<T> current = head;
            if (head.next == null) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            size--;
        }
        public void removeLast() {
            MyNode<T> current = tail;
            if (tail.prev == null) {
                head = null;
                tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
            size--;
        }

        public int indexOf(Object object) {
            MyNode<T> current = head;
            int t = 0;
            for (int i = 0; i < size; i++) {
                if (current.data.equals(object)) {
                    return t;
                }
                current = current.next;
                t++;

            }
            return -1;
        }

        public int lastindexOf(Object object){
            MyNode<T> current=tail;
            int t=size-1;
            for(int i=size-1;i>=0;i--){
                if(current.data.equals(object)){
                    return t;
                }
                current=current.prev;
                t--;
            }
            return -1;
        }

        public boolean exists(Object object) {
            MyNode<T> current = head;
            while (current != null) {
                if (current.data.equals(object)) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }

        public void clear(){
            head = null;
            tail = null;
            size = 0;

        }


        public T getFirst(){
                MyNode<T> current=head;
                return current.data;

            }



        public T getLast() {
            MyNode<T> current = tail;
            return current.data;
        }
        public void set(int index,T item){
            MyNode<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.data=item;
        }

        public void addbyIndex(int index,T item) {

            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException("Index: " + index);
            }

            MyNode<T> newNode = new MyNode<>(item);

            if (index == 0) {
                newNode.next = head;
                head = newNode;
            }
            else {
                MyNode<T> current = head;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                newNode.next = current.next;
                current.next = newNode;
            }

            size++;
        }

        public T get(int index){
            MyNode<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            return current.data;
        }

        public void add(T item) {
            MyNode<T> newNode = new MyNode<>(item);
            if (head == null) {
                head=newNode;
                tail=newNode;
            }
            else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
            size++;
        }

        public void print(){
            MyNode<T> current=head;
            while (current!=null){
                System.out.println(current.data);
                current = current.next;
            }
        }

        public static class MyNode<E>{
            E data;
            MyNode<E> next;
            MyNode<E> prev;

            MyNode(E data){
                this.data=data;
            }
        }
}