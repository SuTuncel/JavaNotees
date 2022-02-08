package InnerClass;

public class Matematik2 {

    private final static double pi = 3.14; // static yapmazsak daireAlan metodunun içinde kullanılmaz

    public static class Alan{

        public static void daireAlan(int yaricap){

            double alan = yaricap*yaricap*pi;
            System.out.println("Alan: "+alan);

        }

    }
}
