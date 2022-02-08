package Statics;

public class Seyirci {

    private String isim;

    protected static int seyircinum=0;

    Seyirci(String isim){
        this.isim=isim;
        seyircinum++;

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void oyunSeyret(){
        System.out.println(isim+ " oyun seyrediyor");
    }
}
