public class anne extends nine {
    private String[] ogutlistesi= new String[0];
    public String annesozu;

    public boolean annemder(String veri){
        if(veri.length()==0){
        return false;}
        else{
            String[] ogutlistesi1 = new String[ogutlistesi.length+1];
            if (ogutlistesi.length>0)
            for (int i = 0; i <ogutlistesi.length; i++) {
               ogutlistesi1[i]=ogutlistesi[i];
            }
            ogutlistesi1[ogutlistesi.length]=veri;
            // *** //
            ogutlistesi = null;
            ogutlistesi = ogutlistesi1;
            // *** //
            return true;
        }
    }

    public String [] annemden(){
        return ogutlistesi;
    }

    public void setAnnesozu(String veri){
        annesozu=veri;
    }
    public String getAnnesozu(){
        return annesozu;
    }
}
