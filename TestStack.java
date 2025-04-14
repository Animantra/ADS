public class TestStack {
    public static void main(String[] args){
        MyStack<Integer> stack=new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.peek());

    }
}
