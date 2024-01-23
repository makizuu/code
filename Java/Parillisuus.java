import java.io.*;

public class Parillisuus {
	public static void main(String[] args) {
		int luku;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  
		try {
			System.out.print("Anna kokonaisluku: ");
			luku = Integer.parseInt(in.readLine());

			if(luku % 2 == 0)
				System.out.println("Luku " + luku + " on parillinen.");
			else
 				System.out.println("Luku " + luku + " on pariton.");
		} catch(Exception e) {
			System.out.print("Antamasi syöte oli virheellinen...");
		}    
	}
}