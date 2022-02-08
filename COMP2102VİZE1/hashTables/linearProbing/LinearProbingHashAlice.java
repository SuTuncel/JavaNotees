package COMP2102VİZE1.hashTables.linearProbing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class LinearProbingHashAlice<Key> {
    Key[] table;
    int M;
    int N; // number of full elements
    boolean[] full;

    public LinearProbingHashAlice(int M){
        table = (Key[]) new Object[M];
        full = new boolean[M];
        this.M = M;
    }

    public int hash(Key t){
        return ((t.hashCode()&0x7fffffff) % M);

    }

    public boolean insert2(Key key){
        int i;
        int h = hash(key);
        for (i = h; table[i] != null; i = (i + 1) % M) {
            if (table[i].equals(key)) {
                return true;
            }
            if(i+1 == h) break;
        }
        table[i] = key;
        N++; // increase number of stored items
        return true;
    }


    public boolean insert(Key key){
        int ix = hash(key);
        System.out.println(" hash key: "+ix);
        // must check for a whole cycle there can be infinite loop
        int bix = ix;
        while(full[ix] && !table[ix].equals(key)){
            ix = (ix+1) % M;
            if (ix == bix){
                System.out.println("The table is full!");
                return false;
            }
        }
        if(!full[ix]){ // if an empty place is found
            table[ix] = key;
            full[ix] = true;
            N++;
            return true;
        }

        return false;   // the position is full
    }

    public String toString(){
        String s = "[";
        for(int i = 0; i < M; i++){
            s+=table[i]+",";
        }
        return s+"]";
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        LinearProbingHash<Integer> h1 = new LinearProbingHash<Integer>(6);
        java.util.Random random = new java.util.Random();
        for (int i = 1; i < 7; i++){
            Integer key = random.nextInt(100);
            System.out.print(key);
            boolean success = h1.insert(key);
            System.out.println("...table: "+h1);

            //System.out.println("...success: "+success);
        }
        */
        //System.out.println("...table: "+h1);

        LinearProbingHashAlice<String> h2 = new LinearProbingHashAlice<String>(691);
        String fname = "alice.txt";
        Scanner sc = null;
        try{
            // File is too long, we use a FileReader
            sc = new Scanner(new BufferedReader(new FileReader(fname)));


            int i = 0;
            while(sc.hasNext()){
                String s = sc.next();
                h2.insert(s);
                System.out.println((i++)+" ith word: "+s);

            }
            sc.close();
        }
        catch(Exception e){
            System.out.println("Unable to read the file!"+e);
        }

        System.out.println("...table: "+h2);

    }
}
