public class Main {
    public static void main(String[] args) {
      tarif1  muhallebi = new tarif1();
      tarif2 corba = new tarif2();
      tarif3 imambayildi = new tarif3();


      muhallebi.baslikgir("Muhallebi Tarifi");
      muhallebi.AsamaAdetiGir(3);
      muhallebi.GramGir(3.5f);
      muhallebi.adetgir(3);
      muhallebi.litregir(0.5f);

      corba.baslikgir(" Corba Tarifi");
      corba.AsamaAdetiGir(4);
      corba.GramGir(250.0f);
      corba.LitreGir(2.2f);

      imambayildi.baslikgir("Imam Bayildi");
      imambayildi.AsamaAdetiGir(4);
      imambayildi.GramGir(600.0f);
      imambayildi.Adetgir(2);

      muhallebi.oku();
      corba.oku();
      imambayildi.oku();

    }
}
