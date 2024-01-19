public class yolcuvapuru extends gemi{
    private short yolcuadeti;
    private short ekipadeti;
    private String[] yolcular;
    private String[] ekipler;
    private String kalkislimani;
    private String hedefliman;



    public void ekle(short yolcu, short ekip, String[] eyolcular, String[] eekipler,String kalkis,String hedef){
        yolcuadeti=yolcu;
        ekipadeti=ekip;
        yolcular=eyolcular;
        ekipler=eekipler;
        kalkislimani=kalkis;
        hedefliman=hedef;

    }

    public void goster(){
        System.out.println("---gemi projesi");
        System.out.println("-------" + isim+ "------");
        System.out.println("yolcu adeti :    " + yolcuadeti);
        System.out.println("Ekip Sayisi :    " + ekipadeti);
        System.out.println("-- Yolcular:   ");
        for (int i = 0; i < yolcular.length; i++) {System.out.print( yolcular[i]);}
        System.out.println(" ");
        System.out.println("-- Merettebat:    ");
        for (int i = 0; i <ekipler.length; i++) {System.out.print( ekipler[i]);}
        System.out.println("---kabin---- ");
        for (int i = 0; i < kabin.length; i++) {System.out.print(kabin[i]);}
        System.out.println("Kalis Limani:    " + kalkislimani);
        System.out.println("Varis Limani:     " + hedefliman);

    }



}
