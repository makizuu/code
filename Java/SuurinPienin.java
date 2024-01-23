import java.io.*;
public class SuurinPienin
{
  public static void main(String[] args)
  {
    int luku1, luku2, luku3, suurin, pienin;
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    try {
      System.out.print("Syötä ensimmäinen kokonaisluku: ");
      luku1 = Integer.parseInt(in.readLine());

      System.out.print("Syötä toinen kokonaisluku: ");
      luku2 = Integer.parseInt(in.readLine());

      System.out.print("Syötä kolmas kokonaisluku: ");
      luku3 = Integer.parseInt(in.readLine());

      suurin = suurin(luku1, luku2, luku3);
      pienin = pienin(luku1, luku2, luku3);

      System.out.print("Syöttämistäsi luvuista suurin oli " +suurin);
      System.out.print(" ja pienin " +pienin + "\n");
    }
    catch(Exception e){
      System.out.print("Antamasi syöte on virheellinen...");
    }
  }


public static int suurin(int luku1, int luku2, int luku3)
{
	int vastaus;
	if (luku1 > luku2 && luku1 > luku3)
		vastaus = luku1;
	else if(luku2 > luku1 && luku2 > luku3)
		vastaus = luku2;
	else
		vastaus = luku3;
	return vastaus;
}
public static int pienin(int luku1, int luku2, int luku3)
{
	int vastaus;
	if (luku1 < luku2 && luku1 < luku3)
		vastaus = luku1;
	else if(luku2 < luku1 && luku2 < luku3)
		vastaus = luku2;
	else
		vastaus = luku3;
	return vastaus;
}
}