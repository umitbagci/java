public class evlat extends anne{
    private String[] kafamaesenler = new String[0];
    public String adimsoyadim;
    public boolean baknedicem(String veri){
        if(veri.length()==0)
        {
            return false;

        }
        else
        {
            String[] kafamaesenler1= new String[kafamaesenler.length+1];
            if(kafamaesenler.length>0);
            for (int i = 0; i <kafamaesenler.length ; i++) {
                kafamaesenler1[i]=kafamaesenler[i];

            }
            kafamaesenler1[kafamaesenler.length]=veri;

        }
            return true;

        }

        public void nedicem(){

            System.out.println("");

        }

        public void setAdimsoyadim(String veri){
        adimsoyadim=veri;
        }
        public String getAdimsoyadim(){
        return adimsoyadim;
        }

        public void yazdir(){
            /*ninemDer();
            annemDer();
            nedicem();*/
            System.out.println("-----Muthis Hatiralar");
            System.out.println(" Adim Soyadim:    " + getAdimsoyadim());
            System.out.println("Hayallerim:    ");
            nedicem();
            System.out.println("Canim Nenem:   " + getBaslik());
            String[] yeni = ninemden();
            System.out.print("Ninemden Hatiralar:   " );
            for (int i = 0; i < yeni.length ; i++) { System.out.print(yeni[i] + ",");}
            System.out.println(" ");
            String[] yeni1  =annemden();
            //System.out.println("---> " + yeni1.length);
            System.out.println("Annemden inciler:    ");
            for (int k = 0; k < yeni1.length; k++) {System.out.print(yeni1[k] + ",");}
            System.out.println("");
            System.out.println("Canim Annem:   " + getAnnesozu());
        }
    }

