public class tarif1 extends yemektarifi {
    private int adet ;
    private float litre;

    public void adetgir( int veri){
        veri= adet;


    }
    public int adetoku(){
        return adet;
    }


    public void litregir(float veri){
        litre=veri;
    }
    public float litreoku(){
        return litre;
    }
    public void oku(){
        System.out.println("-----Nefis Yemekler-----");
        System.out.println("Yemek Adi:        "+baslikoku());
        System.out.println("toplam "+AsamaAdetiOku() + " asamada gerceklesti. ");
        System.out.println("Kac Gram pirinc kullanilmali:       "+ GramOku());
        System.out.println("Kac Adet Yumurta olmali:        "+adetoku());
        System.out.println("Kac Litre Süt Gerekir:     "+ litreoku());

    }

}
