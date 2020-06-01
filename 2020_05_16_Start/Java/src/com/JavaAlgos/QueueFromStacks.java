package com.JavaAlgos;
/*
* Q: Create a Queue from two stacks. It should implement the methods: "add",
* "remove", and "peek"
* */
public class QueueFromStacks {
    public static void main(String[] args){
        QueueFromStacks things = new QueueFromStacks();
        things.add(1);
        things.add(2);
        things.add(3);
        things.add(4);
        System.out.println(things.peek());
        System.out.println(things.remove());
        System.out.println(things.remove());
        System.out.println(things.remove());
        System.out.println(things.remove());
    }

    private StackImplementation stack1;
    private StackImplementation stack2;

    public QueueFromStacks(){
        this.stack1 = new StackImplementation();
        this.stack2 = new StackImplementation();
    }

    public void add(int item){
        this.stack1.push(item);
    }

    public Integer remove(){
        while(stack1.peek() != null){
            stack2.push(stack1.pop());
        }
        Integer valueToReturn = stack2.pop();
        while(stack2.peek() != null){
            stack1.push(stack2.pop());
        }
        return valueToReturn;
    }

    public Integer peek(){
        while(stack1.peek() != null){
            stack2.push(stack1.pop());
        }
        Integer valueToReturn = stack2.peek();
        while(stack2.peek() != null){
            stack1.push(stack2.pop());
        }
        return valueToReturn;
    }
}
