import java.io.*;
public class Tunnit
{
  public static void main(String[] args)
  {
	  double taulukko[] = new double[31];
	  int indeksi, paivat, i;
	  double t = 0;
      double pituus;
	  
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	  
    try {
		System.out.println("Ohjelma laskee yhteen haluamasi ajanjakson aikana \ntehdyt työtunnit sekä keskimääräisen työpäivän pituuden.");
		System.out.print("Kuinka monta päivää:");
		paivat = Integer.parseInt(in.readLine());
		
		for(indeksi=0; indeksi<paivat; indeksi++) {
			System.out.print("Anna "+ (indeksi+1) + ". päivän työtunnit:");
			taulukko[indeksi] = Double.parseDouble(in.readLine());
			t = (double)t + taulukko[indeksi];
		}
		System.out.println("Tehdyt työtunnit yhteensä: " + t);
		pituus = (double)t / paivat;
		System.out.println("Keskimääräinen työpäivän pituus: " + pituus);
		System.out.print("Syötetyt tunnit: ");
        for(i=0; i<paivat; i++) {
            System.out.print(taulukko[i] + " "); 
        }
    }
    catch(Exception e){
      System.out.print("Antamasi syöte on virheellinen...");
    }
  }
}