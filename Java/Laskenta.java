import java.io.*;

public class Laskenta {
	public static void main(String[] args) {
		int luku;
		int eka_luku;
		int toka_luku;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  
		try {
			System.out.println("Käytössäsi on seuraavat laskutoimitukset:");
			System.out.println("1: vähennyslasku");
			System.out.println("2: yhteenlasku");
			System.out.println("3: kertolasku");
			System.out.println("4: osamäärä");
			System.out.println("5: jakojäännös");
			
			System.out.println("Valitse laskutoimitus:");
			luku = Integer.parseInt(in.readLine());
			
			switch (luku) {
				case 2:
				{
					System.out.print("Anna eka luku:");
					eka_luku = Integer.parseInt(in.readLine());
					System.out.println("Anna toka luku:");
					toka_luku = Integer.parseInt(in.readLine());
					int summa = eka_luku + toka_luku;
					System.out.println(eka_luku + "+" + toka_luku + " = " + summa);
					break;
				}
				case 1:
				{
					System.out.print("Anna eka luku:");
					eka_luku = Integer.parseInt(in.readLine());
					System.out.println("Anna toka luku:");
					toka_luku = Integer.parseInt(in.readLine());
					int erotus = eka_luku - toka_luku;
					System.out.println(eka_luku + "-" + toka_luku + " = " + erotus);
					break;
				}
				case 3:
				{
					System.out.print("Anna eka luku:");
					eka_luku = Integer.parseInt(in.readLine());
					System.out.println("Anna toka luku:");
					toka_luku = Integer.parseInt(in.readLine());
					int kerto = eka_luku * toka_luku;
					System.out.println(eka_luku + "*" + toka_luku + " = " + kerto);
					break;
				}
				case 4:
				{
					System.out.print("Anna eka luku:");
					eka_luku = Integer.parseInt(in.readLine());
					System.out.println("Anna toka luku:");
					toka_luku = Integer.parseInt(in.readLine());
					int jako = eka_luku / toka_luku;
					System.out.println(eka_luku + "/" + toka_luku + " = " + jako);
					break;
				}
				case 5:
				{
					System.out.print("Anna eka luku:");
					eka_luku = Integer.parseInt(in.readLine());
					System.out.println("Anna toka luku:");
					toka_luku = Integer.parseInt(in.readLine());
					int jakojaannos = eka_luku % toka_luku;
					System.out.println(eka_luku + "%" + toka_luku + " = " + jakojaannos);
					break;
				}
				default:{
					System.out.print("Antamasi syöte oli virheellinen...");
				}
			}
		} catch(Exception e) {
			System.out.print("Antamasi syöte oli virheellinen...");
		}    
	}
}