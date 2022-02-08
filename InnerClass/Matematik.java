package InnerClass;

import java.util.Scanner;

public class Matematik {

    private double pi = Math.PI;

    public class Factorial {
        public void faktorial() {
            Scanner su = new Scanner(System.in);
            System.out.println("Bir sayı giriniz: ");
            int num = su.nextInt();
            int fakt = 1;

            for (int i = 2; i <= num; i++) {

                fakt *= i;

            }
            System.out.println("Faktorial: " + fakt);
        }
    }

    public class Asal {
        public boolean asalMi(int num) {
            int i = 2;

            while (i < num) {

                if (num % i == 0) {
                    return false;
                }
                i++;
            }

            return true;

        }
    }

    public class Alan {

    public class Daire {

        public void daireAlan(int yaricap) {
            double alan = pi * yaricap * yaricap;
            System.out.println("Alan: " + alan);
        }

    }
}

}
