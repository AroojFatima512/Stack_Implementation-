import java.util.Stack;
public class RecursiveReverse {
    public static void PushAtBottom(String data, Stack <String> s){
       if (s.isEmpty()){
           s.push(data);
           return;
       }
       String top = s.pop();
       PushAtBottom(data, s);
       s.push(top);
    }

    public static void Reverse(Stack<String> s){
        if(s.isEmpty()){
            return;
        }
       String top = s.pop();
        Reverse(s);
        PushAtBottom(top, s);
    }
    public static void main(String[] args) {
    Stack <String> stack = new Stack<>();
   stack.push("h");
   stack.push("e");
   stack.push("l");
   stack.push("l");
   stack.push("o");
//    PushAtBottom(4, stack);
        System.out.println(stack);
    Reverse(stack);
        System.out.println(stack);
  }
}
