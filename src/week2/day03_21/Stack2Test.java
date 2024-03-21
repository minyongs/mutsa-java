package week2.day03_21;

public class Stack2Test {
    public static void main(String[] args) {
        Stack2 stack2 = new Stack2(5);

        stack2.push(3);
        stack2.push(4);
        System.out.println(stack2.peek());
        System.out.println(stack2.isEmpty());

        stack2.getStackArray();

    }
}
