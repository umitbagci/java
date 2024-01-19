public class tarif3 extends yemektarifi {

    private int Adet ;

    public void Adetgir( int veri){
        Adet=veri;

    }
    public int Adetoku(){
        return Adet;
    }
    public void oku(){
        System.out.println("-----Nefis Yemekler-----");
        System.out.println("Yemek Adi:        "+baslikoku());
        System.out.println("Kac Asamada Gerceklesti:     "+AsamaAdetiOku());
        System.out.println("Kac Gram kullanilmali:       "+ GramOku());
        System.out.println("Kac Adet Girilmeli:        "+Adetoku());

    }
}
