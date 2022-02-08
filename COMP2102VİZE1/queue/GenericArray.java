package COMP2102VİZE1.queue;

public class GenericArray<E extends Comparable<E>> {
    public E[] queue;
    public int N; // num of elements iin queue
    public int first;
    public int last;

    GenericArray(int size){
        queue=(E[]) new Comparable[size];
        first=0;
        last =0;
    }

    public boolean isEmpty(){
        return N==0;
    }

    public void enqueue(E data){
        if(N== queue.length){
            resize(2* queue.length);
        }
        queue[last++]=data;

        if(last== queue.length){
            last=0;
        }
        N++;
    }

    public E dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        E item = queue[first];
        queue[first]= null;
        first++;
        N--;

        if (first== queue.length || queue[first]==null) {
            first = 0;
        }
        if(N>0 && N == queue.length/4){
            resize(queue.length/2);
        }

        return item;
    }


    public void resize(int size){
        if(size<=N){
            System.out.println("Invalid size: "+ size);
        }
        E[] temp =(E[]) new Object[size];

        for(int i =0; i< N; i++ ){
            temp[i]=queue[(first+i)% queue.length];
        }
        queue=temp.clone();
        first=0;
        last=N;
    }

    public String toString(){
        String s =" ";

        for(int i =0; i< queue.length; i++){
            s+= queue[i]+ " ";
        }

        return s;
    }

    public E qetMax(){
        E max = queue[0];

        for (int i =0; i< queue.length; i++){
            int comp= queue[i].compareTo(max); // 0 ise eşit queue[i] küçükse 0dan küçük queue[i] büyükse 0dan büyük

            if(comp>0){
                max=queue[i];
            }
        }
        return max;
    }

}
