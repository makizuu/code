import java.io.*;

public class Ala {
	public static void main(String[] args) {
		double luku;
		double pinta_ala;
		double pii;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("Anna ympyrän säde:");
			luku = Double.parseDouble(in.readLine());
   
			pii = 3.142;
			pinta_ala = pii * (luku * luku);
			System.out.println("Ympyrän ala annetulla säteellä: " + pinta_ala);

		} catch(Exception e) {
			System.out.println("Antamasi syöte oli virheellinen...");
		}
	}
}