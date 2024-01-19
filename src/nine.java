public class nine {
    private String[] hatiraListesi= new String[0];
    public String baslik;



    public boolean ninemder(String veri){
        if(veri.length()==0){
            return false;
        }
        else{
            String[] hatiralistesi1= new String[hatiraListesi.length+1];
            if(hatiraListesi.length>0)
            for (int i = 0; i < hatiraListesi.length ; i++)
                hatiralistesi1[i]=hatiraListesi[i];
            hatiralistesi1[hatiraListesi.length]=veri;
            hatiraListesi=null;
            hatiraListesi=hatiralistesi1;
            return true;
            }
        }

        public String[] ninemden(){
        return hatiraListesi;
        }
        public void setBaslik(String veri){
        baslik=veri;
        }
        public String getBaslik(){
            return baslik;
        }

    }


