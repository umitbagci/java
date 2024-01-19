public class ufakseyahatgemisi extends gemi{
    private String birincikisi;
    private String ikincikisi;
    private String GemiModeli;
    private String renk;
    private double yakithacmi;
    public void add(String kisi1,String kisi2, String model, String renku, double yakithacmiu ) {
        birincikisi = kisi1;
        ikincikisi = kisi2;
        GemiModeli = model;
        renk = renku;
        yakithacmi = yakithacmiu;
    }
    public void show(){
        System.out.println("------gemi projesi----");
        System.out.println("-------" + isim+ "------");
        System.out.println("Birinci Yolcu:    " + birincikisi);
        System.out.println(" Ikinci Yolcu:    " + ikincikisi);
        System.out.println(" Gemi Modeli :    " + GemiModeli);
        System.out.println(" Gemi Rengi :    " + renk);
        System.out.println("Yakit Hacmi :     " + yakithacmi);
    }
}
