import java.io.*;

public class Euro {
	public static void main(String[] args) {
		double luku;
		double markka_euroissa;
		double kerroin;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("Syötä jokin markkamäärä:");
			luku = Double.parseDouble(in.readLine());
   
			kerroin = 5.94573;
			markka_euroissa = luku / kerroin;
			System.out.print("Markat euroina: " + markka_euroissa);

		} catch(Exception e) {
			System.out.print("Antamasi syöte oli virheellinen...");
		}
	}
}