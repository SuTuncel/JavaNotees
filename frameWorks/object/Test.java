package frameWorks.object;

import java.util.*;

class KucuktenBuyugePlayer implements Comparator<Player>{
    @Override
    public int compare(Player o1, Player o2) {
        return o1.compareTo(o2);
    }
}

class BuyuktenKucugePlayer implements Comparator<Player>{
    @Override
    public int compare(Player o1, Player o2) {
        return -o1.compareTo(o2);
    }
}

class KucuktenBuyugeName implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        return o1.getName().compareTo(o2.getName());

    }
}

class BuyuktenKucugeName implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        return -o1.getName().compareTo(o2.getName());

    }
}


class Player implements Comparable<Player>{

    private String name;
    private int Id;

    Player(String name, int Id){
        this.name= name;
        this.Id= Id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return Id;
    }

    public String toString(){
        return "Name: "+ name + " ID: "+ Id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return Id == player.Id && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Id);
    }

    @Override
    public int compareTo(Player o) {
        if(this.Id>o.Id){
            return 1;
        }
        else if (this.Id<o.Id){
            return -1;
        }
        else {
            return 0;
        }
    }
}

public class Test {
    public static void main(String[] args) {

        Set<Player> hashset = new HashSet<>();

        Player player1 = new Player("Mustafa", 1);
        Player player2 = new Player("Mehmet", 10);
        Player player3 = new Player("Emre", 6);
        Player player4 = new Player("Mustafa", 1);

        hashset.add(player1);
        hashset.add(player2);
        hashset.add(player3);
        hashset.add(player4);

        for(Player p: hashset){
            System.out.println(p);
        }

        System.out.println("////////////////////////////////"); //sıralama

        List<Player> list = new ArrayList<>();

        list.add(new Player("Mustafa",1));
        list.add(new Player("Ayşe",4));
        list.add(new Player("Ahmet",8));
        list.add(new Player("Su",9));
        list.add(new Player("Zehra",3));
       /* Player p1 = new Player("Murat",2);
        Player p2 = new Player("Murat",4);

        System.out.println(p1.compareTo(p2)); // p2 nin ıdsi büyük olduğu için -1 döndürür
*/
        Collections.sort(list);
         // ıdsine göre küçükten büyüğe sıraladık

        System.out.println("Compare to ile");
        for(Player p: list){
            System.out.println(p);
        }

        System.out.println("////////////////////////");

        Set<Player> tset = new TreeSet<>();

        tset.add(new Player("Mustafa",1));
        tset.add(new Player("Ayşe",4));
        tset.add(new Player("Ahmet",8));
        tset.add(new Player("Su",9));
        tset.add(new Player("Zehra",3));


        System.out.println("TreeSet ile ");
        for(Player p: tset){ // treeset bunları kendi içinde yine sıralıyor
            System.out.println(p);
        }

        System.out.println("////////////////////");

        System.out.println("Küçükten büyüğe Idye göre");

        Collections.sort(list,new KucuktenBuyugePlayer());

        for(Player p: list){
            System.out.println(p);
        }

        System.out.println("////////////////////");

        System.out.println("Büyükten  Küçüğe Idye göre");

        Collections.sort(list,new BuyuktenKucugePlayer());

        for(Player p: list){
            System.out.println(p);
        }

        System.out.println("//////////////////////////////");

        System.out.println("Küçükten büyüğe (A-Z) isim le ");

        Collections.sort(list, new KucuktenBuyugeName());
        for(Player p: list){
            System.out.println(p);
        }

        System.out.println("//////////////////////////////");

        System.out.println("Büyükten küçüğe (Z-A) isim le ");

        Collections.sort(list, new BuyuktenKucugeName());
        for(Player p: list){
            System.out.println(p);
        }

        System.out.println("// Herhangi bir class yazmadan anonim sınıf ile : ");
        System.out.println("Z-A");
        Collections.sort(list, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return -o1.getName().compareTo(o2.getName());
            }
        });

        for(Player p: list){
            System.out.println(p);
        }

    }
}
