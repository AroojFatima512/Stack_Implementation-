import java.util.Stack;

public class StackReverse {
    Stack <String> stack1 = new Stack<>();
    Stack <String> stack2 = new Stack<>();
    void add(String data){

        stack1.push(data);
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

    }

    void print(){
        while (!stack2.isEmpty()){
            System.out.println(stack2.pop());
        }
    }

    public static void main(String[] args) {
        StackReverse s = new StackReverse();
        s.add("h");
        s.add("e");
        s.add("l");
        s.add("l");
        s.add("o");
        s.print();
    }
}
