package finalKey;

public class Database {
    //eğer Database final olursa Databaseden hiçbir alt sınıf türetülemez
  /*  public static final String user_Name="root";
    public static final String database_Name="Test" ;
    public static final String password="12345";*/

    public void baglantiKur(final String username, final String password){
       //değiştirilmesini istemediğimiz parametre varsa final yapabiliriz
        System.out.println(username);
        System.out.println(password);
    }

    public final void bag(String username,String password){

        //override edilemez
        System.out.println(username);
        System.out.println(password);
    }


}
