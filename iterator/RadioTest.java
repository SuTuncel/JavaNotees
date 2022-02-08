package iterator;

public class RadioTest {

    public static void main(String[] args) {
        String [] array = {"RadioViva", "KralPop","RadioFenomen","MetroFm", "JoyTürk"};
        Radio radio= new Radio(array);

        for(String s: radio){
            System.out.println(s);
        }

        // ya da iterator sınıfını oluşturup yapabilirsin

    }
}
