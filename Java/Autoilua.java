import java.io.*;

class Ajoneuvo{

    private int paino;
    private int huippunopeus;
    private int ajetut_kilometrit;

    Ajoneuvo(int paino, int huippunopeus, int ajetut_kilometrit){
        this.paino = paino;
        this.huippunopeus = huippunopeus;
        this.ajetut_kilometrit = ajetut_kilometrit;
    }

    protected void aja(int ajettava_matka){
        this.ajetut_kilometrit += ajettava_matka;
    }

    protected int anna_paino(){
        return this.paino;
    }

    protected int anna_huippunopeus(){
        return this.huippunopeus;
    }

   protected int anna_ajetut_kilometrit(){
        return this.ajetut_kilometrit;
    }
}


class Auto extends Ajoneuvo
{
    String merkki;
    String malli;
    String rekisteri_nro;
    boolean kaynnissa;

    Auto(int paino, int huippunopeus, int ajetut_kilometrit, String merkki, String malli, String rekisteri_nro, boolean kaynnissa)
    {
        super(paino, huippunopeus, ajetut_kilometrit);
        this.merkki = merkki;
        this.malli = malli;
        this.rekisteri_nro = rekisteri_nro;
        this.kaynnissa = kaynnissa;
    }

    public void kaynnista()
    {
        if(kaynnissa != true){
            kaynnissa = true;
            return;
        }
        else{
            return;
        }
    }

    public void sammuta()
    {
        if(kaynnissa != false){
            kaynnissa = false;
            return;
        }
        else{
            return;
        }
    }

    public void katsasta()
    {
        String tuloste;
        if(kaynnissa == true){
            tuloste = "Auto on käynnissä";
        }
        else{
            tuloste = "Auto ei ole käynnissä";
        }
        System.out.println("Auton tiedot: \nMerkki: " + merkki + "\nMalli: " + malli + "\nAjokilometrit: " + anna_ajetut_kilometrit() + "\nPaino (kg): " + anna_paino() + "\nHuippunopeus (km/h): " + anna_huippunopeus() + "\nRekisterinumero: " + rekisteri_nro);
        System.out.println(tuloste);
    }
}
public class Autoilua
{
   public static void main(String[] args)
   {

      BufferedReader lukija = new BufferedReader(new InputStreamReader(System.in));
      int paino, nopeus, km;
      String merkki, malli, rekkari;
      try
      {
         System.out.println("Anna auton merkki:");
         merkki = lukija.readLine();
         System.out.println("Anna auton malli:");
         malli = lukija.readLine();
         System.out.println("Anna auton rekisterinumero:");
         rekkari = lukija.readLine();
         System.out.println("Anna auton paino:");
         paino = Integer.parseInt(lukija.readLine());
         System.out.println("Anna auton huippunopeus:");
         nopeus = Integer.parseInt(lukija.readLine());
         System.out.println("Anna autolla ajetut kilometrit:");
         km = Integer.parseInt(lukija.readLine());
         System.out.println("\n");

         Auto autoX = new Auto(paino, nopeus, km, merkki, malli, rekkari, false);

         autoX.katsasta();
         autoX.kaynnista();
         autoX.aja(95);
         System.out.print("\n\n");

         autoX.katsasta();
      }
      catch (Exception e)
      {
         System.out.println("Virhetilanne!");
      }
   }
}