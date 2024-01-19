public class tarif2 extends yemektarifi{

    private float litre;
    public void LitreGir(float veri){
        litre=veri;
    }
    public float LitreOku(){
        return litre;
    }

    public void oku(){
        System.out.println("-----Nefis Yemekler-----");
        System.out.println("Yemek Adi:        "+baslikoku());
        System.out.println("Kac Asamada Gerceklesti:     "+AsamaAdetiOku());
        System.out.println("Kac Gram kullanilmali:       "+ GramOku());
        System.out.println("Kac Litre Gerekir:     "+ LitreOku());

    }

}
