import java.util.Stack;

public class Collections_Stack {

    // STACK - LAST IN FIRST OUT DATASTRUCTURE

    public static void main(String[] args) {

        Stack<String> x = new Stack<>();
        x.push("Saish");        // Adding elements to stack
        x.push("Pawar");
        x.push("Pro");

        System.out.println("Stack elements " + x);

        // To check element at top of the stack
        System.out.println(x.peek());

        // Popping elements
        x.pop();
        x.pop();
        System.out.println("Stack elements after pop" + x);
    }
}
