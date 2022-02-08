package InnerClass;

public class Problem {

    public static class Mat{

        public static void daireAlan(int radius){
            double alan = radius*radius*Math.PI;

            System.out.println("Alan: "+ alan);
        }

        public static void ucgenCev(int k1, int k2, int k3){
            System.out.println("Çevre: "+ (k1+k2+k3));
        }

    }

    public static class Fizik{

        public static void icCarpım( Vec v1, Vec v2){

            int i= v1.getI()* v2.getI();
            int j = v1.getJ()*v2.getJ();
            int k = v1.getK()*v2.getK();
            int sonuc = i+j+k;
            System.out.println(v1.getIsim()+ " ve "+ v2.getIsim()+ " iç çarpım sonucu: "+ sonuc);

        }

    }
}
