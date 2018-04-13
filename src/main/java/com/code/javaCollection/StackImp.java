package com.code.javaCollection;

import java.util.Stack;

/**
 * Created by prem on 4/26/2017.
 */

/*Java provides an inbuilt object type called Stack. It is a collection that is based on the last in first out (LIFO) principle. On Creation, a stack is empty.

It extends Vector class with five methods that allow a vector to be treated as a stack. The five methods are:

1. Object push(Object element) : Pushes an element on the top of the stack.

2. Object pop() : Removes and returns the top element of the stack. An ‘EmptyStackException’ exception is thrown if we call pop() when the invoking stack is empty.

3. Object peek( ) : Returns the element on the top of the stack, but does not remove it.

4. boolean empty() : It returns true if nothing is on the top of the stack. Else, returns false.

5. int search(Object element) : It determines whether an object exists in the stack. If the element is found,
it returns the position of the element from the top of the stack. Else, it returns -1.*/

public class StackImp {
    // Pushing element on the top of the stack
    static void stack_push(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    // Popping element from the top of the stack
    static void stack_pop(Stack<Integer> stack) {
        System.out.println("Pop :");

        for (int i = 0; i < 5; i++) {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }


    static void stack_peek(Stack<Integer> stack) {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top : " + element);
    }

    // Searching element in the stack
    static void stack_search(Stack<Integer> stack, int element) {
        Integer pos = (Integer) stack.search(element);

        if (pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position " + pos);
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_search(stack, 2);
        stack_search(stack, 6);
    }
}
