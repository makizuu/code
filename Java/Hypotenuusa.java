import java.io.*;

public class Hypotenuusa {
	public static void main(String[] args) {
		double eka_luku, eka_luku1;
		double toka_luku, toka_luku1;
		double luku, tulos;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("Anna ensimmäinen kateetti:");
			eka_luku = Double.parseDouble(in.readLine());
			
			System.out.print("Anna toinen kateetti:");
			toka_luku = Double.parseDouble(in.readLine());
			
			luku = eka_luku * eka_luku + toka_luku * toka_luku;
			tulos = Math.sqrt(luku);
			System.out.print("Hypotenuusan pituus: " + tulos);

		} catch(Exception e) {
			System.out.print("Antamasi syöte oli virheellinen...");
		}
	}
}