import java.io.*;

public class Silmukka {
	public static void main(String[] args) {
		int i, luku;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  
		try {
			System.out.print("Anna kokonaisluku:");
			luku = Integer.parseInt(in.readLine());
			for(i=1; ; i++)
           {
              if(i<=luku)
                  System.out.println(i);
              else
                 break;
           }
			
		} catch(Exception e) {
			System.out.print("Antamasi syöte oli virheellinen...");
		}    
	}
}