package ScopeKavrami;

public class Test {
    public static void main(String[] args) {
        KapsamSinifi k = new KapsamSinifi();
        k.onileCarp();

        System.out.println("***************************************");

        KapsamSinifi2.DahiliSınıf dahili = new KapsamSinifi2().new DahiliSınıf();

        dahili.onlaCarp();
    }
}
