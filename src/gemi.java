public class gemi {
    public String isim;
    private String[] kabin = new String[0];



    public boolean isimgir(String veri){

        if(veri.length() == 0)
        {
            return false;
        }
        else
        {
            isim=veri;
            return  true;
        }
    }
    protected boolean Kabinekle(String veri){
       if(veri.length() == 0)
       {
           return false;
       }
       else {
           String[] kabin1 = new String[kabin.length + 1];
           // *** //
           if(kabin.length > 0)
            for(int i = 0; i < kabin.length; i++)
                   kabin1[i] = kabin[i];
           // *** //
           kabin1[kabin.length] = veri;
           // *** //
           kabin = null;
           kabin = kabin1;
           // *** //
           return true;
       }


    }

    public String[] kabingoster(){
        return kabin;
        }



    public int KabinAdeti()
    {
        return kabin.length;
    }

    //           0        1           2        -> siraNo, Konum, Pozisyon, Endeks, yeri, mekani
    // x = [ "Kabin 1", "Kabin 2", "Kabin 3" ]
    public String SiradakiKabin(int siraNo)
    {
        if(kabin.length > 0)
        {
            if(siraNo >= 0 && siraNo < kabin.length)
                return kabin[siraNo];
        }
        return "";
    }

    /*

        if(kabinAdeti() > 0)
        {
            for(int konum = 0; konum < KabinAdeti(); konum++)
                System.out.println( SiradakiKabin(konum) );
        }

     */

    public String isimgoster(){
        return isim;
    }

}
