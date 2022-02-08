package InnerClass;

public class Inner4 { // anonim inner class

    public static void main(String[] args) {
        IOgrenci st = new IOgrenci() {
            @Override
            public void dersCalis() {

                System.out.println("Ders çalışıyorum");

            }

            @Override
            public void dersGir() {
                System.out.println("Derse giriyorum");

            }
        }; // süslü parantez gelmeli

        st.dersCalis();
        st.dersGir();

        System.out.println("***********************");

        AOgrenci s = new AOgrenci("Ali", 3458){
            @Override
            void kayit() {
                System.out.println("Kayıt yapıldı: "+ getIsim()+" : "+ getNumara());
            }

        };

        s.kayit();
        s.selamla();

    }

    public interface IOgrenci{

        void dersCalis();
        void dersGir();

    }

    public static abstract class AOgrenci{ // static olmazsa kullanamayız main içinde kullanılması için
       private String isim;
       private int numara;
       AOgrenci(String isim, int numara){
           this.isim= isim;
           this.numara= numara;
       }

        public String getIsim() {
            return isim;
        }

        public int getNumara() {
            return numara;
        }

        abstract void kayit();
        public void selamla(){
            System.out.println("Selamlar");
        }
    }
}
