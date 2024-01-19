public class GemiMain {
    public static void main(String[] args) {
        yolcuvapuru yolcuvapuru = new yolcuvapuru();
        ufakseyahatgemisi ufakseyahatgemisi= new ufakseyahatgemisi();
        konteynergemisi konteynergemisi = new konteynergemisi();

        String[] yolculary={"Bilal ","Sümeyye ","Berat"};
        String[] ekipy = {"Ali "," Veli"};
        String[] yolcularu = {"fikret kaygusuz", " ve Esi"};

        String[] ekipk = {"Ali","kerem","hasan","mahbube","muteber","miktad","cafer"};
        String[] rotak = {"Cin", "Endonezya", "Hindistan","Türkiye"};

        yolcuvapuru.isimgir("Yolcu Vapuru");
        yolcuvapuru.Kabinekle("Kaptan Dairesi");
        yolcuvapuru.Kabinekle("First klass");
        yolcuvapuru.Kabinekle("Kazan Dairesi");
        yolcuvapuru.Kabinekle("Yemekhane");
        yolcuvapuru.Kabinekle("A Klasse");
        yolcuvapuru.kabingoster();
        yolcuvapuru.SiradakiKabin(2);
        yolcuvapuru.ekle((short) 8, (short) 3,yolculary, ekipy,"Istanbul ", "Izmir ",);

        ufakseyahatgemisi.isimgir("ufakseyahatgemisi");
        ufakseyahatgemisi.Kabinekle("First Kabin");
        ufakseyahatgemisi.Kabinekle("Kabin 5");
        ufakseyahatgemisi.Kabinekle("G Klasse");
        ufakseyahatgemisi.Kabinekle("A Klasse");
        ufakseyahatgemisi.Kabinekle("C Klasse");
        ufakseyahatgemisi.Kabinekle("F Klasse");
        ufakseyahatgemisi.kabingoster();
        ufakseyahatgemisi.SiradakiKabin(2);
        ufakseyahatgemisi.add("Fikret Kaygusuz", "FK Esi", "XM750","Beyaz", 385.8);

        konteynergemisi.isimgir("Konteynergemisi");
        konteynergemisi.Kabinekle("Kabin 5");
        konteynergemisi.Kabinekle("G Klasse");
        konteynergemisi.Kabinekle("A Klasse");
        konteynergemisi.Kabinekle("C Klasse");
        konteynergemisi.Kabinekle("F Klasse");
        konteynergemisi.kabingoster();
        konteynergemisi.SiradakiKabin(3);
        konteynergemisi.addkont("Ali Kaptan",ekipk, (short) 5 ,rotak, "Izmir", 2, "mavi" );

        yolcuvapuru.goster();
        ufakseyahatgemisi.show();
        konteynergemisi.showkont();
    }

}
