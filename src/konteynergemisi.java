public class konteynergemisi extends gemi {
    private String kaptan;
    private String[] ekipkonteyner;
    private short kontadet;
    private String[] rota;
    private String kontgemhedefliman;
    private String renk;

    private int hacim;

    public void addkont(String kaptank, String[] ekipkonteynerk, short kontadetk, String[] rotak, String kontgemhedeflimank,int hacimk,  String renkk) {
        kaptan = kaptank;
        ekipkonteyner = ekipkonteynerk;
        kontadet = kontadetk;
        rota = rotak;
        renk= renkk;
        hacim= hacimk;
        kontgemhedefliman = kontgemhedeflimank;
    }

        public void showkont(){
            System.out.println("-----gemi Projesi");
            System.out.println("-------" + isim+ "------");
            System.out.println("Kaptan:    " + kaptan);
            System.out.println(" --EKip :  ");
            for (int i = 0; i < ekipkonteyner.length ; i++) {System.out.print( ekipkonteyner[i]+" ");}
            System.out.println();
            System.out.println("Konteyner Adeti:   " + kontadet);
            System.out.println("-- Rota:  ");
            for (int i = 0; i < rota.length ; i++) {System.out.print(rota[i]+ " ");}
            System.out.println();
            System.out.println("Hedef Liman:    " + kontgemhedefliman);
        }
    }


