package COMP2102VİZE1.stacks;

public class StackwArray {
    public int[] array;
    public int top;

   public StackwArray(int N){
        array= new int[N];
        top=-1;
    }

    public boolean isFull(){
       return top== array.length-1;
    }

    public boolean isEmpty(){
       return top==-1;
    }

    public void push(int num){
       if(!isFull()){
           top++;
           array[top]= num;
       }
    }

    public int pop(){

       top--;
          return array[top+1];



      //return -40000; // null intde dönmediği için böyle yaptık
    }

    public int top(){
       return array[top]; // en sondaki sayıya dönecek
    }


    public String toString(){
       StringBuilder s= new StringBuilder(" ");

       for (int i=0; i< array.length; i++){
           s.append(array[i]).append(" ");
       }

       return s.toString();
    }


    public static void main(String[] args) {

       StackwArray stackwArray= new StackwArray(6);

        stackwArray.push(7);
        stackwArray.push(5);
        stackwArray.push(8);
        stackwArray.push(2);
        stackwArray.push(9);
        stackwArray.push(4);
        stackwArray.pop();
        stackwArray.pop();
        stackwArray.pop();
        System.out.println(stackwArray);
        System.out.println(stackwArray.top());


        /*System.out.println("Number: "+stackwArray.pop());
        stackwArray.push(11);
        System.out.println("Number: "+stackwArray.pop());
        System.out.println("My Array: "+ stackwArray);
        System.out.println("Number: "+stackwArray.pop());
        System.out.println("My Array: "+ stackwArray);
        System.out.println("Number: "+stackwArray.pop());
        System.out.println("My Array: "+ stackwArray);
        System.out.println("Top: "+stackwArray.top());
        System.out.println("is Full: "+stackwArray.isFull());
        System.out.println("is Empty: "+stackwArray.isEmpty());
        System.out.println("My Array: "+ stackwArray);*/



    }










}

