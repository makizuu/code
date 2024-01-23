import java.io.*;

public class Lasku {
	public static void main(String[] args) {
		int eka_luku;
		int toka_luku;
		int summa, erotus, kerto, jakojaannos;
		double jako;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("Syötä ensimmäinen kokonaisluku:");
			eka_luku = Integer.parseInt(in.readLine());
			
			System.out.println("Syötä toinen kokonaisluku:");
			toka_luku = Integer.parseInt(in.readLine());
			
			
			summa = eka_luku + toka_luku;
			erotus = eka_luku - toka_luku;
			kerto = eka_luku * toka_luku;
			jako = (double)eka_luku / toka_luku;
			jakojaannos = eka_luku % toka_luku;
			System.out.println(eka_luku + "+" + toka_luku + " = " + summa);
			System.out.println(eka_luku + "-" + toka_luku + " = " + erotus);
			System.out.println(eka_luku + "*" + toka_luku + " = " + kerto);
			System.out.println(eka_luku + "/" + toka_luku + " = " + jako);
			System.out.println("Jakojäännös: " + jakojaannos);

		} catch(Exception e) {
			System.out.print("Antamasi syöte oli virheellinen...");
		}
	}
}