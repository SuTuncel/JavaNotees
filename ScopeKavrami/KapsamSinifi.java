package ScopeKavrami;

public class KapsamSinifi {
    private int privateDegisken = 30;

    public KapsamSinifi(){
        System.out.println("privateDegisken= "+ privateDegisken);
    }

    public void onileCarp(){
        int privateDegisken=10; // 30 olan değil en lokal bu olduğu için bu kullanılacak

        for(int i=0; i<5; i++){
            System.out.println(i+" * "+ privateDegisken+" = " + (i*privateDegisken));
        }
    }


}
