import java.util.*;

public class StackDemo {
    public static void main(String args[])
    {

        Stack<String> STACK = new Stack<String>();


        STACK.push("1");
        STACK.push("2");
        STACK.push("3");
        STACK.push("4");
        STACK.push("+");
        STACK.push("+");
        STACK.push("+");

        int x= 1;
        int y= 2;
        int z= 3;
        int a= 4;
        int b= x+y+z+a;





        System.out.println("Initial Stack: " + STACK);
        System.out.println("Stack before operations " + STACK);
        System.out.println("Stack value brought together is " + b);

    }
}

//@ Sehaj Pandal//