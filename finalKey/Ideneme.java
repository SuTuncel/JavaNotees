package finalKey;

public interface Ideneme {
    public int a =4; // public olursa interface ile direkt erişebilirsin
    public int b= 12;
    public String deneme= "deneme";
    public final int c =6;

    public static void deneme(){ // bu metodun eklenebilmesi için statik kelimesinin bulunması lazım
        System.out.println("Deneme");
    }
}
