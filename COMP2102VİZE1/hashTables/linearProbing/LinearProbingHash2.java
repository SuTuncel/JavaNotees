package COMP2102VİZE1.hashTables.linearProbing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LinearProbingHash2<Key> {

    Key[] table;
    int M;
    int N; // number of full elements

    public LinearProbingHash2(int M) {
        table = (Key[]) new Object[M];
        this.M = M;
    }

    public int hash(Key t) {
        return ((t.hashCode() & 0x7fffffff) % M);
    }

    public boolean insert2(Key key) {
        int i;
        int h = hash(key);
        System.out.print(" hash: " + h);
        for (i = h; table[i] != null; i = (i + 1) % M) {
            if (table[i].equals(key)) {
                return true;
            }
            if (i + 1 == h) {
                return false; // table is full
            }
        }
        table[i] = key;
        N++; // increase number of stored items
        return true;
    }

    //contains method returns true if hash map contains the Key
    public boolean contains(Key key){
        int ix = hash(key);
        System.out.print(" hash : " + ix);
        int startIx = ix;

        while (table[ix]!=null && (ix + 1 != startIx)) {
            if (table[ix].equals(key)) return true; //found
            //if (ix + 1 == startIx) return false; // starting point
            ix = (ix + 1) % M; // cycle through
            //System.out.print(" ix : " + ix);
        }
        return false;
    }


    public boolean insert(Key key) {
        int ix = hash(key);
        System.out.print(" hash : " + ix);
        // must check for a whole cycle there can be infinite loop
        if (N == M) {
            System.out.println(" : The table is full! \n");
            return false;
        }
        while (table[ix]!=null) {
            if (table[ix].equals(key)) {
                System.out.println(" : Table has the key");
                return false;
            }
            ix = (ix + 1) % M;
        }
        // if table[ix]==null this means it is empty. Insert.
        table[ix] = key;
        N++;
        return true;
    }

    public String toString() {
        String s = "[";
        for (int i = 0; i < M; i++) {
            s += table[i] + ",";
        }
        return s + "]";
    }

    public static void main(String[] args) {

        LinearProbingHash2<String> h0 = new LinearProbingHash2<String>(5);
        h0.insert("boray");
        System.out.println(h0);
        h0.insert("berke");
        System.out.println(h0);
        h0.insert("ali");
        System.out.println(h0);

        h0.insert("ayşe");
        //h0.insert("volkan");
        System.out.println(h0);

        //h0.insert("Serdar");
        h0.insert("Boray");
        System.out.println(h0);

        LinearProbingHash2<Integer> h1 = new LinearProbingHash2<Integer>(7);
        java.util.Random random = new java.util.Random(0);
        for (int i = 1; i < 9; i++) {
            Integer key = random.nextInt(100);
            System.out.print("Key "+key);
            boolean success = h1.insert(key);
            System.out.println("...table: " + h1);
        }
        int searchKey = 53;
        System.out.print("Searching "+searchKey);
        System.out.println(" "+h1.contains(searchKey));

    }
}
