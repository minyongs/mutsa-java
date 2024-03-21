package week2.day03_21;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(3);
        stack.push(5);

        System.out.println(stack.stackList);
        stack.pop();

        System.out.println(stack.stackList);

        stack.isEmpty();

    }
}
