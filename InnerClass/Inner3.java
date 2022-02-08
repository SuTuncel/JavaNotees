package InnerClass;

public class Inner3 { // lokal inner classlar ektra sınıf oluşturmama gerek kalmaz

    public static void main(String[] args) {

        class Alan{
            public void daireAlan(int radius){
                System.out.println("Alan: "+ (radius*radius*3.14));
            }

        }

        Alan alan = new Alan(); // normal obje oluşturu gibi

        alan.daireAlan(10);

    }

    public static void denemme(){


    }


}
