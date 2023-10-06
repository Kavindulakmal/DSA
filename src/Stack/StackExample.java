package Stack;
import java.util.Stack;


public class StackExample {
    public static void main(String[]args){
        //create stack
        Stack<String> stackofbooks = new Stack<String>();

        //pushing data to stack
        stackofbooks.push("madolduwa");
        stackofbooks.push("kaaliyugaya");
        stackofbooks.push("gamperaliya");
        stackofbooks.push("viragaya");
        stackofbooks.push("newbook01");
        stackofbooks.push("newbook02");

        //cecking if stack is empty
        //System.out.println(stackofbooks.empty());

        //to view the stack
        System.out.println(stackofbooks);

        //to remove the stack
        stackofbooks.pop();
        stackofbooks.pop();
        stackofbooks.push("lankadeepa");
        //tto view the stack
        System.out.println(stackofbooks);

        //To view of  top
        String bookAttheTop= stackofbooks.peek();
        System.out.println("tis is te top = " + bookAttheTop);
    }
}
