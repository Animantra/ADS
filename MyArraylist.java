public class MyArraylist<T> {
    private Object[] array;
    private int size ;
    private int capacity = 5;

    public MyArraylist() {
        array = new Object[capacity];
    }

    public T get(int index) {

        return (T) array[index];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    public int LastindexOf(Object object) {
        for (int i = size-1; i >=0; i--) {
            if (array[i].equals(object)) {
                return i;
            }
        }
        return -1;
    }

    public int indexOf(Object object) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(object)) {
                return i;
            }
        }
        return -1;
    }

    public void add(T newItem) {
        if (size == capacity) {
            increaseBuffer();
        }
        array[size++] = newItem;
    }

    public void set(int index,T item){
        if(index>=size){
            System.out.println("out of bound ");
        }
        else{
        array[index]=item;
        }
    }

    public void addbyInd(int index,T item){
        if(size==capacity){
            increaseBuffer();
        }
        size++;
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = item;
    }


    public void addFirst(T item){
        if(size==capacity){
            increaseBuffer();
        }
        size++;
        System.out.println(size);

        for(int i=size;i>0;i--){
            array[i]=array[i-1];
        }
        array[0]=item;

    }

    public void addLast(T item) {
        if (size == capacity) {
            increaseBuffer();
        }
        array[size++] = item;
    }

    public void remove(int index){
        if(size>index) {
            array[index] = null;
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    public void removeFirst() {
        if (size > 0) {
            for (int i = 0; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[size - 1] = null;
            size--;
        }
    }

    public void removeLast() {
        if (size > 0) {
            array[size - 1] = null;
            size--;
        }
    }

    public void print(){
        for(int i=0;i<size;i++){
            System.out.println(array[i]);
        }
    }

    public T getFirst(){

        return (T) array[0];
    }

    public T getLast(){

        return (T) array[size-1];
    }

    private void increaseBuffer() {
        capacity = (int) (1.5 * capacity);
        Object[] array2 = new Object[capacity];
        for (int i = 0; i < size; i++) {
            array2[i] = array[i];
        }
        array = array2;
    }

}