package ScopeKavrami;

public class KapsamSinifi2 {
    private int degisken=30;

    KapsamSinifi2(){

    }

    public void dahiliSinifa(){
        DahiliSınıf d = new DahiliSınıf();
        System.out.println(d.a); // kapsam sınıfınında içinde olduğu için a private olsa bile direkt alınabiiliyor

    }

    public class DahiliSınıf{// statik olmayan inner sınıf
        private int degisken=20; // en local bu olduğu için bunu aldı
        private int a =3;
        public void onlaCarp(){
            int degisken =10; // en en local bu olduğu için bunu alır
            for(int i =0; i<5; i++){
                System.out.println(i+" * "+degisken+" = "+ (i*degisken));
                // KapsamSinifi2 içindekini kullanamk için
                //KapsamSinifi2.this.degisken demelisin o zaman 30la çarpar
            }
        }
    }
}
