package COMP2102VİZE1.hashTables.separateChain;

public class SeparateChainHash<Item> {
    int M;
    LinkedList<Item>[] table;

    public SeparateChainHash(int M){
        table = new LinkedList[M];
        for(int ix = 0; ix < M; ix++)
            table[ix] = new LinkedList<Item>();
        this.M = M;

    }

    public int hash(Item t){
        return ((t.hashCode() & 0x7ffffff) % M);
    }

    public void insert(Item t){
        int ix = hash(t);
        //System.out.println("hash index: "+ix);

        // must check if it is there first.
        //if(!table[ix].contains(t))
        table[ix].insertFirst(t);
        //System.out.println(ix+"th chain: "+table[ix]);
    }



    public String toString(){
        String s = "";
        for (int ix = 0; ix < M; ix++){
            if (table[ix] != null)
                s+=ix+"th "+ table[ix].toString()+"\n";
        }
        return s;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        SeparateChainHash<Integer> sch = new SeparateChainHash<Integer>(5);
        java.util.Random random = new java.util.Random();
        for (int i = 0; i < 10; i++){
            Integer key = random.nextInt(10);
            //System.out.println("Key:"+key);
            sch.insert(key);
            //System.out.println("...success: "+);
            // print whole table
            System.out.println("Whole Table:\n"+sch);
        }


        //Chainhash o=for Point objects
     /*   SeparateChainHash<Point> sch2 = new SeparateChainHash<Point>(3);
        Point p1 = new Point(1,5);

        Point p5 = new Point(3,12);
        Point p2 = new Point(10,15);
        Point p3 = new Point(53,2);
        Point p4 = new Point(3,12);

        sch2.insert(p1);
        sch2.insert(p2);
        sch2.insert(p3);
        sch2.insert(p4);
        sch2.insert(p5);
        System.out.println("hash table of points: \n"+sch2.toString());
*/

    }
}
