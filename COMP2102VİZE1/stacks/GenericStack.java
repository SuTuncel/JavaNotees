package COMP2102VİZE1.stacks;

public class GenericStack <E>{

    public E[] array;
    public int size= 10;
    public int top;

    public GenericStack(){
        array= (E[]) new Object[size];
        top=0;
    }

    public boolean isEmpty(){
        return top==0;
    }

    public boolean isFull(){
        return top== array.length;
    }

    public void push(E element){
        if(isFull()){
            resize();
        }
        array[top++]=element;

    }

    public E pop(){
        if(!isEmpty()){
           E e = array[--top];
           array[top]= null;
           return e;
        }


        return null;

    }

    public void resize(){
        array= (E[]) new Object[2*size];

    }

    public E top(){
        E e = array[--top];
        array[top++]=e;
        return e;
    }

    public E popBottom(){
        if(!isEmpty()){
            E temp = array[0];
            array[0]=null;
            for (int i=1; i<top; i++){
                array[i-1]=array[i];
            }
            array[top-1]=null;
            top--;
            return temp;
        }
        return null;
    }

    public void enlarge(int capacity) {

        E[] stackCopy = (E[]) new Object[capacity];

        for (int i = 0; i < size; i++) {
            stackCopy[i] = this.array[i];
        }

        this.array = stackCopy;
    }


    public int productPopBottom(){
        if(!isEmpty()){
            E temp1 =array[0];
            E temp2 = array[1];
            array[0]=null;
            array[1]=null;
            for (int i =2; i<top; i++){
                array[i-2]=array[i];

            }
            array[top-1]=null;
            array[top-2]= null;
            top-=2;

            return (Integer) temp1 * (Integer) temp2;


        }
        return -1;
    }

    public void moveBottomToTop() {


        if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }

        E element  = popBottom();

        this.push(element);


    }



    public String toString(){
        StringBuilder s = new StringBuilder();

        for (int i=0; i<array.length; i++){
            s.append(array[i]).append(" ");
        }

        return s.toString();

    }

    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        System.out.println(stack.toString());
        System.out.println("Top number: "+stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.toString());
       // System.out.println(stack.popBottom());
        System.out.println("Product: "+stack.productPopBottom());


    }
}
