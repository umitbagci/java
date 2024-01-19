public class yemektarifi {
    public String Baslik = "";
    public int AsamaAdeti ;
    public float gram =0.0f;

    public void baslikgir(String veri){
        Baslik = veri;
    }
    public String baslikoku(){
        return Baslik;
    }

    public void  AsamaAdetiGir(int veri){
        AsamaAdeti= veri;
    }
    public int AsamaAdetiOku(){
        return  AsamaAdeti;
    }

    public void GramGir(float veri){
        gram = veri;
    }
    public float GramOku(){
        return gram;
    }
}
